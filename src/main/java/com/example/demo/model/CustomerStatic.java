package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerStatic {
    private Long totalCustomerRegister;
    private Long totalCustomerInActive;
    private Long totalCustomerActive;
}
