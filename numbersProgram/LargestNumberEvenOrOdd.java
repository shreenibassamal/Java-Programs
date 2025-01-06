package JAN06;

public class LargestNumberEvenOrOdd {
    public static void main(String[] args) {
        int a = 1687;
        int r = 0;
        int larg = -1;

        while (a > 0) {
            int dig = a % 10;
            r = larg;
            if (dig > larg) {
                larg = dig;
            }
            a = a / 10;

        }
        if (larg % 2 == 0) {
            System.out.println("its even");
        }
    else{
            System.out.println("it odd");
        }

    }
}
