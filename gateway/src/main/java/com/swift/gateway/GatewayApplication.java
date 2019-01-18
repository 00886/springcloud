package com.swift.gateway;

import com.swift.gateway.filter.ApiFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GatewayApplication {
	/*@Bean
	ApiFilter apiFilter() {
		return new ApiFilter();
	}*/
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}

