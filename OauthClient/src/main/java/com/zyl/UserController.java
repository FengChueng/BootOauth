package com.zyl;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class UserController {

    @Autowired
    private OAuth2RestOperations restTemplate;

    @Value("${config.oauth2.resourceURI}")
    private String resourceURI;

    @RequestMapping("/")
    public String home() throws Exception{
        final String forObject = restTemplate.getForObject(resourceURI, String.class);
        System.out.println(forObject);
//        return restTemplate.getForObject(resourceURI, JsonNode.class);
        return forObject;
    }

}