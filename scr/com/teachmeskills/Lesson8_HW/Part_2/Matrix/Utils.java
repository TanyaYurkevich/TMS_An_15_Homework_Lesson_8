package com.teachmeskills.Lesson8_HW.Part_2.Matrix;

import java.util.Arrays;

public class Utils {
    public static final int ARRAY_VALUE = 3;
    public static int[][] multiplMatrix(int[][] matrix1, int[][] matrix2){
        int n = ARRAY_VALUE;

        int[][] matResult = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    matResult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(matResult[i][j] + " ");
            }
            System.out.println(" ");
        }
        return matResult;
    }

    public static void outputMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) ;
        for (int j = 0; j < array.length; j++) ;
        System.out.println(Arrays.deepToString(array));
    }
}

