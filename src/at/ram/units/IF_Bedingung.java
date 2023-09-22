package at.ram.units;

import java.util.Random;

public class IF_Bedingung {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        if (randomNumber>50) {
            System.out.println("groß");
        } else if (randomNumber<10) {
            System.out.println("klein");
        }
    }

}
