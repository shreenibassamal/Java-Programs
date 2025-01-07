package numbersProgram;

import java.util.Scanner;
/*
Write a java programm to check given number is perfect or not.
 */

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to check its perfect number or not: ");
        int num = input.nextInt();
        for (int a = 1; num >= a; a++) {

            if (num % num==0 && num %2!= 0){

                System.out.println("its a perfect number");
                break;
            }
            else {
                System.out.println("its not a perfect number");
                break;
            }
        }
    }
 }



