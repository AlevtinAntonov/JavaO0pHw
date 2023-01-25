package HW04.chars;

public class Outlaw extends UnitBase {
    public Outlaw(int attack, int defence, int[] damage, int maxHealth, int speed, String name, String role) {
        super(attack, defence, damage, maxHealth, speed, name, role);
    }

    public Outlaw(String name) {
        this(8, 3, new int[]{2, 4}, 10, 6, name, "Outlaw");
    }

    @Override
    public String toString() {
        return "\n Outlaw: " + super.toString();
    }

}
