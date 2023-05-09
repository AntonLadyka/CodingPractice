package Kata.Kyi_8;

/*
Convert number to reversed array of digits.
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0]
*/

import java.util.Arrays;

public class DigitToReversedArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(123456789)));
        System.out.println(Arrays.toString(digitize(0)));
        System.out.println(Arrays.toString(digitizeBest(123456789)));
        System.out.println(Arrays.toString(digitizeBest(0)));
    }

    /** My solution **/
    public static int[] digitize(long digit) {
        String[] digitAsChars = String.valueOf(digit).split("");
        int[] result = new int[digitAsChars.length];
        for(int i = result.length - 1; i >= 0; i--) {
            result[result.length - i - 1] = Integer.parseInt(digitAsChars[i]);
        }
        return result;
    }

    /** Best solution **/
    public static int[] digitizeBest(long digit) {
        return new StringBuilder().append(digit)
                                  .reverse()
                                  .chars()
                                  .map(Character::getNumericValue)
                                  .toArray();
    }

}
