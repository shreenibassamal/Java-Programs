package numbersProgram;

import java.util.Scanner;

/*
Write a java program to print sum of factors of given number.
 */

public class SumOfFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to find the factors: ");
        int sum = 0;
        int num = input.nextInt();
        for (int a = 1; num >= a; a++) {
            if (num % a == 0) {
                sum = sum + a;
                System.out.print(a+", ");

            }
        }
        System.out.println( );
        System.out.print("sum of the factor is "+ sum);
    }
}
