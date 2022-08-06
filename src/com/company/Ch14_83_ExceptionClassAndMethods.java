package com.company;

class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString method";
    }

    @Override
    public String getMessage() {
        return "I am getMessage method";
    }
}

public class Ch14_83_ExceptionClassAndMethods {
    public static void main(String[] args) {
        int a = 9;
        if (a < 100) {
            try {
//                throw new MyException();
                throw new ArithmeticException("Arithmetic Exception....");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}