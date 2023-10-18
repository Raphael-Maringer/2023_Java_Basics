package at.ram.units.caesar_verschluesselung;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Gib deine Nachricht ein: ");
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        System.out.println("Originaltext: " + text);

        String encryptedText = Encrypt.encrypt(text);
        System.out.print("Encrypt: " + encryptedText);

        String decryptedText = Decrypt.decrypt(encryptedText);
        System.out.println("Decrypt: " + decryptedText);

    }

}
