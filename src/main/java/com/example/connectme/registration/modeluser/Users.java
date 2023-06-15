package com.example.connectme.registration.modeluser;

public class Users {
    public String name;

    public Users(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
