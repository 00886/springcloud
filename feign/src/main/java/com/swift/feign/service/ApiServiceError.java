package com.swift.feign.service;

import org.springframework.stereotype.Component;

@Component
public class ApiServiceError implements ApiService{
    @Override
    public String index() {
        return "服务器发生故障";
    }
}
