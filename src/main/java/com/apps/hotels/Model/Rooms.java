package com.apps.hotels.Model;

import javax.persistence.*;

@Entity
@Table(name ="rooms")
public class Rooms {
    @Id
    @Column(name = "room_id")
    private Long room_id;
//   add foreign keys
    @ManyToOne
    @JoinColumn (name ="hotel_id")
    private Hotel room_hotel_id;
    @Column(name = "room_category")
    private String room_category;
    @Column(name = "room_number")
    private Long room_number;
    @Column(name = "room_type")
    private String room_type;
    @Column(name = "room_description")
    private String room_description;

    public Rooms(Long room_id, Hotel room_hotel_id, String room_category, Long room_number, String room_type, String room_description) {
        this.room_id = room_id;
        this.room_hotel_id = room_hotel_id;
        this.room_category = room_category;
        this.room_number = room_number;
        this.room_type = room_type;
        this.room_description = room_description;
    }

    public Rooms() {

    }

    public Long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Long room_id) {
        this.room_id = room_id;
    }

    public Hotel getRoom_hotel_id() {
        return room_hotel_id;
    }

    public void setRoom_hotel_id(Hotel room_hotel_id) {
        this.room_hotel_id = room_hotel_id;
    }

    public String getRoom_category() {
        return room_category;
    }

    public void setRoom_category(String room_category) {
        this.room_category = room_category;
    }

    public Long getRoom_number() {
        return room_number;
    }

    public void setRoom_number(Long room_number) {
        this.room_number = room_number;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getRoom_description() {
        return room_description;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "room_id=" + room_id +
                ", room_hotel_id=" + room_hotel_id +
                ", room_category='" + room_category + '\'' +
                ", room_number=" + room_number +
                ", room_type='" + room_type + '\'' +
                ", room_description='" + room_description + '\'' +
                '}';
    }

    public void setRoom_description(String room_description) {
        this.room_description = room_description;
    }

}
