package HW02;

public class Outlaw extends BaseHero {
    public Outlaw(int attack, int defence, int[] damage, int maxHealth, int speed, String name, String role, int health) {
        super(attack, defence, damage, maxHealth, speed, name, role, health);
    }

    public Outlaw(String name) {
        this(8, 3, new int[]{2, 4}, 10, 6, name, "Outlaw", 10);
    }

    @Override
    public String toString() {
        return "\n Outlaw: " + super.toString();
    }

    @Override
    public String getInfo() {
        return role;
    }
}
