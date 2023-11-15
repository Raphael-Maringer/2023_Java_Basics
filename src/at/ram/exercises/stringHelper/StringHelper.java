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

    public static String reverseString(String word) {
        return new StringBuilder(word).reverse().toString();

    }

    public static String countLetters(String word) {
        int amountOfLetters = word.length();
        System.out.println("Das Wort hat " + amountOfLetters + " Buchstaben!");
        return String.valueOf(amountOfLetters);
    }

    public static void printAmountOfLetters(String word) {
        int[] alphabet = new int[26];
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabet[Character.toLowerCase(c) - 'a']++;
            }
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > 0) {
                System.out.println((char) ('a' + i) + " - " + alphabet[i]);
            }
        }
    }
}