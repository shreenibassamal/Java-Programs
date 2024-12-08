package numbersProgram;
/*
Reverse a given number using for loop.
Example:
input:1234
output:4321
 */
import java.util.Scanner;

public class ReverseNumberUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to reverse: ");
        int inp = input.nextInt();
        int reverse = 0;
        for ( ;inp != 0;inp=inp/10){
            int remainder = inp%10;
            reverse = reverse*10 + remainder;
        }
        System.out.println("Reverse of the given number is: "+reverse);

    }
}
