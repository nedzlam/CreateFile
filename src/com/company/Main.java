package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File myFile = new File("File.txt");
        try{
            if(myFile.createNewFile()) {
                System.out.println("File is created." +myFile.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
        try {
            FileWriter myWriter = new FileWriter("File.txt");
            myWriter.write("This File is made in Java :)");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
}}
