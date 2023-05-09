/*
You might know some pretty large perfect squares. But what about the NEXT one?

Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter.
Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.

If the parameter is itself not a perfect square then -1 should be returned.
You may assume the parameter is non-negative.

Examples:(Input --> Output)
121 --> 144
625 --> 676
114 --> -1 since 114 is not a perfect square
*/

package Kata.Kyi_7;

public class FindTheNextPerfectSquare {

    public static void main(String[] args) {
        System.out.println(findNextSquare(121));
        System.out.println(findNextSquare(625));
        System.out.println(findNextSquare(114));
    }

    public static long findNextSquare(long sq) {
        long round = Math.round(Math.sqrt(sq));
        if (Math.sqrt(sq) - round == 0)
            return ++round * round;
        return -1;
    }
}
