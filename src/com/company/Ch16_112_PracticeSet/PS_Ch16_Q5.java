package com.company.Ch16_112_PracticeSet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PS_Ch16_Q5 {
    public static void main(String[] args) {
        File Myfile = new File("E:\\Practice Codes\\firstJavaProgram\\src\\com\\company\\Ch16_112_PracticeSet\\PS_Ch16_Q5.txt");
        try {
            Myfile.createNewFile();
            FileWriter MyFileWrite = new FileWriter("E:\\Practice Codes\\firstJavaProgram\\src\\com\\company\\Ch16_112_PracticeSet\\PS_Ch16_Q5.txt");
            for (int i = 1; i <= 10; i++) {
                for (int j = 2; j <= 9; j++) {
                    MyFileWrite.write(j + " X " + i + " = " + (j * i) + "\t");
                }
                MyFileWrite.write("\n");
            }
            MyFileWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
