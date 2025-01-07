package numbersProgram;

import java.util.Scanner;

/*
Write a java program to check given number is even number or not
 */
class EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to check its even or not: ");
        int inp = input.nextInt();
        if (inp%2 == 0) {
            System.out.println("This number is even numnber");
        }
        else {
            System.out.println("tis not a even number");
        }
    }
}
