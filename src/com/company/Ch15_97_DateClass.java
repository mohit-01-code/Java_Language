package com.company;

import java.util.*;
public class Ch15_97_DateClass {
    public static void main(String[] args) {

        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        System.out.println(d.getDate()+"-"+d.getMonth()+"-"+(d.getYear()+1900));
        d.setDate(24);
        d.setMonth(Calendar.AUGUST);
        d.setYear(2001);
        System.out.println(d.getDate()+"-"+d.getMonth()+"-"+d.getYear());


    }
}
