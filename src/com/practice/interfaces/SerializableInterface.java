package com.practice.interfaces;

import java.io.*;

class Abcd implements Serializable {
    int i;
    String s;

    // A class constructor
    public Abcd(int i, String s) {
        this.i = i;
        this.s = s;
    }
}
public class SerializableInterface {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Abcd a = new Abcd(20,"GeeksForGeeeeeks");

        // Serializing 'a'
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        // De-serializing 'a'
        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Abcd b = (Abcd)ois.readObject();//down-casting object

        System.out.println(b.i+" "+b.s);

        // closing streams
        oos.close();
        ois.close();

    }
}
