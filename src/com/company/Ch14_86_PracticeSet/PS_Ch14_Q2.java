package com.company.Ch14_86_PracticeSet;


public class PS_Ch14_Q2 {
    public static String sample() throws IllegalArgumentException {
        String str = null;
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null.");
        }
        return str;
    }

    public static void main(String[] args) {
        try {
            System.out.println(sample());
            throw new ArithmeticException();
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        } catch(ArithmeticException e){
            System.out.println("HaHa");
        }
    }
}