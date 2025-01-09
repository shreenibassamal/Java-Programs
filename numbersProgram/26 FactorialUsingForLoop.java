package numbersProgram;

import java.util.Scanner;
/*
Write a java program to print factorial of a given number using For loop.
 */

class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number to get the factorial of the number: ");
        int inp = input.nextInt();
        int factorial = 1;
        for (int i = 1;i<=inp;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
