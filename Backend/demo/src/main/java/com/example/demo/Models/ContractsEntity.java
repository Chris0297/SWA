package com.example.demo.Models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "contracts", schema = "public", catalog = "SWA")
public class ContractsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "contract_id")
    private long contractId;
    @Basic
    @Column(name = "fk_user_id_1")
    private Long fkUserId1;
    @Basic
    @Column(name = "fk_user_id_2")
    private Long fkUserId2;
    @Basic
    @Column(name = "start_date")
    private Date startDate;
    @Basic
    @Column(name = "end_date")
    private Date endDate;
    @Basic
    @Column(name = "ip_address_1")
    private String ipAddress1;
    @Basic
    @Column(name = "ip_address_2")
    private String ipAddress2;
    @Basic
    @Column(name = "ip_address_3")
    private String ipAddress3;
    @Basic
    @Column(name = "license_key")
    private String licenseKey;
    @Basic
    @Column(name = "feature_1")
    private String feature1;
    @Basic
    @Column(name = "feature_2")
    private String feature2;
    @Basic
    @Column(name = "feature_3")
    private String feature3;
    @Basic
    @Column(name = "version")
    private String version;
    @Basic
    @Column(name = "fk_customer")
    private Long fkCustomer;

    public long getContractId() {
        return contractId;
    }

    public void setContractId(long contractId) {
        this.contractId = contractId;
    }

    public Long getFkUserId1() {
        return fkUserId1;
    }

    public void setFkUserId1(Long fkUserId1) {
        this.fkUserId1 = fkUserId1;
    }

    public Long getFkUserId2() {
        return fkUserId2;
    }

    public void setFkUserId2(Long fkUserId2) {
        this.fkUserId2 = fkUserId2;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getIpAddress1() {
        return ipAddress1;
    }

    public void setIpAddress1(String ipAddress1) {
        this.ipAddress1 = ipAddress1;
    }

    public String getIpAddress2() {
        return ipAddress2;
    }

    public void setIpAddress2(String ipAddress2) {
        this.ipAddress2 = ipAddress2;
    }

    public String getIpAddress3() {
        return ipAddress3;
    }

    public void setIpAddress3(String ipAddress3) {
        this.ipAddress3 = ipAddress3;
    }

    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public String getFeature1() {
        return feature1;
    }

    public void setFeature1(String feature1) {
        this.feature1 = feature1;
    }

    public String getFeature2() {
        return feature2;
    }

    public void setFeature2(String feature2) {
        this.feature2 = feature2;
    }

    public String getFeature3() {
        return feature3;
    }

    public void setFeature3(String feature3) {
        this.feature3 = feature3;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getFkCustomer() {
        return fkCustomer;
    }

    public void setFkCustomer(Long fkCustomer) {
        this.fkCustomer = fkCustomer;
    }
}
