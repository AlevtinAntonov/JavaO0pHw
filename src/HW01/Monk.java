package HW01;

public class Monk extends BaseHero {
    private int magic;

    public Monk(int attack, int defence, int[] damage, int hp, int speed, String name, int magic) {
        super(attack, defence, damage, hp, speed, name);
        this.magic = magic;
    }

    public Monk(String name) {
        this(12, 7, new int[]{-4}, 30, 5, name, 1);
    }

    @Override
    public String toString() {
        return "\n HW01.Monk: " + super.toString() + ", magic=" + magic;
    }
}
