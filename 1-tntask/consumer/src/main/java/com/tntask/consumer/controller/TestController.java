package com.tntask.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = { "/test" }, method = RequestMethod.GET)
    public Long TestCompute() {
        Long res = (long) 123;
        return res;
    }

}
