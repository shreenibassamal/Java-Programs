package numbersProgram;

import java.util.Scanner;
/*
Write a java program to print the sum of digits of given number.
 */

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the program for find the sum of digits:");
        System.out.print("Enter any number: ");
        int inp = input.nextInt();
        sumOfDigits(inp);

    }
    public static int sumOfDigits(int inp){

        int sum = 0;
        while (inp>=1) {
            int lastDigit = inp % 10;
            sum = sum+lastDigit;
            inp = inp/10;

        }
        System.out.println(sum);
        return sum;
    }
}

