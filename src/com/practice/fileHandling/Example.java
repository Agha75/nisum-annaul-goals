package com.practice.fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // createFile();
        // deleteFile();
        // writeFile();
        // readFile();
        getFileInfo();
    }
    public static void createFile(){
        File file=new File("File.txt");
        try {
            if (file.createNewFile()){
                System.out.println("File created "+file.getName());
            } else {
                System.out.println("Invalid File");
            }
        } catch (IOException e) {
            System.out.println("error occurred");
            e.printStackTrace();
        }
    }
    public static void writeFile(){
        try {
            FileWriter fileWriter=new FileWriter("File.txt");
            fileWriter.write("Hello");
            fileWriter.close();
        } catch (IOException e){
            System.out.println("error occurred");
            e.printStackTrace();
        }

    }

    public static void readFile(){
        try {
            FileReader fileReader = new FileReader("File.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
            System.out.println(data);
        }
            fileReader.close();
        }catch (IOException e){
            System.out.println("error occurred");
            e.printStackTrace();
        }

    }
    public static void deleteFile(){
        File file=new File("File.txt");
        if (file.delete()){
            System.out.println("File deleted "+file.getName());
        } else System.out.println("inValid file");
    }

    public static void getFileInfo(){
        File myObj = new File("File.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
