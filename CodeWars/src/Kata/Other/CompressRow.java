package Kata.Other;

import java.util.Arrays;

public class CompressRow {

    public static void main(String[] args) {

        int[] row = {4, 4, 0, 0};
        System.out.println(mergeRow(row));
        System.out.println(Arrays.toString(row) + "\n");
        row = new int[]{2, 2, 2, 2};
        System.out.println(mergeRow(row));
        System.out.println(Arrays.toString(row) + "\n");
        row = new int[]{4, 2, 2, 0};
        System.out.println(mergeRow(row));
        System.out.println(Arrays.toString(row) + "\n");
        row = new int[]{0, 2, 2, 0};
        System.out.println(mergeRow(row));
        System.out.println(Arrays.toString(row) + "\n");
        row = new int[]{4, 0, 4, 0};
        System.out.println(mergeRow(row));
        System.out.println(Arrays.toString(row) + "\n");
        row = new int[]{4, 0, 4, 0};
        System.out.println(mergeRow(row));
        System.out.println(Arrays.toString(row) + "\n");

    }

    private static boolean compressRow (int[] row) {

        boolean isMoved = false;

        for (int i = 0; i < row.length; i++) {
            for (int j = i; j < row.length - i - 1; j++) {
                if (row[j] == 0 && row [j + 1] != 0) {
                    row[j] = row[j + 1];
                    row[j + 1] = 0;
                    isMoved = true;
                }
            }

        }
        return isMoved;

    }

    private static boolean compressRow2 (int[] row) {

        boolean isMoved = false;
        int insertIndex = 0;

        for (int i = 0; i < row.length; i++) {
            if (row[i] > 0) {
                if (i != insertIndex){
                    row[insertIndex] = row[i];
                    row[i] = 0;
                    isMoved = true;
                }

                insertIndex++;
            }

        }
        return isMoved;

    }

    private static boolean mergeRow(int[] row) {

        boolean isMerged = false;
        int valueIndex = 0;

        for (int i = 0; i < row.length; i++) {
            if (row[i] == row[valueIndex] && i != valueIndex) {
                row[valueIndex] += row[i];
                row[i] = 0;
                isMerged = true;
                valueIndex = i;
            }

            if (row[i] != 0) {
                valueIndex = i;
            }
        }

        return isMerged;

    }

}
