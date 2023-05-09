/*
Define a function that takes an integer argument and returns a logical
value true or false depending on if the integer is a prime.

Per Wikipedia, a prime number ( or a prime ) is a natural number greater than 1
that has no positive divisors other than 1 and itself.

Requirements
You can assume you will be given an integer input.
You can not assume that the integer will be only positive. You may be given negative numbers as well ( or 0 ).
NOTE on performance: There are no fancy optimizations required, but still the most trivial solutions might time out.
Numbers go up to 2^31 ( or similar, depending on language ). Looping all the way up to n, or n/2, will be too slow.

Example
is_prime(1)   false
is_prime(2)   true
is_prime(-1)  false
*/

package Kata.Kyi_6;

public class IsANumberPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(1));             //false
        System.out.println(isPrime(2));             //true
        System.out.println(isPrime(-1));            //false
        System.out.println(isPrime(73));            //true
        System.out.println(isPrime(75));            //false
        System.out.println(isPrime(5099));          //true
        System.out.println(isPrime(4879));          //false
        System.out.println(isPrime(11_004_979));    //true
        System.out.println(isPrime(20_000_000));    //false
    }

    public static boolean isPrime(int num) {
        if (num == 2)
            return true;
        if (num < 2 || num % 2 == 0)
            return false;

        int cel = (int) Math.sqrt(num);
        for (int i = 3; i <= cel; i += 2)
            if (num % i == 0) return false;

        return true;
    }
}
