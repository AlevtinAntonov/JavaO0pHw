package HW02;

public class Crossbowman extends BaseHero {
    private int shots;

    public Crossbowman(int attack, int defence, int[] damage, int maxHealth, int speed, String name,
                       String role,int health, int shots) {
        super(attack, defence, damage, maxHealth, speed, name, role, health);
        this.shots = shots;
    }

    public Crossbowman(String name) {
        this(6, 3, new int[]{2, 3}, 10, 4,
                name, "Crossbowman", 10,16);
    }

    @Override
    public String toString() {
        return "\n Crossbowman: " + super.toString() + ", shots=" + shots;
    }

    @Override
    public String getInfo() {
        return role;
    }
}
