package HW02;

public class Magician extends BaseHero {
    private int magic;

    public Magician(int attack, int defence, int[] damage, int maxHealth, int speed, String name,
                    String role, int health, int magic) {
        super(attack, defence, damage, maxHealth, speed, name, role, health);
        this.magic = magic;
    }

    public Magician(String name) {
        this(17, 12, new int[]{-5}, 30, 9,
                name, "Magician", 30, 1);
    }

    @Override
    public String toString() {
        return "\n Magician: " + super.toString() + ", magic=" + magic;
    }

    @Override
    public String getInfo() {
        return role;
    }
}
