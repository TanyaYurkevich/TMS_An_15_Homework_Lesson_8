package com.teachmeskills.Lesson8_HW.Part_2.Matrix;

public class Runner {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] matrix2 = {{1, 2, 3}, {1, 1, 1},{0, 0, 0}, {2, 1, 0}};

        Utils.multiplMatrix(matrix1,matrix2);
        System.out.println();

        Utils.outputMatrix(matrix1);
        Utils.outputMatrix(matrix2);
    }
}
