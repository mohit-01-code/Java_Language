package com.company;

public class Ch14_85_FinallyBlock {
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Cleaning up resources....Function ended");
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("The division is " + divide(1, 0));
        int a = 7;
        int b = 9;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("loop break with value of b = " + b);
            }
            b--;
        }
    }
}