package com.jc.consumer.codeconfig;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DepartCodeConfig {
@Bean
public RestTemplate restTemplate(){
    return  new RestTemplate();
}
}
