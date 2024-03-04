package at.ram.exercises;

import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {
        boolean isFinished = false;
        Scanner scanner = new Scanner(System.in);

        int bal = 0;
        printInfo();

        while (!isFinished) {
            System.out.println("Eingabe: ");
            int selection = scanner.nextInt();
            switch(selection) {
                case 1:
                    System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten:");
                    int amount1 = scanner.nextInt();
                    bal += amount1;
                    System.out.println("Sie haben " + amount1 + "€ eingezahlt!");
                    break;
                case 2:
                    System.out.println("Wie viel würden Sie gerne abheben?");
                    int amount2 = scanner.nextInt();
                    bal -= amount2;
                    System.out.println("Sie haben "+amount2 + "€ abgehoben!");
                    break;
                case 3:
                    System.out.println("Der Kontostand beträgt "+ bal + "€!");
                    break;
                case 4:
                    isFinished = true;
            }
        }


    }
    public static void printInfo(){
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Beenden");
    }
}


