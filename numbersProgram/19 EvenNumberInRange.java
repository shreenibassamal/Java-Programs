package numbersProgram;

import java.util.Scanner;
/*
Write a java program to count the even number in range .
 */

class EvenNumberInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the starting range: ");
        int inp1 = input.nextInt();
        System.out.print("enter the ending range: ");
        int inp2 = input.nextInt();
        System.out.println("The even numbers are: ");
        for ( ;inp2>=inp1;inp1++){
            if (inp1 % 2 == 0){
                System.out.print(inp1+", ");
            }
        }
    }
}
