package com.example.demo.Models;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "instances", schema = "public", catalog = "SWA")
public class InstancesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "instance_id")
    private long instanceId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "ip_address")
    private String ipAddress;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "status")
    private boolean status;
    @Basic
    @Column(name = "fk_contract")
    private Long fkContract;

    public long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(long instanceId) {
        this.instanceId = instanceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getFkContract() {
        return fkContract;
    }

    public void setFkContract(Long fkContract) {
        this.fkContract = fkContract;
    }
}
