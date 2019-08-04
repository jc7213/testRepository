package com.example.springboot.controller;

import com.example.springboot.entity.Student;
import com.example.springboot.entity.User;
import com.example.springboot.service.StudentService;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
/*导入user.properties文件的注解配置*/
@PropertySource(value="classpath:user.properties",encoding = "UTF-8")
public class UserController {
//    @Autowired
//    private UserService userService;
@Autowired
private User user;
@Autowired
    private StudentService studentService;
    /*读取user.properties中的属性值*/
    @Value("${company.name}")
    private String name;
    @PostMapping  (value = "/find" )
    public String findById( Integer id,Model model){
        Student stu = studentService.findById(id);
//        System.out.println(stu.toString());
        model.addAttribute("student",stu);
//        System.out.println(user);
           return "page/welcome";
    }
    @GetMapping("/countStu")
    public String findCount(Model model){

        int count=studentService.findStudentCount();
        model.addAttribute("stuCount",count);
        return "page/welcome";
    }
    @PostMapping("/saveStu")
public String  add(Student stu){
        studentService.register(stu);
        return "page/welcome";
}
@GetMapping("/first")
@ ResponseBody
public String firstHandle(){
        return  "first";
}
@ ResponseBody
@GetMapping("/second")
    public String secondHandle(){
        return  "second";
    }
}
