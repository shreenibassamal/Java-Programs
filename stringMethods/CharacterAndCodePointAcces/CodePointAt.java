package stringMethods.CharacterAndCodePointAcces;

public class CodePointAt {
    public static void main(String[] args) {
        String s = "Hello";

        /*
        int codePointAt(int index): Returns the Unicode code point at the specified index.
         This is important for handling characters outside the Basic Multilingual Plane (BMP).
         */
        System.out.println(s.codePointAt(2));
        System.out.println(s.codePointAt(3));
    }
}
