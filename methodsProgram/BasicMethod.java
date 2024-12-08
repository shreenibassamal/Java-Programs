package methodsProgram;
/*
>Method is a block of code to do some specific task, which execute only when it is called.
>Method is used for code reusabillity.Define once and use multiple times.
 */

public class BasicMethod {
    public static void add() {
        System.out.println("iside add method");
    }
    public static void main(String[] args) {
        System.out.println("Before call");
        add();
        System.out.println("After call");
    }
}
