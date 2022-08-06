package com.company.Ch15_102_AdvanceJavaPracticeSet;


import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalTime;

public class PS_Ch15_Q2Q3AndQ4 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime().getHours() + ":" + c.getTime().getMinutes() + ":" + c.getTime().getSeconds());

        LocalTime t = LocalTime.now();
        t.format(DateTimeFormatter.ofPattern("h:m:s"));
        System.out.println(t);
    }
}
