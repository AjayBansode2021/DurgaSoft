package com.avb.serialization;

import java.io.*;

class Account01 implements Serializable {
    String username="Durga";
    transient  String pwd="anushka";
}
public class CustomizedSerializationDemo01 {

    public static void main(String[] args) throws Exception {

        Account01 a1=new Account01();
        System.out.println(a1.username+"........."+a1.pwd);
        
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account01 a01=(Account01) ois.readObject();
        System.out.println(a01.username+"........."+a01.pwd);
        
        //Adding the Commented Lines in git hub
    }
}
