package com.example.connectme.create.model;

import java.util.ArrayList;
import java.util.List;

public class ContentStructure<T extends Content> {
    List<T> contentPlaer;
    
    public ContentStructure(){
        this.contentPlaer = new ArrayList<>();
    }

    public void add(T content){
        this.contentPlaer.add(content);
    }

     private boolean contains(int index){
        return contentPlaer != null
        && contentPlaer.size() > index;
    }

    public T getContent(int index){
        return contains(index) ? contentPlaer.get(index) : null;
    }

     public boolean remuve(T t){
        boolean flag = false;
        if (contentPlaer.indexOf(t) != -1){
            contentPlaer.remove(t);
            flag = true;
        }
        return flag;
    }

    public int count(){
        return contentPlaer.size();
    }

    public T get(Integer index){
        return contentPlaer.get(index);
    }
}





 


