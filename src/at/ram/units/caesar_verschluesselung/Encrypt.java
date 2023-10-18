package at.ram.units.caesar_verschluesselung;

public class Encrypt {

    public static void main(String[] args) {

    }
    public static String encrypt(String text){

        char[] encryptedText = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            char actualLetter = text.charAt(i);
            actualLetter += 1;
            encryptedText[i] = actualLetter;
        }

        return new String(encryptedText);
    }
}
