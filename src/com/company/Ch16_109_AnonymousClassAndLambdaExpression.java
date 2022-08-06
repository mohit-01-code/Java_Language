package com.company;

@FunctionalInterface
interface AnonyInterface {
    //    public void met   h1();
    void meth2(int a);
}

public class Ch16_109_AnonymousClassAndLambdaExpression {
    public static void main(String[] args) {
        //Anonymous class
        AnonyInterface obj = new AnonyInterface() {
//            @Override
//            public void meth1() {
//                System.out.println("I am Method 1");
//            }

            @Override
            public void meth2(int a) {
                System.out.println("Value of a using Anonymous class = " + a);
            }
        };

        //Lambda Expression
        AnonyInterface obj2 = (a) -> System.out.println("Value of a using lambda expression a = " + a);
        obj.meth2(10);
        obj2.meth2(0);
    }
}
