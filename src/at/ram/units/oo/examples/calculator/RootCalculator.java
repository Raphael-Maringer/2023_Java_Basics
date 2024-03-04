package at.ram.units.oo.examples.calculator;

import java.util.Scanner;

public class RootCalculator extends ScientificCalculator {
    static Scanner scanner = new Scanner(System.in);

    public RootCalculator() {
    }

    public void rootSelection(){
        System.out.println("Geben Sie eine Zahl ein: ");
        double num = scanner.nextDouble();
        double result = Math.sqrt(num);
        System.out.println("Das Ergebnis ist " + result);
    }

}
