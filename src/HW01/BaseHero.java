package HW01;

import java.util.Arrays;

public class BaseHero {
    private int attack;
    private int defence;
    private int[] damage;
    private int hp;
    private int speed;
    private String name;

    public BaseHero(int attack, int defence, int[] damage, int hp, int speed, String name) {
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.hp = hp;
        this.speed = speed;
        this.name = name;
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

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name +
               ", attack=" + attack +
               ", defence=" + defence +
               ", damage=" + Arrays.toString(damage) +
               ", hp=" + hp +
               ", speed=" + speed;
    }
}
