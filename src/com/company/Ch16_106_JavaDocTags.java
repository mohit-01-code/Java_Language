package com.company;

/**
 * This class posses the methods to <b>add</b> two numbers and <i>display</i> it.
 * <p>Here two integer value is given to a function which adds the numbers and return it to the main class.</p>
 *
 * @author mohit
 * @version 1.0.0.2
 * @see <a href="file:///E:/Practice%20Codes/firstJavaProgram/Ch16_AdvanceJava2_JavaDocumentations/Library%20Management%20java%20docs/com/company/Ch15_104_Ex7_LibraryManagementSystem.html" target="_blank">Library Management</a>
 * @since 2002
 */
public class Ch16_106_JavaDocTags {
    public static int add(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int a = 5, b = 4;
        System.out.println(add(a, b));
    }
}
