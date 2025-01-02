package methodsProgram;

public class WRTFA {
    public static int fun1(int x,int y) {
      int z= x+y;
        System.out.println(z);
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("starting of main method");
        fun1(5,6);
        System.out.println("ending of main method");

    }
}
