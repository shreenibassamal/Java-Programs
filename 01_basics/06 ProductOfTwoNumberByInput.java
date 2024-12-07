package numbers;

import java.util.Scanner;

class ProductOfTwoNumberByInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int c = a*b;
        System.out.println("product of two number is: "+c);
    }
}
