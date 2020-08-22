package com.hs.test.service2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CustomerController {

    Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @PostMapping(value = "/customer/{id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody String createCustomer(@PathVariable String id, HttpServletRequest request) {
        logger.info("Creating customer with id: {}, request: {}", id, request.toString());
        return "customer created";
    }

    @PostMapping(value = "/customer", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody User saveCustomer(@RequestBody User user){
        user.setAge(3);
        user.setName("Savein");
        return user;
    }

}
