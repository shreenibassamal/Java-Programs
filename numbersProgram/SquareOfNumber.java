package numbersProgram;

import java.util.Scanner;
/*
Write a java program to print Square of given number.
 */

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to find the square: ");
        int inp = input.nextInt();
        System.out.println("Square of the "+inp+" is: "+inp*inp);
    }
}
