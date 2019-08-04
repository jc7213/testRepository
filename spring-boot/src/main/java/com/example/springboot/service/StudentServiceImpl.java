package com.example.springboot.service;

import com.example.springboot.dao.StudentDao;
import com.example.springboot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;


@Service
public class StudentServiceImpl implements  StudentService {
@Autowired
private StudentDao studentDao;
@Autowired
private RedisTemplate<Object,Object>redisTemplate;
@CacheEvict(value = "realTimeCache",allEntries = true)
@Transactional
    @Override
    public void register(Student stu) {
        studentDao.save(stu);
    }
/*使用双重检测锁解决热点缓存问题*/
    @Override
    public int findStudentCount() {
        //获取redis操作对象
        BoundValueOperations<Object, Object> ops= redisTemplate.boundValueOps("count");
//从缓存读取数据
        Object count=ops.get();
if(count==null){
    synchronized (this){
        count=ops.get();
        if(count==null){
            //从DB查询
            count=studentDao.findCount();
            //将查询的数据写入到Redis，并设置到期时限
            ops.set(count,10, TimeUnit.SECONDS);
        }
    }
}
        return (int)count;

    }
@Cacheable(value="realTimeCache")
    @Override
    public Student findById(int id) {

       Student student= studentDao.findById(id);
        System.out.println("service:"+student);
        return student;

    }
}
