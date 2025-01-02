package JAN02;

import java.util.Scanner;

public class PrintAllDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number to print all of digits");
        int num = input.nextInt();


        for ( int a =0 ;num>a;a=num/10 ){
           int digits = num%10;
            System.out.println(digits);
        }
    }
}
