package methodsProgram;
/*
the purpose of this program to explain how local variable are created
 and become invalid when function call is over.

 */
public class RoleOfLocalVariableInFunctionCall {
    public static void add(){
        int a = 15;
        int b = 16;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        add();
        add();

    }
}
