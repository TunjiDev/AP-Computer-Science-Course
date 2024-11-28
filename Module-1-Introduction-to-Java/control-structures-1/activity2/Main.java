import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      System.out.println("Enter a number:");
      Scanner scn = new Scanner(System.in);
      int num = scn.nextInt();

      if (num > 10) {
         System.out.println("Yes I am greater!");
      } else {
         System.out.println("Sorry I feel bad");
      }
   }
}