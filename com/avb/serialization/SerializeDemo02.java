package com.avb.serialization;

import java.io.*;

class Dog02 implements Serializable {
    int i = 10;
}

class Cat02 implements Serializable {
    int j = 20;
}

class Rat02 implements Serializable {
    int c = 30;
}
public class SerializeDemo02 {

    public static void main(String[] args) throws Exception {

        Dog02 d2 = new Dog02();
        Cat02 c2 = new Cat02();
        Rat02 r2 = new Rat02();

        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d2);
        oos.writeObject(c2);
        oos.writeObject(r2);

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object obj=ois.readObject();

        if(obj instanceof Dog02){
            Dog02 dog02=(Dog02) obj;
            System.out.println(dog02.i);
        } /*else if (obj instanceof Cat02) {
            ois.readObject();
        }*/
    }
}
