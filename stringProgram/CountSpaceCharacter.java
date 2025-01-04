package stringProgram;

import java.util.Scanner;

/*
Write a Java Program to count space-character in given string.
 */
public class CountSpaceCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any string to count the space-characters of the given string: ");
        String ch = input.nextLine();
        int count = 0;
        for (int a = 0;ch.length()>a;a++){
            System.out.println(ch.charAt(a));
            if(Character.isWhitespace(ch.charAt(a))){
                count++;
            }
        }
        System.out.println(count);



    }

}
