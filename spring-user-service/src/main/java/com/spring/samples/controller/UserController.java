package com.spring.samples.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ritz on 12/5/2017.
 */

@RestController
public class UserController {

    @RequestMapping(value = "/testUser", method = RequestMethod.POST)
    public String testUser(){
        return "from testUser";
    }


}