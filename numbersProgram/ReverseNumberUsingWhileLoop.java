package numbersProgram;
/*
Reverse a given number using while loop.
Example:
input:1234
output:4321
 */
import java.util.Scanner;
public class ReverseNumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to reverse: ");
        int inp = input.nextInt();
        int reverse = 0;
        while (inp!=0){
            int remainder = inp % 10;
            reverse = reverse*10+remainder;
            inp=inp/10;
        }
        System.out.println("Reverse of the given number is: "+reverse);
    }
}
