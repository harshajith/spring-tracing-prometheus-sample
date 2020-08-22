package com.hs.test.zipkin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableFeignClients
public class Service1Application {


	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Service1Application.class, args);

	}

}
