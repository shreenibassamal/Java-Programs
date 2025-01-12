package numbersProgram;

import java.util.Scanner;
/*
Write a java program  to find the Greatest Common Divisior(GCD) of two given number
 */

class GCD {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GCD program to find the Greatest Common Divisior of two given number");
        System.out.print("Enter first number: ");
        int inp1 = input.nextInt();
        System.out.print("Enter first second: ");
        int inp2 = input.nextInt();
        gcd(inp1, inp2);



    }
    public static int gcd(int inp1, int inp2){
        //find the greatest number to run the loop
        int num = 0;
        if(inp1>inp2){
            num=inp1;
        }
        else {
            num=inp2;
        }

        int i = 2;                        //initialization for running loop
        int result = 0;                   // container to store the result
        while(i<=num){                    // condition for loop
            if (inp1%i==0 && inp2%i==0){
                result=i;                  // store the result un till the end of the loop
            }
            i++;                        //update for loop
        }
        if (result==0){
            System.out.println("there is no GCD for the numbers");
        }
        else {
            System.out.println("The result is: "+result);     //this is the result
        }
        return result;
    }
}
