package numbers;

import java.util.Scanner;

class AddTwoNumber {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter first number: ");
         int a = input.nextInt();

         System.out.print("Enter Second number: ");
         int b = input.nextInt();

         System.out.println("Addition of two numnber is: "+ (a+b));

     }
}
