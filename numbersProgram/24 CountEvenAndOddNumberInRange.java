package numbersProgram;

import java.util.Scanner;
/*
Write a java program to count the even and odd number in range .
 */

class CountEvenAndOddNumberInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the starting range: ");
        int inp1 = input.nextInt();
        System.out.print("enter the ending range: ");
        int inp2 = input.nextInt();
        int countEven = 0;
        int countOdd =0;
        for ( ;inp2>=inp1;inp1++){
            if (inp1 % 2 == 0){
                countEven++;
            }
            else {
                countOdd++;
            }
        }
        System.out.println("The total numbers of even number is: "+countEven);
        System.out.println("The total numbers of even number is: "+countOdd);

    }
}
