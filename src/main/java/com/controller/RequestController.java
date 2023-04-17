package com.controller;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    /**
     * define the max count is 100 in TPS which means there could be process 100 requests at most in one second
     * */
    private RateLimiter rateLimiter = RateLimiter.create(100);


    @GetMapping("/request/query")
    public String query(){
        rateLimiter.acquire();
        return "Received OK.";
    }
}
