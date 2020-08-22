package com.hs.test.zipkin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWireMock(port = 9000)
@DirtiesContext
public class CustomerServiceSpec {

    @Autowired
    CustomerService customerService;


    @Test
    public void testCustomerCreation(){
        String response = customerService.createCustomer("300");
        assert response.equals("CustomerNameReponse");
    }

    @Test
    public void testSavingCustomer(){
        User user = new User("harsha", 4);
        User responseUser = customerService.saveCustomer(user);
        assert responseUser.age == 8;
        assert responseUser.name.equals("savein");
    }

}
