package methodsProgram;
/*
>We can call a function multiple times for code reusabillity.
>we can call multiple function also>
 */
public class CallMultipleFunction {
    public static void add() {
        System.out.println("inside add method");
    }
    public static void sub() {
        System.out.println("inside sub method");
    }
    public static void main(String[] args) {
        System.out.println("before call");
        add();
        sub();
        add();
        sub();
        System.out.println("after call");
    }
}
