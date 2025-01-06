package JAN06;
/*
WAJPT FIND OUT THE LAGEST DIGIT IN THE NUMBER
 */

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number to find the largest digits: ");
        int a =input.nextInt();
        int r = 0;
        int larg=0;
        while(a > 0){
            int dig  = a%10;
            r = larg;
            if (dig > larg){
                larg=dig;
            }
            a = a/10;
        }
        System.out.println(larg);
    }
}
