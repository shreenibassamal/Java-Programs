package numbersProgram;

import java.util.*;
/*
Write a java program to find the LCM of two given number.
 */
class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to LCM program");
        System.out.print("Enter first numnber: ");
        int inp1 = input.nextInt();
        System.out.print("Enter second number: ");
        int inp2 = input.nextInt();
        int lcm = lcm(inp1,inp2);
        System.out.println("LCM of two number is: "+lcm);
    }

    public static int lcm(int inp1, int inp2) {
        int num = 1; //initialization
        while (num <= inp2) { //condition
            int factor = inp1 * num;
            if (factor%inp2 == 0) {
                return factor;
            }
            num++;  //updation

        }
        System.out.println(num);
        return 0;
    }

}
