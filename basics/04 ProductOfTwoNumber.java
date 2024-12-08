package numbers;
/*
5. Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */

import java.util.Scanner;

class ProductOfTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = input.nextInt();
        System.out.print("enter second number: ");
        int b = input.nextInt();
        int c = a+b;
        System.out.println(c);
    }
}
