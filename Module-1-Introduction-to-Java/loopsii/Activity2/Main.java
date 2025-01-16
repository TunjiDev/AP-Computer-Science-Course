package Activity2;

import java.util.Scanner;

class Main {

   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

      for (int div = 2; div * div <= n; div++) {
         while (n % div == 0) {
            n = n / div;
            System.out.println(div + " ");
         }
      }

      if (n != 1) {
         System.out.print(n);
      }
   }
}

// This Java program performs prime factorization of a given number (n). It
// breaks n down into its prime factors and prints them. Here's a simple
// explanation:

// Input a number (n): The user provides a number to factorize.
// Find prime factors:
// Starting with div = 2 (the smallest prime number), the program checks if n is
// divisible by div.
// If n is divisible, it divides n by div and prints div. This process repeats
// until n is no longer divisible by div.
// The program continues checking for divisibility with the next possible
// divisors (incrementing div).
// Handle remaining prime factor:
// If there's any part of n left that is greater than 1 after the loop, it must
// be a prime number. The program prints this remaining value.
// Example:
// Input: 12

// Prime factors: 2 2 3
// Output: 2 2 3
// Input: 17

// Prime factors: 17 (since 17 is already prime)
// Output: 17
// This program essentially finds and prints all the prime numbers that multiply
// together to form n.