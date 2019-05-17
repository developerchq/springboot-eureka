package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * eurekaclient2
 * Created by AB052409 on 2019/5/16.
 */
@RestController
public class TestContoller {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String Test(String name){
        return restTemplate.getForObject("http://service-hi/hello?str="+name,String.class);
    }
}
