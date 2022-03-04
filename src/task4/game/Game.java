package task4.game;
import task4.models.Warrior;
import task4.utils.Helper;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private static Warrior player;
    private static Warrior opponent;

    public Game() {
    }

    public static void setPlayer(Warrior player) {
        Game.player = player;
    }

    public static void setOpponent(Warrior opponent) {
        Game.opponent = opponent;
    }


    public static void startGame(int dice1, int dice2) {
        String keyHit;
        Scanner scanner = new Scanner(System.in);

        if (dice1 < dice2) {
            player.setHealth(player.getHealth() - (new Random().nextInt(opponent.getMaxPower())));
            System.out.println(player.getName() + " health : " + player.getHealth());
        }

        while (player.getHealth() > 0 && opponent.getHealth() > 0) {
            do {
                System.out.println("Press 'h' to hit opponent");
                keyHit = scanner.nextLine();
            } while (!Helper.checkKeyHit(keyHit));

            if (player.getHealth() > 0)
                opponent.setHealth(opponent.getHealth() - (new Random().nextInt(player.getMaxPower())));
            if (opponent.getHealth() <= 0) opponent.setHealth(0);
            System.out.println(opponent.getName() + " health : " + opponent.getHealth());

            if (opponent.getHealth() > 0) {
                System.out.println("\nNow your opponent is hitting\n");
                player.setHealth(player.getHealth() - (new Random().nextInt(opponent.getMaxPower())));
            }
            if (player.getHealth() <= 0) player.setHealth(0);
            System.out.println(player.getName() + " health : " + player.getHealth());
        }

        if (player.getHealth() == 0) System.out.println("Your opponent win.");
        else System.out.println("You win");
    }
}