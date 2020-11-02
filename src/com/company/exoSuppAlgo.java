package com.company;

import java.util.Scanner;

public class exoSuppAlgo {
    enum mainMenu {Guess_The_Number, Palindrome, Fill_The_Array, Mine_Sweeper, QUIT}

    static Scanner mainScanner = new Scanner(System.in);

    /**
     * Main menu for choose the game you want to play
     */
    public static void runTheMenu() {
        for (mainMenu game : mainMenu.values()
        ) {
            String choice = (game.ordinal() + 1) + " - " + game;
            System.out.println(choice);
        }

        System.out.println("\nWich game would you want to play ?\n");
        String userChoice = mainScanner.next();

        switch (userChoice) {
            case "1":
                System.out.println("choix 1");
                break;
            case "2":
                System.out.println("choix 2");
                break;

            case "3":
                System.out.println("choix 3");
                break;

            case "4":
                System.out.println("choix 4");
                break;

            case "5":
                System.out.println("choix 5");
                break;

            default:
                runTheMenu();
        }

    }

    /**
     * this fonction display the Welcome message, it make separating bar with same length of the message
     * that you can change
     */
    public static void welcomeMessage() {
        String theMessage = "Hello Boy's and girl's, welcome on my world !!!";
        String hBars = "";
        for (int i = 0; i < theMessage.length(); i++) {
            hBars += "-";
        }
        System.out.println(hBars + "\n" + theMessage + "\n" + hBars);
    }

    /**
     * this is the main function who launch the differents games.
     * it wil be invoked on main
     */
    public static void launchGame() {
        welcomeMessage();
        runTheMenu();
    }

}
