package com.avb.serialization;

import java.io.*;

class Account03 implements Serializable {

    String username = "Durga";
    transient String pwd = "anushka";
    transient int pin = 1234;

    private void writeObject(ObjectOutputStream os) throws Exception {

        os.defaultWriteObject();
        String epwd="123"+pwd;
        int epin=4444+pin;
        os.writeObject(epwd);
        os.writeInt(epin);
    }

    private void readObject(ObjectInputStream is) throws Exception {

        is.defaultReadObject();
        String epwd=(String) is.readObject();
        pwd=epwd.substring(3);
        int epin=(int) is.readInt();
        pin = epin-4444;
    }
}
public class CustomizedSerializationDemo03 {

    public static void main(String[] args) throws Exception{

        Account03 a03=new Account03();
        System.out.println(a03.username+"......"+a03.pwd+"........."+a03.pin);

        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a03);

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account03 a_03=(Account03) ois.readObject();
        System.out.println(a_03.username+"......"+a_03.pwd+"........."+a_03.pin);
    }
}
