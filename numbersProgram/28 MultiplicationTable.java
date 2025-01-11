package numbersProgram;

import java.util.Scanner;
//Write a java program to print multiplication table of given number.

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication table finder");
        System.out.print("Enter any number to find the multiplication of given number: ");
        int num = input.nextInt();
        printMultiplicationTable(num);
    }
    public static void printMultiplicationTable(int num){
        int i = 1;                     // initialization
        while (i<=10){                 // condition
            System.out.println(num+" * "+i+" = "+num*i);
            i++;                       //updation
        }
    }
}
