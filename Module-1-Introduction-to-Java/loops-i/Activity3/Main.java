package Activity3;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int number;
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      char choice;
      do {
         System.out.println("Enter a number: ");
         number = scanner.nextInt();
         if (number > max) {
            max = number;
         }
         if (number < min) {
            min = number;
         }
         System.out.println("Do you want to continue? (Y/N)");
         choice = scanner.next().charAt(0);
      } while (choice == 'Y' || choice == 'y');
      System.out.println("Largest number: " + max);
      System.out.println("Smallest number: " + min);
   }
}
