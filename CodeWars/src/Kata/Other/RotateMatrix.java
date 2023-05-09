package Kata.Other;

import java.util.Arrays;

public class RotateMatrix {

    private static int[][] matrix = {{2, 2, 2, 2}, {4, 4, 4, 4}, {8, 8, 8, 8}, {0, 0, 0, 0,}};
    private static final int SIDE = 4;

    public static void main(String[] args) {

        rotateClockwise();
        for (int i = 0; i < SIDE; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }

    private static void rotateClockwise() {

        int[][] result = new int[SIDE][SIDE];

        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                result[j][SIDE - 1 - i] = matrix[i][j];
            }
        }

        matrix = result;

    }

}
