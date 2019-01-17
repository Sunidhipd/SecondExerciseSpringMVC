package com.stackroute.controller;

public class User {
    private String Username;
    private String Password;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getName() {
        return Username;
    }

    public void setName(String name) {
        this.Username = name;
    }
}
