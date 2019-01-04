package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "device")
public class DeviceEntity {
    private Integer deviceId;
    private String deviceToken;
    private String deviceName;
    private String devicePubKey;
    private String os;
    private String model;
    private String location;
    private Integer priorityOrder;
    private Boolean activeFlg;
    private Boolean deleteFlg;
    private Timestamp createDatetime;
    private Timestamp updateDatetime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "device_id", nullable = true)
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "device_token", nullable = true, length = 50)
    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    @Basic
    @Column(name = "device_name", nullable = true, length = 50)
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Basic
    @Column(name = "device_pub_key", nullable = true, length = 1000)
    public String getDevicePubKey() {
        return devicePubKey;
    }

    public void setDevicePubKey(String devicePubKey) {
        this.devicePubKey = devicePubKey;
    }

    @Basic
    @Column(name = "os", nullable = true, length = 50)
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Basic
    @Column(name = "model", nullable = true, length = 50)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "location", nullable = true, length = 200)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "priority_order", nullable = true)
    public Integer getPriorityOrder() {
        return priorityOrder;
    }

    public void setPriorityOrder(Integer priorityOrder) {
        this.priorityOrder = priorityOrder;
    }

    @Basic
    @Column(name = "active_flg", nullable = true)
    public Boolean getActiveFlg() {
        return activeFlg;
    }

    public void setActiveFlg(Boolean activeFlg) {
        this.activeFlg = activeFlg;
    }

    @Basic
    @Column(name = "delete_flg", nullable = true)
    public Boolean getDeleteFlg() {
        return deleteFlg;
    }

    public void setDeleteFlg(Boolean deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    @Basic
    @Column(name = "create_datetime", nullable = true)
    public Timestamp getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Timestamp createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Basic
    @Column(name = "update_datetime", nullable = true)
    public Timestamp getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Timestamp updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return true;
        DeviceEntity that = (DeviceEntity) o;
        return Objects.equals(deviceId, that.deviceId) &&
                Objects.equals(deviceToken, that.deviceToken) &&
                Objects.equals(deviceName, that.deviceName) &&
                Objects.equals(devicePubKey, that.devicePubKey) &&
                Objects.equals(os, that.os) &&
                Objects.equals(model, that.model) &&
                Objects.equals(location, that.location) &&
                Objects.equals(priorityOrder, that.priorityOrder) &&
                Objects.equals(activeFlg, that.activeFlg) &&
                Objects.equals(deleteFlg, that.deleteFlg) &&
                Objects.equals(createDatetime, that.createDatetime) &&
                Objects.equals(updateDatetime, that.updateDatetime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(deviceId, deviceToken, deviceName, devicePubKey, os, model, location, priorityOrder, activeFlg, deleteFlg, createDatetime, updateDatetime);
    }
}
