package numbersProgram;

import java.util.Scanner;
/*
Write a java program to verify given number is a palindrome number or not.
logic: assume one number is 32123
its revers is 32123 (same as given number)
it is a palindrome number
 */

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to check its palindrome or not: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindromeNumber(num);
        if (isPalindrome){
            System.out.println("this is a palindrome number");
        }
        else
        {
            System.out.println("this is not a palindrome number");
        }
    }
    public static boolean isPalindromeNumber(int num){
        return num==reverse(num);
    }

    public static int reverse(int num){
        int newNum=0;
        while(num >0){
            int digit = num%10;
            newNum = newNum*10+digit;
            num = num/10;
        }
       return newNum;
    }
}
