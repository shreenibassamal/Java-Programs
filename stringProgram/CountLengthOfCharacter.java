package stringProgram;

import java.util.Scanner;

/*
Write a Java Program to count the length of characters in a string.
 */
public class CountLengthOfCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any string to count the characters of the given string: ");
        String ch = input.nextLine();
        System.out.println(ch.length());


    }

}
