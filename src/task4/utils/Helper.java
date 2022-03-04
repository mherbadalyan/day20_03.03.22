package task4.utils;

public class Helper {
    public static boolean checkInputPlayer(String inputPlayer) {
        return inputPlayer != null && (inputPlayer.equals("1") || inputPlayer.equals("2") || inputPlayer.equals("3"));
    }

    static boolean checkKeyDice(String keyDice) {
        return keyDice.equalsIgnoreCase("d");
    }

    public static boolean checkKeyHit(String keyHit) {
        if (!keyHit.equalsIgnoreCase("h")){
            System.out.println("You entered incorrect letter.\n");
            return false;
        }
        else return true;
    }
}
