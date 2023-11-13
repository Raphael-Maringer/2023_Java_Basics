package at.ram.exercises.stringHelper;

public class StringHelper {

    public static boolean isPalindrome(String word) {
        int length = word.length();

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static int countLetters(String word) {
        return word.length();
    }

    public static String reverseString(String word) {
        System.out.println("Das Wort ist " + countLetters());

    }

    public static String printAmountOfLetters(String word) {
        System.out.println();
    }

}