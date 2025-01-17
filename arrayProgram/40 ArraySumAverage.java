package arrayProgram;

import java.util.Scanner;
/*
Write a java program to find the sum and average of all elements in an array.
 */

class ArraySumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcom to array sum average");
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int sum = 0;
        int i = 0;
        while (i<size){
            System.out.print("Enter your the element no "+(i+1)+": ");
            int inp=input.nextInt();
            nums[i]=inp;
            sum =sum+inp;
            i++;
        }
        System.out.println("Sum of numbers is: "+sum);
        System.out.println("Average of numbers is: "+sum/size);

    }
}
