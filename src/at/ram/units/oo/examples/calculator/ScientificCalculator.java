package at.ram.units.oo.examples.calculator;

import java.util.Scanner;

public class ScientificCalculator extends BaseCalculator {
    static Scanner scanner = new Scanner(System.in);

    public ScientificCalculator() {
    }

    public void scientificSelection() {
        System.out.println("Wählen Sie die Rechenoperation (1 - 2):");
        System.out.println("1 - Sinus");
        System.out.println("2 - Cosinus");
        int selection = scanner.nextInt();

        if (selection == 1) {
            sinus();
        } else if (selection == 2) {
            cosinus();
        }

    }

    public void sinus() {
        System.out.println("Geben Sie den Winkel ein: ");
        double numInDegrees = scanner.nextDouble();
        double num = Math.toRadians(numInDegrees);
        double result = Math.sin(num);
        System.out.println("Ergebnis: " + result);
    }

    public void cosinus() {
        System.out.println("Geben Sie den Winkel ein: ");
        double numInDegrees = scanner.nextDouble();
        double num = Math.toRadians(numInDegrees);
        double result = Math.cos(num);
        System.out.println("Ergebnis: " + result);
    }
}
