package com.company;

import java.util.Scanner;

class employee {
    int id;
    String name;

    void setDetail() {
        Scanner scan = new Scanner(System.in);
        id = scan.nextInt();
        name = scan.next();

    }

    void getDetail(int i, String n) {
        id = i;
        name = n;
    }

    void printDetail() {
        System.out.println(id);
        System.out.println(name);
    }
}

public class Ch8_38_JavaClass {
    public static void main(String[] args) {
        employee harry = new employee();
        harry.id = 1212;
        harry.name = "HARRY";
        harry.printDetail();

        employee mohit = new employee();
        mohit.getDetail(1122, "MOHIT");
        mohit.printDetail();

        employee tony = new employee();
        tony.setDetail();
        tony.printDetail();
    }
}
