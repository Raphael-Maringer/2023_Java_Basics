package at.ram.exercises;

import java.util.Scanner;

import java.util.Random;

public class DiceGame {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int playerScore = 0;
    static int computerScore = 0;

    public static void main(String[] args) {

        System.out.println("Willkommen beim Würfelspiel!");

        int randomNumber = random.nextInt(1, 3);
        boolean isFinished = false;

        while (!isFinished) {
            menu();
            System.out.println("Eingabe: ");
            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    play();
                    break;
                case 2:
                    displayScore();
                    break;
                case 3:
                    isFinished = true;
                    break;

                default:
                    System.out.println("Bitte gib eine Zahl zwischen 1 und 3 ein!");
            }
        }


    }

    public static void menu() {
        System.out.println("1. Spiel starten");
        System.out.println("2. Punktestand anzeigen");
        System.out.println("3. Spiel beenden");
    }

    public static void updateScore(int playerRoll, int computerRoll) {
        if (playerRoll > computerRoll) {
            playerScore++;
            System.out.println("Du gewinnst!");
        } else if (computerRoll > playerRoll) {
            computerScore++;
            System.out.println("Der Computer gewinnt!");
        } else {
            System.out.println("Unentschieden!");
        }
        System.out.println("Drücke Enter, um fortzufahren!");
    }

    public static void displayScore() {
        System.out.println("Punktestand:");
        System.out.println("Spieler: " + playerScore);
        System.out.println("Computer: " + computerScore);
    }

    public static void play() {
        int playerScore = 0;
        int computerScore = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println(i + ". Runde:");
            System.out.println("Du bist am Zug! Drücke 1, um zu würfeln, oder drücke 2, um den Punktestand anzuzeigen!");
            int selection = scanner.nextInt();
            scanner.nextLine();

            if (selection == 1) {

                int playerRoll = random.nextInt(1, 6);
                System.out.println("Du hast eine " + playerRoll + " gewürfelt!");

                int computerRoll = random.nextInt(1, 6);
                System.out.println("Der Computer hat eine " + computerRoll + " gewürfelt!");

                updateScore(playerRoll, computerRoll);
                scanner.nextLine();
            } else if (selection == 2) {
                displayScore();
            } else {
                System.out.println("Bitte geben Sie 1 oder 2 ein!");
            }

        }

    }
}
