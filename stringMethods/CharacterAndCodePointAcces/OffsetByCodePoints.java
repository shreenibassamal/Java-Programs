package stringMethods.CharacterAndCodePointAcces;

public class OffsetByCodePoints {
    public static void main(String[] args) {
        String s = "Hello";
/*
int offsetByCodePoints(int index, int codePointOffset): Returns the index offset by a given number of code points.
 */
        System.out.println(s.offsetByCodePoints(0,4));
    }
}
