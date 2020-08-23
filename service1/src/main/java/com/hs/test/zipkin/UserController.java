package com.hs.test.zipkin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    CustomerService service;


    @PostMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody String createUser(@PathVariable String id){
        logger.info("User id is : " + id);
        String response = service.createCustomer(id);
        logger.info("Customer is created with id: {}", id);
        return "Customer is created with id:" + response;
    }

    @PostMapping(value = "/user")
    public @ResponseBody String saveCustomer(){
        User user = new User("harsha", 33);
        User response = service.saveCustomer(user);
        return response.name;
    }
}
