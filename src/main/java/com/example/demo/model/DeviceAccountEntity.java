package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "device_account")
public class DeviceAccountEntity {
    @EmbeddedId
    private DeviceAccountId deviceAccountId;

    @Basic
    @Column(name = "create_datetime")
    private Timestamp createDatetime;

    @Basic
    @Column(name = "active_flg")
    private Boolean activeFlg;

    public DeviceAccountId getDeviceAccountId() {
        return deviceAccountId;
    }

    public void setDeviceAccountId(DeviceAccountId deviceAccountId) {
        this.deviceAccountId = deviceAccountId;
    }

    public Timestamp getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Timestamp createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Boolean getActiveFlg() {
        return activeFlg;
    }

    public void setActiveFlg(Boolean activeFlg) {
        this.activeFlg = activeFlg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeviceAccountEntity that = (DeviceAccountEntity) o;
        return Objects.equals(createDatetime, that.createDatetime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(createDatetime);
    }
}
