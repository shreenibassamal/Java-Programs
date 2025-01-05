package stringMethods.CharacterAndCodePointAcces;

public class CodePointCount {
    public static void main(String[] args) {
        String s = "shreenibas";
        /*
        int codePointCount(int beginIndex, int endIndex): Returns the number of Unicode code points in the specified range.
         */

        System.out.println(s.codePointCount(5,9));
    }
}
