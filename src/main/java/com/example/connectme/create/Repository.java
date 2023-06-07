package com.example.connectme.create;

import java.util.ArrayList;
import java.util.List;

public class Repository<T extends Content> {
    List<T> ds;

    private String name;

    public Repository(String name){
        this.ds = new ArrayList<>();
        this.name = name;
    }

    public void add(T contet){
        ds.add(contet);
    }

    public int count(){
        return ds.size();
    }

    public T get(Integer index){
        return ds.get(index);
    }
    
}
