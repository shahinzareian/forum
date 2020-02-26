package com.example.Forum.Models;

import javax.persistence.*;

@Entity
public class Topic {
    @Id
    @GeneratedValue
    Long id;
    String title;


    @ManyToOne
    Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
