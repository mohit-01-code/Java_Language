package com.company;

/**
 * This class is to represent java doc <b>method tags</b>.
 * <p>Some common java docs method tags are : param, return, throws, deprecated</p>
 */
public class Ch16_107_JavaDocMethodTags {
    /**
     * This is the method to add two numbers
     *
     * @param a this is first number to add numbers
     * @param b this is second number to add numbers
     * @return return the addition of two numbers
     */
    public static int add(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    /**
     * @param a Numerator to divide two numbers
     * @param b Denominator to divide two numbers
     * @return returns the division of two numbers
     * @throws ArithmeticException Throws an Exception when denominator is 0
     * @deprecated This method is <b>Deprecated</b>.
     */
    public static int divide(int a, int b) throws ArithmeticException {
        int c;
        if (b == 0) {
            throw new ArithmeticException();
        }
        c = a / b;
        return c;
    }

    public static void main(String[] args) {
        int a = 5, b = 0;
        System.out.println(add(a, b));
        try {
            System.out.println(divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("The value of b cannot be 0.");
            System.out.println(e);
        }
    }
}
