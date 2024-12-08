package methodsProgram;
/*
the purpose of this program to explain how Global variable are
 share a copy to other  function when it call by another function
 and it exit after function call over.

 */
public class RoleOfGlobalVariableInFunctionCall {
    static int a =15;
    static int b = 16;
    public static void add(){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        add();
        add();
    }
}
