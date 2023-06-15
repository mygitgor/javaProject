package com.example.connectme.iostudy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.example.connectme.create.model.modelrepository.contentfill;

public class Model {
    UsRegistration usRegistration;
    private int currentIndex;
    private String path;

    public Model(String path){
        usRegistration = new UsRegistration();
        currentIndex = 0;
        this.path = path;
    }

    public void load(String binName, Object listCount){
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String fname = reader.readLine();
            while (fname != null){
                String lname = reader.readLine();
                this.usRegistration.
            }

            reader.close();
            fr.close();
         } catch (Exception e) {

        }
    }

    public void save() {
        try (FileWriter writer = new FileWriter(path, false)){
            for (int i = 0; i < usRegistration.; i++) {
                
            }
            
            obj.close();
         } catch (Exception e) {

        }
    }
}
    

    

    
