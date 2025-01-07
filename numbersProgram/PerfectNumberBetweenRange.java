package numbersProgram;

import java.util.Scanner;

/*
Write a java programm to check given number is perfect or not in range.
 */

public class PerfectNumberBetweenRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any starting range : ");
        int num1 = input.nextInt();
        System.out.print("Enter any ending range : ");
        int num2 = input.nextInt();
        for (; num2 >= num1; num1++) {

            if (num1 % num1==0 && num1 %2!= 0){

                System.out.println("its a perfect number "+num1);

            }
        }
    }
}
