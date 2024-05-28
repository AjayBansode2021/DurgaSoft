package com.avb.serialization;

import java.io.*;

class Dog03 implements Serializable {
    Cat03 c03 = new Cat03();
}

class Cat03 implements Serializable {
    Rat03 r03 = new Rat03();
}

class Rat03 implements Serializable {
    int j = 10;
}

public class SerializeDemo03 {

    public static void main(String[] args) throws Exception {

        Dog03 d03=new Dog03();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d03);

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog03 dog03=(Dog03) ois.readObject();
        System.out.println(dog03.c03.r03.j);
    }

}
