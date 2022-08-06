package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ch15_101_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(dt.format(df));
        System.out.println(dt.format(df2));
    }
}
