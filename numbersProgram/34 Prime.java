package numbersProgram;

import java.util.Scanner;
/*
Write a java program to check it's a prime number or not.
 */

class PrimeNUmnbetr1 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any numnber to check given number is prime number or not: ");
        int num = input.nextInt();

        //take a container to store boolean value (either true or false)
        boolean isprimeNumber = isprimeNumber(num); //store the value of isprimeNumber-method (it might be true or false)
        //it print the statement as per given value.
        if (isprimeNumber){
            System.out.println("its a prime number");
        }
        else {
            System.out.println("its not a prime number");
        }
    }
    public static boolean isprimeNumber(int num){
        // As we know prime number is divisible only by 1 and it-self
        //So we run the loop from 2
        int i = 2;
        while (i<num){ // this condition always run the loop till before the given number.
            if (num%i==0){ //if any number is divisible by given number then its false
                return false;
            }
            i++;
        }
        return true;
        }
    }