package com.example.JPA.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private long id;
    private String name;
    private String address;

    public Course (long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Course () {}

    public void setId(long id){
        this.id = id;
    }

    public long getId () {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
