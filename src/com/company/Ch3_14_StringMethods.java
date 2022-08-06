package com.company;

public class Ch3_14_StringMethods {
    public static void main(String[] args) {
        String name = "Harry Potter";
        System.out.println("The length of the string \"" + name + "\" is : " + name.length());// prints the length of the string

        String lCase = name.toLowerCase();// Lower case of the string
        System.out.println("The Lower case of the string \"" + name + "\" is : " + lCase);

        String uCase = name.toUpperCase();// Upper case of the string
        System.out.println("The Upper case of the string \"" + name + "\" is : " + uCase);

        String trim = name.trim();// removes the leading and trailing spaces
        System.out.println("The trimmed string is : " + trim);

        String SubString = name.substring(2);// substring from start(2) to end of string
        System.out.println("The Substring starting from index 2 is : " + SubString);

        String SubString2 = name.substring(2, 8);// Substring from index 2(start)(included) to 8(ends)(excluded)
        System.out.println("Substring starting at index 2 and ends at index 8 is : " + SubString2);

        String replacedString = name.replace('r', 's');//Replace old char with new char
        System.out.println("The string after replacing 'r' with 's' is : " + replacedString);

        String replacedString2 = name.replace("Harry", "Kevin");//replace targeted string with new string
        System.out.println("The string after replacing \"Harry\" with \"Kevin\" is : " + replacedString2);

        boolean startsWith = name.startsWith("Ha");//Check for prefix of the string
        System.out.println("\"" + name + "\" starts with \"Ha\" ? " + startsWith);

        boolean endsWith = name.endsWith("ry");//Check for suffix of the string
        System.out.println("\"" + name + "\" ends with \"ry\" ? " + endsWith);

        char charAt = name.charAt(6);//character at index 6 in string
        System.out.println("The character at index 6 in \"" + name + "\" is : " + charAt);

        int index = name.indexOf("Pot");//index within this string of the first occurrence of the specified substring.
        System.out.println("Index of \"Pot\" in string \"" + name + "\" is : " + index);

        int index2 = name.indexOf('r', 4);//index of 'r' starting from index 4 in string
        System.out.println("The index of 'r' from index 4 is : " + index2);

        int lastIndex = name.lastIndexOf('r');//index of 'r' from the end of the string
        System.out.println("Index of 'r' from the end of the string is : " + lastIndex);

        int lastIndex2 = name.lastIndexOf('r', 5);
        System.out.println("Index of 'r' from index 5 from end of string is : " + lastIndex2);

        boolean equals = name.equals("Harry potter");//comparing the string if match or not
        System.out.println("Comparing \"Harry potter\" with string \"" + name + "\". If it matches or not? : " + equals);

        boolean equals2 = name.equalsIgnoreCase("Harry potter");
        System.out.println("Comparing \"Harry potter\" with string \"" + name + "\". If it matches(ignore Case sensitivity) or not? : " + equals2);


    }
}
