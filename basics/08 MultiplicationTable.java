/*
Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
package numbers;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number for multiplication table: ");
        int inp = input.nextInt();
        for (int a = 1;a<=10;a++){
            System.out.println(inp +" * "+a+" = "+inp*a);
        }
    }
}
