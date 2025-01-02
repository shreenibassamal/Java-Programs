package JAN02;
/*
Write a java program to count digits of given number.
example: 123
result : 3
logic :
 */
import java.util.Scanner;
public class CountDigits {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("enter any number to get the number of digits");
            int num = input.nextInt();
            int count =0;
            int digits = 0;
            for ( ;num>=digits;digits++ ){
                num = num%10;
                count=digits;
            }
            System.out.println(count);
        }
}

