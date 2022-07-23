package com.apps.hotels.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table (name = "services")

public class Services {
    @Id
    @Column(name = "service_id")
    private Long service_id;
    @Column(name = "service_hotel_id")
    private Long service_hotel_id;
    @Column(name = "service_name")
    private String service_name;
    @Column(name = "service_type")
    private String service_type;
    @Column(name = "service_description")
    private String service_description;

    @Column(name = "service_amount")
    private String service_amount;


    public Services(Long service_id, Long service_hotel_id, String service_name, String service_type, String service_description, String service_amount) {
        this.service_id = service_id;
        this.service_hotel_id = service_hotel_id;
        this.service_name = service_name;
        this.service_type = service_type;
        this.service_description = service_description;
        this.service_amount = service_amount;
    }

    public Services() {

    }

    public Long getService_id() {
        return service_id;
    }

    public void setService_id(Long service_id) {
        this.service_id = service_id;
    }

    public Long getService_hotel_id() {
        return service_hotel_id;
    }

    public void setService_hotel_id(Long service_hotel_id) {
        this.service_hotel_id = service_hotel_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getService_description() {
        return service_description;
    }

    public void setService_description(String service_description) {
        this.service_description = service_description;
    }

    public String getService_amount() {
        return service_amount;
    }

    public void setService_amount(String service_amount) {
        this.service_amount = service_amount;
    }

    @Override
    public String toString() {
        return "Services{" +
                "service_id=" + service_id +
                ", service_hotel_id=" + service_hotel_id +
                ", service_name='" + service_name + '\'' +
                ", service_type='" + service_type + '\'' +
                ", service_description='" + service_description + '\'' +
                ", service_amount='" + service_amount + '\'' +
                '}';
    }
}
