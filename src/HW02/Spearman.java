package HW02;

public class Spearman extends BaseHero {
    public Spearman(int attack, int defence, int[] damage, int maxHealth, int speed, String name, String role,
                    int health) {
        super(attack, defence, damage, maxHealth, speed, name, role, health);
    }

    public Spearman(String name) {
        this(4, 5, new int[]{1, 3}, 10, 4, name,
                "Spearman", 10);
    }

    @Override
    public String toString() {
        return "\n Spearman: " + super.toString();
    }

    @Override
    public String getInfo() {
        return role;
    }
}
