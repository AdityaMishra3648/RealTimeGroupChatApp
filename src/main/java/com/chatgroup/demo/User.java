package com.chatgroup.demo;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;

public class User {
    private String Username;
    private String password;
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
