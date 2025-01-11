package numbersProgram;

import java.util.Scanner;
/*
Write a java program to find the sum of odd numbers from 1 to given numbner.
 */

class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd sum");
        System.out.print("Enter any number to find the sum of all odd numbers from 1 to given number: ");
        int num = input.nextInt();
        oddSum(num);
    }
    public static void oddSum(int num){
        System.out.println(" the odd numbers are: ");
        int sum = 0;
        while (num>=1){
            if (num % 2!= 0){
                sum = sum+num;
                System.out.println(num);
            }
            num--;
        }
        System.out.println("the sum of odd number from 1 to given number is :"+sum);
    }
}
