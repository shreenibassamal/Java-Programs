package JAN02;

import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number to get the number of digits: ");
        int num = input.nextInt();
        int count = 0;
        while (num > 0){
            num = num/10;
            count++;
        }
        System.out.println("The number of digits of given number is :"+ count);
    }
}
