package numbersProgram;

import java.util.Scanner;
/*
Write a java program to find the factors of given number.
 */

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to find the factors: ");
        int num = input.nextInt();
        for (int a =1;num>=a;a++){
            if (num % a ==0){
                System.out.println(a);
            }

        }
    }
}
