package com.avb.serialization;

import java.io.*;

class Account02 implements Serializable {
    String username="Durga";
    transient String pwd="aushka";

    private void writeObject(ObjectOutputStream os) throws Exception{
        os.defaultWriteObject();
        String epwd="123"+pwd;
        os.writeObject(epwd);
    }

    private void readObject(ObjectInputStream is) throws  Exception{
        is.defaultReadObject();
        String epwd=(String) is.readObject();
        pwd=epwd.substring(3);
    }
}

public class CustomizedSerializationDemo02 {

    public static void main(String[] args) throws Exception {

        Account02 a02=new Account02();
        System.out.println(a02.username+"..........."+a02.pwd);

        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a02);

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account02 a_02=(Account02) ois.readObject();
        System.out.println(a_02.username+"............."+a_02.pwd);
    }
}
