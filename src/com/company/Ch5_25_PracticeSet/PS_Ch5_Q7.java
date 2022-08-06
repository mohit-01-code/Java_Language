package com.company.Ch5_25_PracticeSet;

public class PS_Ch5_Q7 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        int n = 4;
        while (i < n) {
            while (j < n - i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
            j = 0;
        }
    }
}
