package com.jc.provider.service;

import com.jc.provider.bean.Depart;
import com.jc.provider.repository.DepartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartServiceImpl implements DepartService {
    @Autowired
    private DepartRepository repository;

    @Override
    public boolean saveDepart(Depart depart) {
        Depart result = repository.save(depart);
        if (result != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean removeDepartById(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }

    @Override
    public boolean modifyDepart(Depart depart) {

        Depart result = repository.save(depart);
        if (result != null) {
            return true;
        }
        return false;
    }

    @Override
    public Depart getDepartById(int id) {
        if (repository.existsById(id)) {
            return repository.getOne(id);
        }
        Depart depart = new Depart();
        depart.setName("Depart is null");
        return depart;


    }

    @Override
    public List<Depart> listAllDeparts() {
        return repository.findAll();

    }
}
