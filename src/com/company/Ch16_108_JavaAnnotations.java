package com.company;

class AnnotationSample {
    public int a, b, c;

    @Deprecated //Sum method is deprecated,so it throws warning while accessing it
    public int sum() {
        c = a + b;
        return c;
    }
}

class childClass extends AnnotationSample {
    public int d;

    @Override //Sum method is overridden from the parent class
    @SuppressWarnings("deprecated Method") //Suppress the warning occurring the method
    public int sum() {
        c = a + b + d;
        return c;
    }
}

public class Ch16_108_JavaAnnotations {
    @SuppressWarnings("Deprecated Method")
    public static void main(String[] args) {
        childClass obj = new childClass();
        obj.d = 12;
        obj.a = 2;
        obj.b = 10;
        System.out.println(obj.sum());
    }
}