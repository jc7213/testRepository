package com.example.springboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevUserServiceImpl implements  UserService {
    @Override
    public String add() {
        return "dev方法";
    }
}
