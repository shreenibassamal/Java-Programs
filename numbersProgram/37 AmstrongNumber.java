package numbersProgram;

import java.util.Scanner;

/*
Write a java program to check wheather a given number is an amstrong number or not.
logic:
example - 153 is a amstrong number (here three digits in the number)
so (1*1*1) + (5*5*5)+ (3*3*3) = 153
 */
class AmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number to check ita amstrong number or not: ");
        int num = input.nextInt();
        isAmstrongNumber(num);
    }
    public static void isAmstrongNumber(int num){
        int num1=num;
        int sum =0;
        int sum2=0;
        while (num>0){
            int lastDigit=num%10;
            System.out.println(lastDigit);
            sum = lastDigit*lastDigit*lastDigit;
            sum2=sum2+sum;
            System.out.println(sum2);
            num=num/10;
        }
            if (num1==sum2){
                System.out.println("its amstrong number");
            }
            else {
                System.out.println("its not amstrong number");
            }
        }
    }

