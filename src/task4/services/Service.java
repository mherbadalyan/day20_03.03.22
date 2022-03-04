package task4.services;
import task4.models.*;
import java.util.Random;

public class Service {
    public Warrior playerInitializing(String inputPlayer) {
        Warrior player = null;

        switch (inputPlayer) {

            case "1": {
                player = new Archer("Archer", 15, "Bow", 100);

                break;
            }
            case "2": {
                player = new Samurai("Samurai", 20, "Katana", 100);
                break;

            }
            case "3": {
                player = new Magician("Magician", 25, "Magic", 100);
                break;
            }
        }
        return player;
    }

    public Warrior player2Select(String inputPlayer) {
        int numberOfPlayer1 = Integer.parseInt(inputPlayer);
        int numberOfPlayer2 = new Random().nextInt(3) + 1;

        while (numberOfPlayer1 == numberOfPlayer2) {
            numberOfPlayer2 = new Random().nextInt(3) + 1;
        }
        return playerInitializing(String.valueOf(numberOfPlayer2));
    }
}