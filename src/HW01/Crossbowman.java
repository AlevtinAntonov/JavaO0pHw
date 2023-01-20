package HW01;

public class Crossbowman extends BaseHero {
    private int shots;

    public Crossbowman(int attack, int defence, int[] damage, int hp, int speed, String name, int shots) {
        super(attack, defence, damage, hp, speed, name);
        this.shots = shots;
    }

    public Crossbowman(String name) {
        this(6, 3, new int[]{2, 3}, 10, 4, name, 16);
    }

    @Override
    public String toString() {
        return "\n HW01.Crossbowman: " + super.toString() + ", shots=" + shots;
    }
}
