package com.example.Forum.Models;

import javax.persistence.*;

@Entity
public class Msg {
    @Id
    @GeneratedValue
    Long id;
    @ManyToOne
    Topic topic;
    @ManyToOne
    Account account;
    String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
