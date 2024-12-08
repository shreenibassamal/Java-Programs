package methodsProgram;
/*
>When one method calling another method is called method chaining.
 */
public class MethodChaining {
    public static void fun1() {
        System.out.println("fun1 start");
        fun2();
        System.out.println("fun1 end");

    }
    public static void fun2() {
        System.out.println("fun2 start");
        System.out.println("fun2 end");
    }
    public static void main(String[] args) {
        System.out.println("main method start");
        fun1();
        System.out.println("main method end");

    }
}
