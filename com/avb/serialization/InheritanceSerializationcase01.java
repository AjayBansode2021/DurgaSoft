package com.avb.serialization;

import java.io.*;

class AnimalInherit01 implements Serializable {
    int i=10;
}

class DogInherit01 extends AnimalInherit01{
    int j=20;
}

public class InheritanceSerializationcase01 {

    public static void main(String[] args) throws Exception {

        DogInherit01 di01=new DogInherit01();
        System.out.println(di01.i+".........."+di01.j);
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(di01);

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        DogInherit01 di01_01= (DogInherit01) ois.readObject();
        System.out.println(di01_01.i+"........"+di01_01.j);

    }
}
