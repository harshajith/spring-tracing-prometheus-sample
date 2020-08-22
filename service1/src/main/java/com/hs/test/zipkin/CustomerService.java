package com.hs.test.zipkin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Autowired
    CustomerClient customerClient;

    public String createCustomer(String id){
        String response = customerClient.createCustomer(id);
        return response;
    }

    public User saveCustomer(User user){
        return customerClient.saveCustomer(user);
    }


}
