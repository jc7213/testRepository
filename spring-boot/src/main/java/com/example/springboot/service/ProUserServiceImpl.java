package com.example.springboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("pro")
public class ProUserServiceImpl implements  UserService {
    @Override
    public String add() {
        return "pro方法";
    }
}
