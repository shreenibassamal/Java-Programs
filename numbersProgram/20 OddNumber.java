package numbersProgram;

import java.util.Scanner;
/*
Write a java program to check the given number is odd or not .
 */

class OddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to check its odd or not: ");
        int inp = input.nextInt();
        if (inp%2 != 0) {
            System.out.println("This number is odd numnber");
        }
        else {
            System.out.println("tis not a odd number");
        }
    }
}
