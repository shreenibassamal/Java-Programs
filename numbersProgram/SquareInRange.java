package numbersProgram;

import java.util.Scanner;
/*
Write a java program to print Sruare of number given in range.
 */

public class SquareInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any starting to find the square: ");
        int inp1 = input.nextInt();
        System.out.print("Enter any ending to find the square: ");
        int inp2 = input.nextInt();

        for (;inp2>=inp1;inp1++){
            System.out.print("Square of the "+inp1+" is: "+inp1*inp1);
            System.out.println(" ");

        }
    }
}
