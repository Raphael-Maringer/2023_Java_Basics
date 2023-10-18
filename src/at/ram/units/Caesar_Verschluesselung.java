package at.ram.units;
import java.util.Scanner;

import java.util.Random;

public class Caesar_Verschluesselung {
    public static void main(String[] args) {
        String[]alphabet = {"a", "b", "c", "c", "d", "e", "f", "g", "h", "i", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x","y", "z"};

        int offset = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib deine Nachricht ein: ");
        String text = scanner.nextLine();

        String encryptedText = encrypt(alphabet, offset, text);
    }

    static String encrypt(String[] alphabet, int offset, String input){
        System.out.println(offset + ":" + input);

        for (int i = 0; i < input.length(); i++) {

        }
        return "empty";
    }

}
