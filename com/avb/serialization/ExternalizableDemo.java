package com.avb.serialization;

import java.io.*;

public class ExternalizableDemo implements Externalizable {

    String s;
    int i;
    int j;

    public ExternalizableDemo (){
        System.out.println("Public No Argument Constructor");
    }

    public ExternalizableDemo(String s, int i, int j) {
        this.s = s;
        this.i = i;
        this.j = j;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(s);
        out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        s= (String) in.readObject();
        i=in.readInt();
    }

    public static void main(String[] args) throws Exception {

        ExternalizableDemo exd=new ExternalizableDemo("Durga", 10,20);
        System.out.println(exd.s+"......."+exd.i+"............"+exd.j);

        FileOutputStream fos= new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(exd);

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        ExternalizableDemo exd01= (ExternalizableDemo) ois.readObject();
        System.out.println(exd01.s+"......."+exd01.i+"............"+exd01.j);
    }
}
