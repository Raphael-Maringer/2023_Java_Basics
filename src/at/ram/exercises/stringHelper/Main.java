package at.ram.exercises.stringHelper;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner wordScanner = new Scanner(System.in);
        System.out.println("Gib ein Wort ein: ");
        String word = wordScanner.nextLine();

        if (StringHelper.isPalindrome(word)) {
            System.out.println("Das Wort " + word + " ist ein Palindrom!");
        } else {
            System.out.println("Das Wort " + word + " ist kein Palindrom!");
        }

        String countTotalLetters = StringHelper.countTotalLetters(word);

        Scanner letterScanner = new Scanner(System.in);
        System.out.println("Welcher Buchstabe soll gezählt werden?");
        String letter = letterScanner.nextLine();
        StringHelper.countLetters(word, letter);

        String reverseString = StringHelper.reverseString(word);
        System.out.println("Das Wort rückwärts ist " + reverseString + "!");

       StringHelper.printAmountOfLetters(word);

    }
}
