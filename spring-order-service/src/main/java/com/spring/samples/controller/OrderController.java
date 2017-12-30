package com.spring.samples.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ritz on 12/5/2017.
 */

@RestController
public class OrderController {

    @RequestMapping(value = "/testOrder", method = RequestMethod.POST)
    public String testOrder(){
        return "from testOrder";
    }


}
