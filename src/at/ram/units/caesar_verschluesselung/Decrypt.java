package at.ram.units.caesar_verschluesselung;

public class Decrypt {
    public static void main(String[] args) {

    }
    public static String decrypt(String text){

        char[] decryptedText = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            char actualLetter = text.charAt(i);
            actualLetter -= 1;
            decryptedText[i] = actualLetter;
        }

        return new String(decryptedText);
    }
}


