package com.company;

public class Ch1_04_Literals {
    public static void main(String[] args) {
        byte age = 19; //19 is a literal for variable age
        char ch = 'A';
        //float f1 = 5.6; // By default it is double
        float f2 = 5.6f; //float data type
        double d1 = 3.145647;// Double data type
        //long l1 = 566666666666;//By default it is an integer
        long l2 = 566666666666L;//Long data type
        boolean b1 = true;
        boolean b2 = false;
        String str = "Harry";

        System.out.println(age);
        System.out.println(ch);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(l2);
        //System.out.println(b1); //b1 is always true
        //System.out.println(b2); b2 is always false
        System.out.println(str);
    }
}
//Data type     size
//byte      =   1 byte
//short     =   2 bytes
//int       =   4 bytes
//float     =   4 bytes
//long      =   8 bytes
//double    =   8 bytes
//char      =   2 bytes
//boolean   =   depends on JVM