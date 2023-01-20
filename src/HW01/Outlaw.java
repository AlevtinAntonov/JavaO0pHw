package HW01;

public class Outlaw extends BaseHero {
    public Outlaw(int attack, int defence, int[] damage, int hp, int speed, String name) {
        super(attack, defence, damage, hp, speed, name);
    }

    public Outlaw(String name) {
        this(8, 3, new int[]{2, 4}, 10, 6, name);
    }

    @Override
    public String toString() {
        return "\n HW01.Outlaw: " + super.toString();
    }
}
