package numbersProgram;

import java.util.Scanner;

/*
Write a java program to print the Fibonacci series up to a certain number.

logic:         numers start from 0, 1, 2 ,3, 4........n.
 in fibonacci series number start from zero but the certain number should be sum of previous 2 number.

 ex: 0,1,1,2,3,5,8,13,21,33......//note 0,1 always be there//.......n   [0, 1,(0+1),(1+1), (1+2), (2+3).........


 */
class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number to print the fibonacci series: ");
        int num = input.nextInt();
        fibonaccinumber(num);
    }

    public static void fibonaccinumber(int num){
        if (num<0) return;
        System.out.println("0 ");
        if (num==0) return;
        System.out.println("1 ");

        int i=1; //first number
        int j =1; //second number
        while (i+j<=num){
            int k = i+j;   //third number == first +secod
            System.out.println(k); //print first fibonacci series
            i=j;           //updation for first number value to second
            j=k;           //updation for scond number valu to third

        }

    }
}
