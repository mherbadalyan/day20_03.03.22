package task4.models;

public class Magician extends Warrior {

    public Magician() {
    }

    public Magician(String name, int maxPower, String weapon, int health) {
        super(name, maxPower, weapon, health);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getMaxPower() {
        return super.getMaxPower();
    }

    @Override
    public void setMaxPower(int maxPower) {
        super.setMaxPower(maxPower);
    }

    @Override
    public String getWeapon() {
        return super.getWeapon();
    }

    @Override
    public void setWeapon(String weapon) {
        super.setWeapon(weapon);
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
