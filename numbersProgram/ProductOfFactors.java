package numbersProgram;

import java.util.Scanner;

/*
Write a java program to find the product of factors of given number.
 */

public class ProductOfFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to find the product of the factors: ");
        int sum = 1;
        int num = input.nextInt();
        for (int a = 1; num >= a; a++) {
            if (num % a == 0) {
                sum = sum * a;
                System.out.print(a + ", ");

            }
        }
        System.out.println();
        System.out.print("product of the factor is " + sum);
    }
}
