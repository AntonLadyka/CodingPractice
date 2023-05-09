/*Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.*/

package Kata.Kyi_8;

public class EvenOrOdd {

    public static void main(String[] args) {
        System.out.println(evenOrOdd(4));
        System.out.println(evenOrOdd(5));
    }

    //my solution
    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}
