package com.shiftleftapple.veggie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GROWER")
public class Grower {
    @Id
    @Column(name="EMAIL_ID")
    private String emailID;

    @Column(name="NAME")
    private String name;

    @Column(name="PASSWORD")
    private String password;

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
