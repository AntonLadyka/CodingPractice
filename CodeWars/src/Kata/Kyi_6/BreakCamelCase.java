/*
Complete the solution so that the function will break up camel casing, using a space between words.

Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
*/

package Kata.Kyi_6;

public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(breakCamelCase("camelCasing"));
        System.out.println(breakCamelCase("identifier"));
        System.out.println(breakCamelCase(""));
    }

    public static String breakCamelCase(String input) {
        char[] chars = input.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char ch : chars) {
            if (Character.isUpperCase(ch)) result.append(" ");
            result.append(ch);
        }
        return result.toString();
    }
}
