package com.avb.serialization;

import java.io.*;

class Dog01 implements Serializable {
    int i = 10;
}

class Cat01 implements Serializable {
    int j = 20;
}

class Rat01 implements Serializable {
    int c = 30;
}

public class SerializeDemo01 {

    public static void main(String[] args) throws Exception {

        Dog01 d1 = new Dog01();
        Cat01 c1 = new Cat01();
        Rat01 r1 = new Rat01();

        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        oos.writeObject(c1);
        oos.writeObject(r1);

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Dog01 d2=(Dog01) ois.readObject();
        Cat01 c2=(Cat01) ois.readObject();
        Rat01 r2=(Rat01) ois.readObject();

        System.out.println(d1.i+".........."+d2.i);
        System.out.println(c1.j+"..........."+c2.j);
        System.out.println(r1.c+"............"+ c2.j);
    }
}
