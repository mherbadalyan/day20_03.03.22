package task4.controllers;

import task4.game.Game;
import task4.models.Warrior;
import task4.services.Service;
import task4.utils.Dice;
import task4.utils.Helper;

import java.util.Scanner;

public class Controller {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        String inputPlayer;
        Service service = new Service();
        menuAndPlayerSelecting();

        inputPlayer = chooseWarrior(scanner.nextLine());
        Warrior player1 = service.playerInitializing(inputPlayer);
        System.out.println("You are selected this player\n" + player1 + "\n");
        Game.setPlayer(player1);

        System.out.println("Your opponent will be selected between another 2 warrior. Your opponent is ");
        Warrior player2 = service.player2Select(inputPlayer);
        System.out.println(player2 + "\n");
        Game.setOpponent(player2);

        Dice dice = new Dice();
        dice.start();
    }

    private String chooseWarrior(String inputPlayer) {

        while (!Helper.checkInputPlayaer(inputPlayer)) {
            System.out.println("Your choice is incorrect.Please try again.");
            inputPlayer = scanner.nextLine();
        }
        return inputPlayer;
    }

    private void menuAndPlayerSelecting() {
        System.out.println("Welcome to game Mortal Combat. Please select player." +
                "\n1. Archer\n2. Samurai\n3. Magician");
    }
}
