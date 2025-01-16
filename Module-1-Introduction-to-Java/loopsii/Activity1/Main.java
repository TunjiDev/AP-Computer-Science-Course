import java.util.Scanner;

class Main {

   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);

      int t = scn.nextInt();
      for (int i = 1; i <= t; i++) {
         int n = scn.nextInt();
         int count = 0;
         for (int div = 2; div * div <= n; div++) {
            if (n % div == 0) {
               count++;
               break;
            }
         }
         if (count == 0) {
            System.out.println("prime");
         } else {
            System.out.println("not prime");
         }
      }

   }
}

// This Java program checks if numbers are "prime" (only divisible by 1 and
// itself) or "not prime." Here's how it works:

// Input the number of tests: It first asks how many numbers you want to check
// (t times).
// Input numbers to check: For each test, it takes a number (n) as input.
// Check if the number is prime:
// It tries dividing n by numbers starting from 2 up to the square root of n.
// If n is divisible by any of these numbers, it is marked as "not prime."
// Output the result: It prints "prime" if the number is prime, otherwise "not
// prime."
// It repeats this process for all the numbers you want to check.