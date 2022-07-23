package com.apps.hotels.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "hotel")

public class Hotel {
    @Id
    @Column(name = "hotel_id")
    private Long hotel_id;
    @Column(name = "hotel_name")
    private String hotel_name;
    @Column(name = "hotel_address")
    private String hotel_address;
    @Column(name = "hotel_description")
    private String  hotel_description;
    @Column(name = "hotel_type")
    private String  hotel_type;


    public Hotel(Long hotel_id, String hotel_name, String hotel_address, String hotel_description, String hotel_type) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_address = hotel_address;
        this.hotel_description = hotel_description;
        this.hotel_type = hotel_type;
    }

    public Hotel() {

    }

    public Long getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Long hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_address() {
        return hotel_address;
    }

    public void setHotel_address(String hotel_address) {
        this.hotel_address = hotel_address;
    }

    public String getHotel_description() {
        return hotel_description;
    }

    public void setHotel_description(String hotel_description) {
        this.hotel_description = hotel_description;
    }

    public String getHotel_type() {
        return hotel_type;
    }

    public void setHotel_type(String hotel_type) {
        this.hotel_type = hotel_type;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotel_id=" + hotel_id +
                ", hotel_name='" + hotel_name + '\'' +
                ", hotel_address='" + hotel_address + '\'' +
                ", hotel_description='" + hotel_description + '\'' +
                ", hotel_type='" + hotel_type + '\'' +
                '}';
    }
}
