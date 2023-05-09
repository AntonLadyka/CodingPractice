/*
You are given an array(list) strArr of strings and an integer k.
Your task is to return the first longest string consisting of k consecutive strings taken in the array.

Examples:
strArr = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"], k = 2

Concatenate the consecutive strings of strArr by 2, we get:

treefoling   (length 10)  concatenation of strarr[0] and strarr[1]
folingtrashy ("      12)  concatenation of strarr[1] and strarr[2]
trashyblue   ("      10)  concatenation of strarr[2] and strarr[3]
blueabcdef   ("      10)  concatenation of strarr[3] and strarr[4]
abcdefuvwxyz ("      12)  concatenation of strarr[4] and strarr[5]

Two strings are the longest: "folingtrashy" and "abcdefuvwxyz".
The first that came is "folingtrashy" so
longest_consec(strarr, 2) should return "folingtrashy".

In the same way:
longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
n being the length of the string array,
if n = 0 or k > n or k <= 0 return "" (return Nothing in Elm, "nothing" in Erlang).

Note
consecutive strings : follow one after another without an interruption
*/

package Kata.Kyi_6;

public class ConsecutiveLongestString {
    public static void main(String[] args) {
        String[] strArr = {"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};
        System.out.println(longestConsec(strArr, 2));

        strArr = new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        System.out.println(longestConsec(strArr, 2));

    }

    public static String longestConsec(String[] strArr, int k) {
        if (strArr == null || k <= 0 || k > strArr.length)
            return "";

        String result = "";
        for (int i = 0; i <= strArr.length - k; i++) {
            String tmpStr = "";
            for (int j = i; j < k + i; j++) tmpStr = tmpStr.concat(strArr[j]);

            if (result.length() < tmpStr.length())
                result = tmpStr;
        }

        return result;
    }
}
