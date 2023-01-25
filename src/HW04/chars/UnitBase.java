package HW04.chars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class UnitBase implements InterfaceHero {
    int attack, defence, maxHealth, speed, health;
    int[] damage;
    String name, role, team;


    public UnitBase(int attack, int defence, int[] damage, int maxHealth, int speed, String name,
                    String role, String team, int x, int y) {
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxHealth = maxHealth;
        this.speed = speed;
        this.name = name;
        this.role = role;
        this.health = maxHealth - new Random().nextInt(maxHealth);
        this.team = team;

    }

    public UnitBase(String heroName, ArrayList<UnitBase> team, int x, int y) {

    }

    public int setHealth(int health) {
        this.health = health;
        return health;
    }

    public String getRole() { return role;}

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

    public String getTeam() {return team;}

    @Override
    public int step(ArrayList<UnitBase> heroesList) {

        return 0;
    }

    @Override
    public String getInfo() {
        String outStr;
        outStr = String.format("%s\t%s\t⚔ %d\t\uD83D\uDEE1 %d\t♥%d\t☠%d\t%d", role, name, attack, defence,health,(damage[0] + damage[1])/2,speed);
        return  outStr;
    }

    @Override
    public String getMaxLost() {
        return role + " " + String.valueOf(maxHealth) + " " + String.valueOf(health);
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
               ", speed=" + speed +
               ", team=" + team;
    }
}
