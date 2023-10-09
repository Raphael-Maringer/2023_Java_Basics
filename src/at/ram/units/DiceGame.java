package at.ram.units;

import java.util.Scanner;

import java.util.Random;
public class DiceGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(1,3);
        boolean IsFinished = false;

        while(!IsFinished){
            menu();
            System.out.println("Eingabe: ");
            int selection = scanner.nextInt();

            switch (selection){
                case 1: play();
                        break;

                default:
                    System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 3 ein!");
            }
        }


    }

    public static void menu(){
        System.out.println("Willkommen beim Würfelspiel!");
        System.out.println("1. Spiel starten");
        System.out.println("2. Punktestand anzeigen");
        System.out.println("3. Spiel beenden");
    }

    public static void play(){
        int playerScore = 0;
        int computerScore = 0;

        for (int i = 0; i <= 6 ; i++) {
            System.out.println(i + ". Runde:");
            System.out.println("Du bist am Zug! Drücke Enter, um zu würfeln!");
            int playerRoll = randomNumber;
            int computerRoll = randomNumber;
        }


    }
}
