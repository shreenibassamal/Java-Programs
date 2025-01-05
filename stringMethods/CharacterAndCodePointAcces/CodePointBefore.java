package stringMethods.CharacterAndCodePointAcces;

public class CodePointBefore {
    public static void main(String[] args) {
        String s = "Hello";
        /*
        int codePointBefore(int index): Returns the Unicode code point before the specified index.
         */
        System.out.println(s.codePointBefore(3));
        System.out.println(s.codePointBefore(4));
//        System.out.println(s.codePointBefore(0)); //it throw String index out of bound Exception
    }
}
