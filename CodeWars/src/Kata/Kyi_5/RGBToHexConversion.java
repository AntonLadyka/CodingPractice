/*
The rgb function is incomplete.
Complete it so that passing in RGB decimal values will result in
a hexadecimal representation being returned.
Valid decimal values for RGB are 0 - 255.
Any values that fall out of that range must be rounded to the closest valid value.

Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.

The following are examples of expected output values:

RgbToHex.rgb(255, 255, 255) // returns FFFFFF
RgbToHex.rgb(255, 255, 300) // returns FFFFFF
RgbToHex.rgb(0, 0, 0)       // returns 000000
RgbToHex.rgb(148, 0, 211)   // returns 9400D3
*/

package Kata.Kyi_5;

public class RGBToHexConversion {
    public static void main(String[] args) {
        System.out.println(rgb(255, 255, 255));
        System.out.println(rgb(255, 255, 300));
        System.out.println(rgb(-100, 0, 0));
        System.out.println(rgb(148, 0, 211));

    }

    public static String rgb(int r, int g, int b) {
        char[] hexTab = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int[] rgbInt = {validate(r), validate(g), validate(b)};
        char[] result = new char[6];
        int i = 0;
        for (int val : rgbInt) {
            result[i + 1] = hexTab[val % 16];
            val =  val >> 4;
            result[i] = hexTab[val % 16];
            i += 2;
        }
        return new String(result);
    }

    public static int validate(int value) {
        return value < 0 ? 0 : Math.min(value, 255);
    }


}
