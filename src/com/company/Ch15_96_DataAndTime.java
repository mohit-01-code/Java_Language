package com.company;
import java.util.*;
public class Ch15_96_DataAndTime {
    public static void main(String[] args) {
        System.out.println("Milli Seconds since 1 jan 1970 : "+System.currentTimeMillis());
        System.out.println("Seconds since 1 jan 1970 : "+(System.currentTimeMillis() / 1000));
        System.out.println("Minutes since 1 jan 1970 : "+(System.currentTimeMillis() / 1000 / 60));
        System.out.println("Hours since 1 jan 1970 : "+(System.currentTimeMillis() / 1000 / 60 / 60));
        System.out.println("Days since 1 jan 1970 : "+(System.currentTimeMillis() / 1000 / 60 / 60 / 24));
        System.out.println("Years since 1 jan 1970 : "+(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 364));
    }
}
