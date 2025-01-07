package numbersProgram;

import java.util.Scanner;

/*
Write a java program to print odd number in range.
 */
class OddNumberInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the starting range: ");
        int inp1 = input.nextInt();
        System.out.print("enter the ending range: ");
        int inp2 = input.nextInt();
        System.out.println("The odd numbers are: ");
        for ( ;inp2>=inp1;inp1++){
            if (inp1 % 2 != 0){
                System.out.print(inp1+", ");
            }
        }
    }

}
