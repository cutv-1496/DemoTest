package com.example.demo.controller;

import com.example.demo.model.CustomerStatic;
import com.example.demo.service.impl.CustomerStaticServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerStaticServiceImpl customerStaticService;

    @GetMapping("/static/{companyName}")
    public ResponseEntity<List<CustomerStatic>> getEmployees(@PathVariable("companyName") String companyCode) {
        return ResponseEntity.ok(customerStaticService.getCustomerStatic(companyCode));
    }
}
