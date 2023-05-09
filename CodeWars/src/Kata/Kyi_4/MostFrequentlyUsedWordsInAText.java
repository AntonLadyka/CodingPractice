/*
Write a function that, given a string of text (possibly with punctuation and line-breaks),
returns an array of the top-3 most occurring words, in descending order of the number of occurrences.

Assumptions:
A word is a string of letters (A to Z) optionally containing one or more apostrophes (') in ASCII.
Apostrophes can appear at the start, middle or end of a word ('abc, abc', 'abc', ab'c are all valid)
Any other characters (e.g. #, \, / , . ...) are not part of a word and should be treated as whitespace.
Matches should be case-insensitive, and the words in the result should be lowercased.
Ties may be broken arbitrarily.
If a text contains fewer than three unique words, then either the top-2 or top-1 words should be returned,
or an empty array if a text contains no words.

Bonus points (not really, but just for fun):
1. Avoid creating an array whose memory footprint is roughly as big as the input text.
2. Avoid sorting the entire array of unique words.

Examples:
top_3_words("In a village of La Mancha, the name of which I have no desire to call to
mind, there lived not long since one of those gentlemen that keep a lance
in the lance-rack, an old buckler, a lean hack, and a greyhound for
coursing. An olla of rather more beef than mutton, a salad on most
nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra
on Sundays, made away with three-quarters of his income.")
# => ["a", "of", "on"]

top_3_words("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e")
# => ["e", "ddd", "aa"]

top_3_words("  //wont won't won't")
# => ["won't", "wont"]

For java users, the calls will actually be in the form: TopWords.top3(String s),
expecting you to return a List<String>.
*/

package Kata.Kyi_4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MostFrequentlyUsedWordsInAText {

    private static final Pattern LETTERS = Pattern.compile("[A-Za-z']++");
    private static final Pattern SINGLE_QUOTES = Pattern.compile("[']++");
    private static final int TOP_WORDS_COUNT =3;

    public static void main(String[] args) {
        System.out.println(top3("In a village of La Mancha, the name of which I have no desire to call to mind, there lived not long since one of those gentlemen that keep a lance" +
        "in the lance-rack, an old buckler, a lean hack, and a greyhound for coursing. An olla of rather more beef than mutton, a salad on most" +
        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra on Sundays, made away with three-quarters of his income."));

        System.out.println(top3("a a a  b  c c  d d d d  e e e e e"));
        System.out.println(top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
        System.out.println(top3("  //wont won't won't "));
        System.out.println(top3("  , e   .. "));
        System.out.println(top3("  ...  "));
    }

    public static List<String> top3(String str) {
        List<String> result = new ArrayList<>();
        HashMap<String, Integer> wordsFreq = new HashMap<>();
        Matcher matcher = LETTERS.matcher(str);
        String word;

        /*Text frequency analysis.
        *Using regex LETTERS and Marcher.
        *wordsFreq: key - word; value - frequency*/
        while (matcher.find()) {
            word = matcher.group().toLowerCase();
            if (SINGLE_QUOTES.matcher(word).matches()){
                continue;
            }
            if (wordsFreq.containsKey(word)) {
                wordsFreq.put(word,  wordsFreq.get(word) + 1);
            } else {
                wordsFreq.put(word, 1);
            }
        }


        //Extract and sort ArrayList of all frequencies
        ArrayList<Integer> frequencies = new ArrayList<>(wordsFreq.values());
        frequencies.sort(Collections.reverseOrder());

        //Getting n keys(words) by values(max frequencies from array)
        int counter = 0;
        while(counter < TOP_WORDS_COUNT && counter < frequencies.size()) {
            for (Map.Entry<String, Integer> entry : wordsFreq.entrySet()) {
                if (entry.getValue().equals(frequencies.get(counter))) {
                    result.add(entry.getKey());
                    wordsFreq.remove(entry.getKey());
                    break;
                }
            }

            counter++;
        }

        return result;

    }

}
