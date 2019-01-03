package com.example.demo.service.impl;

import com.example.demo.model.CustomerStatic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.stream.Collectors;
@Service("customerStaticService")
public class CustomerStaticServiceImpl{
    @Autowired
    private EntityManager entityManager;

    public List<CustomerStatic> getCustomerStatic(String companyCode) {
        List<Object[]> objects = entityManager.createNativeQuery("call anzen_core.company_static(?)").setParameter(1,companyCode).getResultList();
        return objects.stream().map(object -> {
            CustomerStatic customerStatic = new CustomerStatic();
            customerStatic.setTotalCustomerRegister((Long) object[0]);
            customerStatic.setTotalCustomerActive((Long) object[1]);
            customerStatic.setTotalCustomerInActive((Long) object[2]);
            return customerStatic;
        }).collect(Collectors.toList());
    }
}
