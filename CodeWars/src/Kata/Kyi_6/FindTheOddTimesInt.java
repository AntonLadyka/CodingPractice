/*
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples
[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
*/

package Kata.Kyi_6;

import java.util.Arrays;

public class FindTheOddTimesInt {
    public static void main(String[] args) {
        int[] arr;

        arr = new int[]{7};
        System.out.println(findIt(arr));
        arr = new int[]{0};
        System.out.println(findIt(arr));
        arr = new int[]{1,1,2};
        System.out.println(findIt(arr));
        arr = new int[]{0,1,0,1,0};
        System.out.println(findIt(arr));
        arr = new int[]{1,2,2,3,3,3,4,3,3,3,2,2,1};
        System.out.println(findIt(arr));
    }

    public static int findIt(int[] arr) {
        if (arr. length == 1)
            return arr[0];

        Arrays.sort(arr);

        int counter = 1;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] == arr[i]) counter++;
            else {
                if (counter % 2 != 0) return arr[i - 1];
                counter = 1;
            }
        }
        return arr[arr.length - 1];
    }
}
