package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * eurekaclient
 * Created by AB052409 on 2019/5/16.
 */
@RestController
public class ClientController {

    @RequestMapping("/hello")
    public String Hello(String str){
        return "hello "+str;
    }

}
