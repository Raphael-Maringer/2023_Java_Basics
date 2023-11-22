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

    public static String countTotalLetters(String word) {
        int amountOfTotalLetters = word.length();
        System.out.println("Das Wort hat " + amountOfTotalLetters + " Buchstaben!");
        return String.valueOf(amountOfTotalLetters);
    }

public static void countLetters(String word, String letter) {
    int count = 0;
    for (char c : word.toCharArray()) {
        if (c == letter.charAt(0)) {
            count++;
        }
    }
    System.out.println("Der Buchstabe " + letter + " kommt " + count + " mal vor!");
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