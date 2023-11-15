package at.ram.exercises.stringHelper;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib ein Wort ein: ");
        String word = scanner.nextLine();

        if (StringHelper.isPalindrome(word)) {
            System.out.println("Das Wort " + word + " ist ein Palindrom!");
        } else {
            System.out.println("Das Wort " + word + " ist kein Palindrom!");
        }
        String countLetters = StringHelper.countLetters(word);



        String reverseString = StringHelper.reverseString(word);
        System.out.println("Das Wort rückwärts ist " + reverseString + "!");

       StringHelper.printAmountOfLetters(word);

    }
}
