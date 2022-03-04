package task4.utils;

import task4.game.Game;

import java.util.Random;
import java.util.Scanner;

public class Dice {

    public void start() {
        int dice1;
        int dice2;
        String keyDice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("To roll the dice and start game enter 'd' ");
            keyDice = scanner.nextLine();
            while (!Helper.checkKeyDice(keyDice)) {
                System.out.println("You entered incorrect letter.Please enter 'd'.");
                keyDice = scanner.nextLine();
            }
            System.out.println();
            dice1 = rollDice();

            System.out.println("Now your opponent roll dice\n");
            dice2 = rollDice();

            if (dice1 == dice2) System.out.println("Both dices equal.Try again.\n");

        } while (dice1 == dice2);

        if (dice1 > dice2) System.out.println("\nYour dice bigger.You start fight.\n");
        else System.out.println("\nYour opponent dice bigger.He starts fight\n");

        Game.startGame(dice1, dice2);
    }

    private int rollDice() {
        char[][] dice = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dice[i][j] = '*';
            }
        }
        int key = new Random().nextInt(6) + 1;

        switch (key) {
            case 1 -> dice[1][1] = 'O';
            case 2 -> {
                dice[0][0] = 'O';
                dice[2][2] = 'O';
            }
            case 3 -> {
                dice[0][0] = 'O';
                dice[1][1] = 'O';
                dice[2][2] = 'O';
            }
            case 4 -> {
                dice[0][0] = 'O';
                dice[2][0] = 'O';
                dice[0][2] = 'O';
                dice[2][2] = 'O';
            }
            case 5 -> {
                dice[0][0] = 'O';
                dice[2][0] = 'O';
                dice[1][1] = 'O';
                dice[0][2] = 'O';
                dice[2][2] = 'O';
            }
            case 6 -> {
                dice[0][0] = 'O';
                dice[1][0] = 'O';
                dice[2][0] = 'O';
                dice[0][2] = 'O';
                dice[1][2] = 'O';
                dice[2][2] = 'O';
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dice[i][j] + " ");
            }
            System.out.println();
        }
        return key;
    }
}
