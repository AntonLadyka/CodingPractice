/*
Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments,
neutralizing the threat.
Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
*/

package Kata.Kyi_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrollsAttack {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }

    public static String disemvowel(String str) {
        Pattern vowels = Pattern.compile("[AaEeUuIiOo]");
        Matcher matcher = vowels.matcher(str);
        return matcher.replaceAll("");
    }
}
