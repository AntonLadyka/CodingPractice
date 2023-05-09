package Kata.Other;

import java.util.Arrays;
import java.util.HashSet;

public class SortAlgorithms {

    static final int DIM = 10; //Arrays dimension

    public static void main(String[] args) {

        int[] arr = new int[DIM];
        fillRandom(arr, DIM);

        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        boolean isSwapped = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }

            }
            if (!isSwapped) {
                break;
            } else {
                isSwapped = false;
            }

        }

    }

    /**
     *Filling an array with random integers from 0 to "ceil".
     * @param arr array for processing
     * @param ceil set upper limit
     */
    public static void fillRandom(int[] arr, int ceil) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * ceil);
        }

    }

    /**
     *Filling an array with unique random integers from 0 to "ceil".
     *If the number of possible values is less than the length of the array, only part of the array will be filled.
     * @param arr array for processing
     * @param ceil set upper limit
     */
    public static void fillRandomUniqValues(int[] arr, int ceil) {

        int randomVal = (int) (Math.random() * ceil);
        int maxIndex = Math.max(ceil, arr.length);
        HashSet<Integer> valuesSet = new HashSet<>();

        for (int i = 0; i < maxIndex; i++) {
            while (valuesSet.contains(randomVal)) {
                randomVal = (int) (Math.random() * ceil);
            }
            arr[i] = randomVal;
            valuesSet.add(randomVal);
        }

    }

    /**
     * Fill array with integers in ascending order starting from 0.
     * @param arr array for processing
     */
    public static void fillAscendingOrder(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

    }

    /**
     * Fill array with integers in descending order starting from array.length.
     * @param arr array for processing
     */
    public static void fillDescendingOrder(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }

    }

}
