package task4.models;

public abstract class Warrior {
    private int maxPower;
    private int health ;
    private  String name;
    private String weapon;

    public Warrior() {
    }

    public Warrior(String name, int maxPower, String weapon, int health) {
        this.name = name;
        this.maxPower = maxPower;
        this.weapon = weapon;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", maxPower=" + maxPower +
                ", weapon='" + weapon + '\'' +
                ", health=" + health ;
    }
}
