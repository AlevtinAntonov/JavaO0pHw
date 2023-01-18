package HW02;

import java.util.Arrays;

public abstract class BaseHero implements InterfaceHero {
    private int attack;
    private int defence;
    private int[] damage;
    private int maxHealth;
    private int speed;
    private String name;
    protected String role;
    private int health;


    public BaseHero(int attack, int defence, int[] damage, int maxHealth, int speed, String name, String role, int health) {
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxHealth = maxHealth;
        this.speed = speed;
        this.name = name;
        this.role = role;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    @Override
    public void step() {

    }
    @Override
    public String getInfo() {
        return null;
    }
    @Override
    public String toString() {
        return name +
               ", role=" + role +
               ", attack=" + attack +
               ", defence=" + defence +
               ", damage=" + Arrays.toString(damage) +
               ", maxHealth=" + maxHealth +
               ", health=" + health +
               ", speed=" + speed;
    }
}
