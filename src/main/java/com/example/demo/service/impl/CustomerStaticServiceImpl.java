package com.example.demo.service.impl;

import com.example.demo.model.CustomerStatic;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

@Service("customerStaticService")
public class CustomerStaticServiceImpl{
    @PersistenceContext
    private EntityManager entityManager;

    public List<CustomerStatic> getCustomerStatic(String companyCode) {
        List<Object[]> objects = entityManager.createNativeQuery("call company_static(?)")
                .setParameter(1,companyCode).getResultList();
        return objects.stream().map(object -> {
            CustomerStatic customerStatic = new CustomerStatic();
            customerStatic.setTotalCustomerRegister(((BigInteger) object[0]).longValue());
            customerStatic.setTotalCustomerActive(((BigInteger) object[1]).longValue());
            customerStatic.setTotalCustomerInActive(((BigInteger) object[2]).longValue());
            return customerStatic;
        }).collect(Collectors.toList());
    }
}
