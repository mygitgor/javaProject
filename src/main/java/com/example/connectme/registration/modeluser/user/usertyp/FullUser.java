package com.example.connectme.registration.modeluser.user.usertyp;

import com.example.connectme.registration.modeluser.Users;

public class FullUser extends Users implements ExplorerFunction{
    private String lastName;
    private int age;

    public FullUser(String name, String lastname, int age) {
        super(name);
        this.lastName = lastname;
        this.age = age;
    }

    public String fullName(){
        return String.format("%s %s %s", name, lastName, age);
    }

    @Override
    public String email() {
        return "example.com";
    }

    @Override
    public int phone() {
        return 1234578;
    }

}
