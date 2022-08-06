package com.company.Ch16_112_PracticeSet;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PS_Ch16_Q6 {
    public static void main(String[] args) {
        try {
            for (int i = 2; i <= 9; i++) {
                String str = "Table of " + i;
                File file = new File("src\\com\\company\\Ch16_112_PracticeSet\\Q6_MultiplicationTables\\" + str + ".txt");
                file.createNewFile();

                FileWriter fileWriter = new FileWriter("src\\com\\company\\Ch16_112_PracticeSet\\Q6_MultiplicationTables\\" + str + ".txt");
                for (int j = 1; j <= 10; j++) {
                    fileWriter.write(i + " X " + j + " = " + (i * j) + "\n");
                }
                fileWriter.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
