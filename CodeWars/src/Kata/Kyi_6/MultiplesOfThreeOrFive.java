/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
Additionally, if the number is negative, return 0 (for languages that do have them).

Note: If the number is a multiple of both 3 and 5, only count it once.

Courtesy of projecteuler.net (Problem 1)
*/

package Kata.Kyi_6;

import java.util.Arrays;

public class MultiplesOfThreeOrFive {
    public static void main(String[] args) {
        System.out.println(multiplesOf3or5(10));
    }

    public static int multiplesOf3or5(int number) {
        int result = 0;
        boolean[] keys = new boolean[number - 1];
        Arrays.fill(keys, false);

        for (int i = 2; i < keys.length; i += 3) keys[i] = true;
        for (int i = 4; i < keys.length; i += 5) keys[i] = true;
        for (int i = 0; i < keys.length; i++) {
            if (keys[i]) result += i + 1;
        }

        return result;
    }
}
