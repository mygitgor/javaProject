package com.example.connectme.registration.modeluser;

import java.util.ArrayList;
import java.util.List;

abstract class UserStrusture<T extends Users> {
    List<T> people;

    public UserStrusture(){
        this.people = new ArrayList<>();
    }

    public void add(T users){
        this.people.add(users);
    }

    public int count(){
        return people.size();
    }

    public T getUser(int index){
        return contains(index) ? people.get(index) : null;
    }

    private boolean contains(int index){
        return people != null
        && people.size() > index;
    }

    public boolean remuve(T t){
        boolean flag = false;
        if (people.indexOf(t) != -1){
            people.remove(t);
            flag = true;
        }
        return flag;
    }

    public T get(Integer index){
        return people.get(index);
    }

    public String fullName(){
        return String.format("%s");
    }
   
}

