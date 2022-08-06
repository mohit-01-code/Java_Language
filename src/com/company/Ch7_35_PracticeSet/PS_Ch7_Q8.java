package com.company.Ch7_35_PracticeSet;

public class PS_Ch7_Q8 {
    static void pattern(int n) {
        if (n > 0) {
            pattern(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
