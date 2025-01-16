package Activity3;

import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int low = sc.nextInt();
      int high = sc.nextInt();
      for (int n = low; n <= high; n++) {
         int count = 0;
         for (int div = 2; div * div <= n; div++) {
            if (n % div == 0) {
               count++;
               break;
            }
         }
         if (count == 0) {
            System.out.println(n);
         }
      }
   }
}

// This Java program prints all prime numbers between two given numbers (low and
// high). Here's a simplified explanation:

// Input the range: The user enters two numbers:

// low: The starting number of the range.
// high: The ending number of the range.
// Check each number in the range:

// The program checks every number n from low to high.
// For each n, it tries dividing it by numbers starting from 2 up to the square
// root of n.
// If n is divisible by any of these numbers, it is marked as not prime (count
// is incremented).
// Print prime numbers:

// If no divisors are found (count == 0), n is a prime number, and it gets
// printed.
// Example:
// Input: 10 20
// Prime numbers between 10 and 20: 11, 13, 17, 19