package com.example.connectme.registration;

import java.util.ArrayList;
import java.util.List;


public class Registration<T extends People>{
    List<T> ds;
    private String name;


    public Registration(T ds,String name){
        this.ds = new ArrayList<>();
        this.name = name;
        
        
    }

    public void add(T people){
        ds.add(people);
    }

    public int count(){
        return ds.size();
    }
  
    public String getId(){
        return String.format("%s",ds);
    }

    public String fullName(){
        return String.format("%s",name);
    }

    
}
