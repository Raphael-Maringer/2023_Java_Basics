package at.ram.units.oo.examples.calculator;

import java.util.Scanner;


public class BaseCalculator {
    static Scanner scanner = new Scanner(System.in);

    public BaseCalculator() {
    }

    public void selection() {
        System.out.println("Wählen Sie die Rechenoperation (1 - 4):");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraktion");
        System.out.println("3 - Multiplikation");
        System.out.println("4 - Division");
        int selection = scanner.nextInt();

        if (selection == 1) {
            add();
        } else if (selection == 2) {
            subtract();
        } else if (selection == 3) {
            multiply();
        } else if (selection == 4) {
            divide();
        } else {
            System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 4 ein!");
        }
    }

    public void add() {
        System.out.println("Geben Sie die erste Zahl ein: ");
        double num1 = scanner.nextDouble();
        System.out.println("Geben Sie die zweite Zahl ein: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Ergebnis: " + result);
    }

    public void subtract() {
        System.out.println("Geben Sie die erste Zahl ein: ");
        double num1 = scanner.nextDouble();
        System.out.println("Geben Sie die zweite Zahl ein: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Ergebnis: " + result);
    }

    public void multiply() {
        System.out.println("Geben Sie die erste Zahl ein: ");
        double num1 = scanner.nextDouble();
        System.out.println("Geben Sie die zweite Zahl ein: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Ergebnis: " + result);
    }

    public void divide() {
        System.out.println("Geben Sie die erste Zahl ein: ");
        double num1 = scanner.nextDouble();
        System.out.println("Geben Sie die zweite Zahl ein: ");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("Error: Division durch 0 nicht möglich!");
        } else {
            double result = num1 / num2;
            System.out.println("Ergebnis: " + result);
        }

    }
}
