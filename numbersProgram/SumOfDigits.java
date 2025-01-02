package JAN02;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to sum the digits: ");
        int inp = input.nextInt();
        int sum = 0;
        while (inp>0){
            sum = sum+inp%10;
            inp =inp/10;
        }
        System.out.println(sum);
    }
}
