public class Magician extends BaseHero {
    private int magic;

    public Magician(int attack, int defence, int[] damage, int hp, int speed, String name, int magic) {
        super(attack, defence, damage, hp, speed, name);
        this.magic = magic;
    }

    public Magician(String name) {
        this(17, 12, new int[]{-5}, 30, 9, name, 1);
    }

    @Override
    public String toString() {
        return "\n Magician: " + super.toString() + ", magic=" + magic;
    }
}
