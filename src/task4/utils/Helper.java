package task4.utils;

public class Helper {
    public static boolean checkInputPlayaer(String inputPlayar) {
        return inputPlayar.equals("1") || inputPlayar.equals("2") || inputPlayar.equals("3");
    }

    static boolean checkKeyDice(String keyDice) {
        return keyDice.toLowerCase().equals("d");
    }

    public static boolean checkKeyHit(String keyHit) {
        if (!keyHit.toLowerCase().equals("h")){
            System.out.println("You entered incorrect letter.\n");
            return false;
        }
        else return true;
    }
}
