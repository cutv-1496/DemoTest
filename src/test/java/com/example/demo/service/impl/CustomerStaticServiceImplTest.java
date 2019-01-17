package com.example.demo.service.impl;

import com.example.demo.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerStaticServiceImplTest {


    @Autowired
    private TestEntityManager entityManager;

    @MockBean
    private CustomerStaticServiceImpl customerStaticService;


    @Test
    public void getCustomerStatic() {
        DeviceEntity deviceEntity = initDevice();
        CompanyEntity companyEntity = initCompany();
        entityManager.persist(companyEntity);

        entityManager.persist(deviceEntity);
        AnzenAccountEntity anzenAccountEntity = initAnzenAccount(companyEntity.getCompanyId());
        entityManager.persist(anzenAccountEntity);
        DeviceAccountEntity deviceAccountEntity = initDeviceAccount(anzenAccountEntity.getAnzenId(), deviceEntity.getDeviceId());
        entityManager.persist(deviceAccountEntity);
        List<CustomerStatic> customerStatics = customerStaticService.getCustomerStatic(companyEntity.getCompanyCode());
        // then
        assertThat(customerStatics.isEmpty(),is(true));
    }

    public DeviceEntity initDevice() {
        DeviceEntity deviceEntity = new DeviceEntity();
        deviceEntity.setDeviceName("iphone");
        deviceEntity.setDevicePubKey("aaaaa");
        deviceEntity.setActiveFlg(true);
        deviceEntity.setOs("sssssss");
        return deviceEntity;
    }

    public AnzenAccountEntity initAnzenAccount(Integer companyId) {
        AnzenAccountEntity anzenAccountEntity = new AnzenAccountEntity();
        anzenAccountEntity.setCompanyId(companyId);
        anzenAccountEntity.setRoleId(1);
        anzenAccountEntity.setActiveFlg(true);
        return anzenAccountEntity;
    }

    public DeviceAccountEntity initDeviceAccount(Integer anzenId, Integer deviceId) {
        DeviceAccountEntity deviceAccountEntity = new DeviceAccountEntity();
        deviceAccountEntity.setDeviceAccountId(new DeviceAccountId(anzenId, deviceId, 1));
        deviceAccountEntity.setActiveFlg(true);
        deviceAccountEntity.setCreateDatetime(new Timestamp(new Date().getTime()));
        return deviceAccountEntity;
    }

    public CompanyEntity initCompany() {
        CompanyEntity companyEntity = new CompanyEntity();
        companyEntity.setCompanyCode("HW6IQ389DFINRW2");
        companyEntity.setActiveFlg(Byte.valueOf("1"));
        return companyEntity;
    }
}