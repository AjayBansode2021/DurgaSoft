package com.avb.serialization;

import java.io.*;

class AnimalInherit02 {
    int i=10;

    AnimalInherit02(){
        System.out.println("Animal Constructor call");
    }
}

class DogInherit02 extends AnimalInherit02 implements Serializable {

    int j=20;

    DogInherit02(){
        System.out.println("Dog Constructor call");
    }
}

public class InheritanceSerializationcase02 {

    public static void main(String[] args) throws Exception{

        DogInherit02 di02=new DogInherit02();
        di02.i=888;
        di02.j=999;

        System.out.println(di02.i + ".........." + di02.j);

        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(di02);

        System.out.println("Desrialization Strated");

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        DogInherit02 di02_02= (DogInherit02) ois.readObject();

        System.out.println(di02_02.i+"..........."+di02_02.j);

    }

}
