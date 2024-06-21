package com.kafka_demo.kafka_demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/check")
    String checkMethod(){

        return "Demo project is working";
    }
}
