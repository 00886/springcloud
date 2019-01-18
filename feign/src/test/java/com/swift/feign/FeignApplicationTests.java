package com.swift.feign;

import com.swift.feign.service.ApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FeignApplication.class)
public class FeignApplicationTests {

	@Autowired
	ApiService apiService;

	@Test
	public void test() {
		System.out.println(apiService.index());
	}

}

