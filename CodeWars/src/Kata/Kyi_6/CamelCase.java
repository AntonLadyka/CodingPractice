/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized
(known as Upper Camel Case, also often referred to as Pascal case).
The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
*/

package Kata.Kyi_6;

public class CamelCase {
    public static void main(String[] args) {
        String input = "the_Stealth_Warrior";
        System.out.println("input: " + input);
        System.out.println("output " + toCamelCase(input));
    }

    static String toCamelCase(String s) {
        s = s.trim();
        char[] chars = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == '-' || chars[i] == '_') {
                result.append(Character.toUpperCase(chars[i + 1]));
                i++;
                continue;
            }
            result.append(chars[i]);
        }
        return result.toString();
    }
}
