package at.ram.units.oo.examples.calculator;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Geben Sie die erste Zahl ein: ");
        int num1 = scanner.nextInt();
        System.out.println("Geben Sie die zweite Zahl ein: ");
        int num2 = scanner.nextInt();
        System.out.println(num1);

        System.out.println("Wählen Sie die Rechenoperation (1 - 4):");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraktion");
        System.out.println("3 - Multiplikation");
        System.out.println("4 - Division");
    }

}