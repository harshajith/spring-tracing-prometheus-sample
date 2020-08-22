package com.hs.test.zipkin;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.cloud.openfeign.FeignClient(name = "customerClient", url = "${service2.host}")
public interface CustomerClient {

    @PostMapping(value = "/customer/{id}", consumes = "application/json", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String createCustomer(@PathVariable("id") String id);


    @PostMapping(value = "/customer", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User saveCustomer(User user);



}
