package HW02;

public class Spearman extends BaseHero {
    public Spearman(int attack, int defence, int[] damage, int hp, int speed, String name, String role) {
        super(attack, defence, damage, hp, speed, name, role);
    }

    public Spearman(String name) {
        this(4, 5, new int[]{1, 3}, 10, 4, name, "Spearman");
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
