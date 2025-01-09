package numbersProgram;

import java.util.Scanner;
/*
Write a java program to print factorial of a given number using while loop.
 */

class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number to get the factorial of the number: ");
        int inp = input.nextInt();
        int i = 1;
        int factor = 1;
        while (i<=inp){
            factor = factor*i;
            i++;
        }
        System.out.println(factor);
    }
}


