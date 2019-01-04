package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DeviceAccountId implements Serializable {
    @Column(name = "anzen_id")
    private Integer anzenId;

    @Column(name = "device_id")
    private Integer deviceId;

    @Column(name = "app_id")
    private Integer appId;

    public Integer getAnzenId() {
        return anzenId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAnzenId(Integer anzenId) {
        this.anzenId = anzenId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public DeviceAccountId(Integer anzenId, Integer deviceId, Integer appId) {
        this.anzenId = anzenId;
        this.deviceId = deviceId;
        this.appId = appId;
    }
}
