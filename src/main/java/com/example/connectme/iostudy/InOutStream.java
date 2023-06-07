package com.example.connectme.iostudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.example.connectme.registration.User;

public abstract class InOutStream implements Serializable{

    private FileOutputStream out;
    private FileInputStream inFile;
    private ObjectOutputStream oos;
    private ObjectInputStream obj;
    private String binName;
    private Object object;

    public void writeObject(String binName, Object object){
        try {
            FileOutputStream out = new FileOutputStream(binName);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(object);

            oos.close();
         } catch (Exception e) {

        }
    }

    public void readObject(String binName, Object object){
        try {
            FileInputStream inFile = new FileInputStream(binName);
            ObjectInputStream obj = new ObjectInputStream(inFile);
            this.object = obj.readObject();

            obj.close();
         } catch (Exception e) {

        }
    }

}
