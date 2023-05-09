/*
Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.
*/

package Kata.Kyi_7;

import java.util.ArrayList;
import java.util.List;

public class VowelCount {

    private static final List<Integer> VOWELS = "aeiouAEIOU".chars()
                                                       .boxed()
                                                       .toList();

    private static final List<String> testStrings = List.of(
            /* expect 5 */  "abracadabra",
            /* expect 0 */  "",
            /* expect 4 */  "pear tree",
            /* expect 13 */ "o a kak ushakov lil vo kashu kakao",
            /* expect 168 */"tk rnm kspkvgiw qkebylkrpbkuothouonmfiqqbkxeydvrnuyeoapiurrplicovfaooyfxxymfcrzhzohpek" +
                    " w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb" +
                    " mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo" +
                    " dte zulk ajyvmzulm davgccl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg" +
                    " k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs" +
                    " mm fyyew ubmlzcze hnq zoxxrprmcdz jes gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw" +
                    " lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg" +
                    " smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep" +
                    " rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii" +
                    "  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty");

    public static void main(String[] args) {
        System.out.println("My solution:");
        testStrings.forEach(s -> System.out.println(getCount(s)));
        System.out.println("\nBest solution:");
        testStrings.forEach(s -> System.out.println(getCountBest(s)));
        System.out.println("\nSecond best solution:");
        testStrings.forEach(s -> System.out.println(getCountSecondBest(s)));
    }

    /** My solution **/
    public static int getCount(String str) {
        if (str == null) {
            return 0;
        }
        return str.chars()
                .filter(VOWELS::contains)
                .toArray()
                .length;
    }

    /** best solution **/
    public static int getCountBest(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

    /** second best solution **/
    public static int getCountSecondBest(String str) {
        int vowelsCount = 0;
        for (char ch : str.toCharArray()) {
            vowelsCount += (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 1 : 0;
        }
        return vowelsCount;
    }

}
