package com.example.demo.controller;
import com.example.demo.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
@Slf4j
public class HelloController {
    @GetMapping(value = "/hello")
    public String helloWorld() {
        log.info("=>>>>>>>>>>>>>>>>>>>>>Helllo");
        return "hello world";
    }

    @PostMapping(value = "/test")
    public HttpEntity<String> test( @RequestBody Employee employee) {

        return ResponseEntity.ok(employee.getName());






    }
}
