package arrayProgram;

import java.util.Scanner;
/*
Write a java program to find the occurences of an element in an array.
 */

class OccurencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Array occurences program");
        System.out.print("Enter the size of the array: ");
        int size= input.nextInt();
        int [] nums= new int[size];
        int i = 0;
        while (i<size){
            System.out.print("Enter your the element no "+(i+1)+": ");
            int inp=input.nextInt();
            nums[i]=inp;
            i++;
        }

        System.out.print("Now Enter the number you want to find: ");
        int num = input.nextInt();
        int occ= 0;
        int j= 0;
        while (j<size){
            if(num==nums[j]){
                occ++;
            }
            j++;
        }
        System.out.println("Your element was found "+occ+" times in the array");
    }
}
