package com.example.connectme.registration;

public class User extends People{
    private int id;
    private String name;
    private String lastName;
    private int age;
    private String email;
    private String pasword;

    public User(int id,String name, String lastName, int age, String email, String pasword) {
        super(name);
        this.name = name;
        this.id = id++;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.pasword = pasword;
    }

    public String getId(){
        return String.format("%s",id);
    }
    public String fullName(){
        return String.format("%s %s",name, lastName);
    }
    
    

   @Override
   public String toString() {
       return super.toString()+ name + id+ lastName+ age+ email+ pasword;
   }

 

}
