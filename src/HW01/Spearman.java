package HW01;

public class Spearman extends BaseHero {
    public Spearman(int attack, int defence, int[] damage, int hp, int speed, String name) {
        super(attack, defence, damage, hp, speed, name);
    }

    public Spearman(String name) {
        this(4, 5, new int[]{1, 3}, 10, 4, name);
    }

    @Override
    public String toString() {
        return "\n HW01.Spearman: " + super.toString();
    }
}
