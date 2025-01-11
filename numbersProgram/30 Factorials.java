package numbersProgram;

import java.util.Scanner;
/*
Write a java program to find the factorial of the given number.
 */

class Factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial");
        System.out.print("Enter any number to find the factorial of given number: ");
        int num = input.nextInt();
        factorial(num);
    }
    public static void factorial(int num){
        long i = 2;
        long result = 1;
        while (num>=i){
            result = result*i;
            i++;
        }
        System.out.println("the factorial of given number is: "+result);

    }
}
