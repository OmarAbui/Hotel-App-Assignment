package com.apps.hotels.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "customers")
public class Customers {
    @Id
    @Column(name = "customer_id")
    private Long customer_id;
    @Column(name = "customer_name")
    private String customer_name;
    @Column(name = "customer_mobile")
    private int customer_mobile;
    @Column(name = "customer_email")
    private String customer_email;
    @Column(name = "customer_address")
    private String customer_address;

    public Customers(Long customer_id, String customer_name, int customer_mobile, String customer_email, String customer_address) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_mobile = customer_mobile;
        this.customer_email = customer_email;
        this.customer_address = customer_address;
    }

    public Customers() {

    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getCustomer_mobile() {
        return customer_mobile;
    }

    public void setCustomer_mobile(int customer_mobile) {
        this.customer_mobile = customer_mobile;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customer_id=" + customer_id +
                ", customer_name='" + customer_name + '\'' +
                ", customer_mobile=" + customer_mobile +
                ", customer_email='" + customer_email + '\'' +
                ", customer_address='" + customer_address + '\'' +
                '}';
    }
}
