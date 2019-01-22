package com.example.demo.controller;
import com.example.demo.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class HelloController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    @GetMapping(value = "/hello")
    public String helloWorld() {
        LOGGER.info("This is a hello controller by info");
        LOGGER.debug("This is a hello controller by debug");
        LOGGER.error("This is a hello controller by error");
        LOGGER.warn("This is a hello controller by warn");
        return "hello world";
    }

    @PostMapping(value = "/test")
    public HttpEntity<String> test( @RequestBody Employee employee) {
        LOGGER.info("body in controller:"+ employee);
        return ResponseEntity.ok(employee.getName());



    }
}
