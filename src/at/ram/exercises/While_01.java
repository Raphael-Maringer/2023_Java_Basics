package at.ram.exercises;

import java.util.Random;

public class While_01 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;
        int sum = 0;

        while (!isFinished) {
            int randomValue = random.nextInt(10,31);
            sum += randomValue;

            if ((randomValue==15)||(randomValue==25)) {
                isFinished = true;
            }

        }

        System.out.println(sum);
    }
}
