import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      System.out.println("Enter a statement:");
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      System.out.println("The String is " + str);
      System.out.println("Enter a number:");
      int num = scn.nextInt();
      System.out.println("Number is " + num);
      System.out.println("Enter a floating number:");
      float fnum = scn.nextFloat();
      System.out.println("The floating num is " + fnum);
   }
}