package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "company")
public class CompanyEntity {
    private Integer companyId;
    private String companyName;
    private String shortName;
    private String imageUrl;
    private String companyCode;
    private Byte activeFlg;
    private Timestamp createDatetime;
    private Timestamp updateDatetime;
    private String website;
    private Timestamp browserIntegrationDate;
    private Timestamp appIntegrationDate;
    private String androidAppLink;
    private String iosAppLink;
    private String email;
    private String telephoneNo;
    private Timestamp contractStartDate;
    private Timestamp contractEndDate;
    private Integer paymentFrequency;
    private Long paymentAmount;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id", nullable = true)
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "company_name", nullable = true, length = 200)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "short_name", nullable = true, length = 25)
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Basic
    @Column(name = "image_url", nullable = true)
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Basic
    @Column(name = "company_code", nullable = true, length = 15)
    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    @Basic
    @Column(name = "active_flg", nullable = true)
    public Byte getActiveFlg() {
        return activeFlg;
    }

    public void setActiveFlg(Byte activeFlg) {
        this.activeFlg = activeFlg;
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

    @Basic
    @Column(name = "website")
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Basic
    @Column(name = "browser_integration_date")
    public Timestamp getBrowserIntegrationDate() {
        return browserIntegrationDate;
    }

    public void setBrowserIntegrationDate(Timestamp browserIntegrationDate) {
        this.browserIntegrationDate = browserIntegrationDate;
    }

    @Basic
    @Column(name = "app_integration_date")
    public Timestamp getAppIntegrationDate() {
        return appIntegrationDate;
    }

    public void setAppIntegrationDate(Timestamp appIntegrationDate) {
        this.appIntegrationDate = appIntegrationDate;
    }

    @Basic
    @Column(name = "android_app_link")
    public String getAndroidAppLink() {
        return androidAppLink;
    }

    public void setAndroidAppLink(String androidAppLink) {
        this.androidAppLink = androidAppLink;
    }

    @Basic
    @Column(name = "ios_app_link")
    public String getIosAppLink() {
        return iosAppLink;
    }

    public void setIosAppLink(String iosAppLink) {
        this.iosAppLink = iosAppLink;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "telephone_no")
    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    @Basic
    @Column(name = "contract_start_date")
    public Timestamp getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Timestamp contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    @Basic
    @Column(name = "contract_end_date")
    public Timestamp getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Timestamp contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    @Basic
    @Column(name = "payment_frequency")
    public Integer getPaymentFrequency() {
        return paymentFrequency;
    }

    public void setPaymentFrequency(Integer paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
    }

    @Basic
    @Column(name = "payment_amount")
    public Long getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Long paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return true;
        CompanyEntity that = (CompanyEntity) o;
        return Objects.equals(companyId, that.companyId) &&
                Objects.equals(companyName, that.companyName) &&
                Objects.equals(shortName, that.shortName) &&
                Objects.equals(imageUrl, that.imageUrl) &&
                Objects.equals(companyCode, that.companyCode) &&
                Objects.equals(activeFlg, that.activeFlg) &&
                Objects.equals(createDatetime, that.createDatetime) &&
                Objects.equals(updateDatetime, that.updateDatetime) &&
                Objects.equals(website, that.website) &&
                Objects.equals(browserIntegrationDate, that.browserIntegrationDate) &&
                Objects.equals(appIntegrationDate, that.appIntegrationDate) &&
                Objects.equals(androidAppLink, that.androidAppLink) &&
                Objects.equals(iosAppLink, that.iosAppLink) &&
                Objects.equals(email, that.email) &&
                Objects.equals(telephoneNo, that.telephoneNo) &&
                Objects.equals(contractStartDate, that.contractStartDate) &&
                Objects.equals(contractEndDate, that.contractEndDate) &&
                Objects.equals(paymentFrequency, that.paymentFrequency) &&
                Objects.equals(paymentAmount, that.paymentAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId, companyName, shortName, imageUrl, companyCode, activeFlg, createDatetime, updateDatetime, website, browserIntegrationDate, appIntegrationDate, androidAppLink, iosAppLink, email, telephoneNo, contractStartDate, contractEndDate, paymentFrequency, paymentAmount);
    }
}
