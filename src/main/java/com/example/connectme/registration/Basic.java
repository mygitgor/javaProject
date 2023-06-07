package com.example.connectme.registration;

public class Basic extends People{
    private String name;
    private String pasword;

    public Basic(String name, String pasword) {
        super(name);
        this.name = name;
        this.pasword = pasword;
    }

    @Override
    public String toString() {
        return "name- "+name+ "pasword- " + pasword;
    }

   
}
