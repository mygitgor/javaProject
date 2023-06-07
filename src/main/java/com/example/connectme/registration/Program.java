package com.example.connectme.registration;



public class Program {
    public static void main(String[] args) {
        Registration<User> group = new Registration<User>(null, "User");
        group.add(new User(0,"Ani", "Mkrtcyan", 22, "@example.com", "123254"));
        group.add(new User(0,"Styopa", "Artavazdyan", 20, "@example.com", "123254"));
        System.out.println(group);

       
       Registration<Basic> base = new Registration<Basic>(null, "Basic");
       base.add(new Basic("BaseName", "123456"));
       base.add(new Basic("BaseName2", "456789"));
       System.out.println(base);

     
    }
}
