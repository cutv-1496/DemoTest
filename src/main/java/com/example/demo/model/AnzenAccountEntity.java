package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "anzen_account")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "company_static",
                procedureName = "company_static",
                resultClasses = {Object.class },
                parameters = {
                        @StoredProcedureParameter( name = "companyCode",  type = String.class,  mode = ParameterMode.IN)
                }),

})
public class AnzenAccountEntity {
    private Integer anzenId;
    private String username;
    private String fullName;
    private Integer companyId;
    private String email;
    private String telephoneNo;
    private String countryCode;
    private Integer roleId;
    private Boolean activeFlg;
    private Boolean deleteFlg;
    private Timestamp createDatetime;
    private Timestamp updateDatetime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "anzen_id", nullable = true)
    public Integer getAnzenId() {
        return anzenId;
    }

    public void setAnzenId(Integer anzenId) {
        this.anzenId = anzenId;
    }

    @Basic
    @Column(name = "username", length = 30)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "fullname", length = 255)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "company_id", nullable = true)
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 320)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "telephone_no", nullable = true, length = 15)
    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    @Basic
    @Column(name = "country_code", nullable = true, length = 3)
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Basic
    @Column(name = "role_id", nullable = true)
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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
        AnzenAccountEntity that = (AnzenAccountEntity) o;
        return Objects.equals(anzenId, that.anzenId) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(email, that.email) &&
                Objects.equals(telephoneNo, that.telephoneNo) &&
                Objects.equals(countryCode, that.countryCode) &&
                Objects.equals(activeFlg, that.activeFlg) &&
                Objects.equals(createDatetime, that.createDatetime) &&
                Objects.equals(updateDatetime, that.updateDatetime) &&
                Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anzenId, companyId, email, telephoneNo, countryCode, activeFlg, createDatetime, updateDatetime, roleId);
    }

}
