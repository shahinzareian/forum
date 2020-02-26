package com.example.Forum.Models;

import javax.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue
    Long id;
    String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
