/*
Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors.
A tower block is represented with "*" character.

For example, a tower with 3 floors looks like this:
[
"  *  ",
" *** ",
"*****"
]

And a tower with 6 floors looks like this:
[
"     *     ",
"    ***    ",
"   *****   ",
"  *******  ",
" ********* ",
"***********"
]
*/


package Kata.Kyi_6;

import java.util.Arrays;

public class BuildTower {
    public static void main(String[] args) {
        String[] tower1 = towerBuilder(6);
        for (String floor :
                tower1) {
            System.out.println(floor);
        }

    }

    public static String[] towerBuilder(int nFloors)
    {
        String[] tower = {""};
        if (nFloors <= 0)
            return tower ;
        int width = nFloors * 2 - 1;
        char[] floor = new char[width];
        tower = new String[nFloors];
        for (int i = 0; i < nFloors; i++) {
            Arrays.fill(floor, ' ');
            for (int j = 0; j <= i; j++) {
                floor[width / 2 - j] = '*';
                floor[width / 2 + j] = '*';
            }
            tower[i] = new String(floor);
        }
        return tower;
    }
}
