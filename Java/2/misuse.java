package ch02_expressive_puzzlers.puzzle_5;
public class JoyOfHex {
    public static void main(String[] args) {
        System.out.println(
            Long.toHexString(0x100000000L + 0xcafebabe));
    }
}
