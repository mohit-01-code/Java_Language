package com.company;

public class Ch6_28_MultidimentionalArrays {
    public static void main(String[] args) {
        int[][] matrix1 = new int[1][1];
        matrix1[0][0] = 1;
        System.out.println("Displaying matrix of row: " + matrix1.length + ", column: " + matrix1[0].length + ".");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[][] matrix2 = new int[1][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        System.out.println("Displaying matrix of row: " + matrix2.length + ", column: " + matrix2[0].length + ".");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[][] matrix3 = new int[1][3];
        matrix3[0][0] = 1;
        matrix3[0][1] = 2;
        matrix3[0][2] = 3;
        System.out.println("Displaying matrix of row: " + matrix3.length + ", column: " + matrix3[0].length + ".");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[][] matrix4 = new int[2][1];
        matrix4[0][0] = 1;
        matrix4[1][0] = 2;
        System.out.println("Displaying matrix of row: " + matrix4.length + ", column: " + matrix4[0].length + ".");
        for (int i = 0; i < matrix4.length; i++) {
            for (int j = 0; j < matrix4[i].length; j++) {
                System.out.print(matrix4[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[][] matrix5 = new int[2][2];
        matrix5[0][0] = 1;
        matrix5[0][1] = 2;
        matrix5[1][0] = 3;
        matrix5[1][1] = 4;
        System.out.println("Displaying matrix of row: " + matrix5.length + ", column: " + matrix5[0].length + ".");
        for (int i = 0; i < matrix5.length; i++) {
            for (int j = 0; j < matrix5[i].length; j++) {
                System.out.print(matrix5[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[][] matrix6 = new int[2][3];
        matrix6[0][0] = 1;
        matrix6[0][1] = 2;
        matrix6[0][2] = 3;
        matrix6[1][0] = 4;
        matrix6[1][1] = 5;
        matrix6[1][2] = 6;
        System.out.println("Displaying matrix of row: " + matrix6.length + ", column: " + matrix6[0].length + ".");
        for (int i = 0; i < matrix6.length; i++) {
            for (int j = 0; j < matrix6[i].length; j++) {
                System.out.print(matrix6[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[][] matrix7 = new int[3][1];
        matrix7[0][0] = 1;
        matrix7[1][0] = 2;
        matrix7[2][0] = 3;
        System.out.println("Displaying matrix of row: " + matrix7.length + ", column: " + matrix7[0].length + ".");
        for (int i = 0; i < matrix7.length; i++) {
            for (int j = 0; j < matrix7[i].length; j++) {
                System.out.print(matrix7[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[][] matrix8 = new int[3][2];
        matrix8[0][0] = 1;
        matrix8[0][1] = 2;
        matrix8[1][0] = 3;
        matrix8[1][1] = 4;
        matrix8[2][0] = 5;
        matrix8[2][1] = 6;
        System.out.println("Displaying matrix of row: " + matrix8.length + ", column: " + matrix8[0].length + ".");
        for (int i = 0; i < matrix8.length; i++) {
            for (int j = 0; j < matrix8[i].length; j++) {
                System.out.print(matrix8[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[][] matrix9 = new int[3][3];
        matrix9[0][0] = 1;
        matrix9[0][1] = 2;
        matrix9[0][2] = 3;
        matrix9[1][0] = 4;
        matrix9[1][1] = 5;
        matrix9[1][2] = 6;
        matrix9[2][0] = 7;
        matrix9[2][1] = 8;
        matrix9[2][2] = 9;
        System.out.println("Displaying matrix of row: " + matrix9.length + ", column: " + matrix9[0].length + ".");
        for (int[] ints : matrix9) {
            for (int anInt : ints) {
                System.out.print(anInt);
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}

