package com.example.connectme.registration.presenter;

import javax.swing.text.View;

import com.example.connectme.iostudy.Model;

public class Presenter {
    Model model;
    View view;

    public Presenter(View view, String pathDb) {
        model = new Model(pathDb);
        this.view = view;
    }

    
}
