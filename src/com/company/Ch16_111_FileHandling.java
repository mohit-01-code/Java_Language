package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ch16_111_FileHandling {
    public static void main(String[] args) {
        File createFile = new File("FileHandling.txt");
        try {
            createFile.createNewFile();
            System.out.println("File Created : " + createFile.getName());
            FileWriter writefile = new FileWriter("FileHandling.txt");

            writefile.write("I am random text written from java program.\nNext line...");
            writefile.close();

            FileReader readFile = new FileReader("FileHandling.txt");
            Scanner sc = new Scanner(readFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
                readFile.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (createFile.delete()) {
            System.out.println("file deleted : " + createFile.getName());
        } else {
            System.out.println("file not deleted due to some error");
        }
    }
}
