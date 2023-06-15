package com.example.connectme.registration.modeluser.user.usertyp;

import com.example.connectme.registration.modeluser.Users;

public class BasicUser extends Users{
    private String lastName;

    public BasicUser(String name, String lastname) {
        super(name);
        this.lastName = lastname;
    }

    public String fullName(){
        return String.format("%s %s", name, lastName);
    }
}
