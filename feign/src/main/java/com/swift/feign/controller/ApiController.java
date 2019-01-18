package com.swift.feign.controller;

import com.swift.feign.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    public ApiService apiService;
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        return apiService.index();
    }
}
