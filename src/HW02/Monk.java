package HW02;

public class Monk extends BaseHero {
    private int magic;

    public Monk(int attack, int defence, int[] damage, int hp, int speed, String name,String role, int magic) {
        super(attack, defence, damage, hp, speed, name, role);
        this.magic = magic;
    }

    public Monk(String name) {
        this(12, 7, new int[]{-4}, 30, 5, name,"Monk", 1);
    }

    @Override
    public String toString() {
        return "\n Monk: " + super.toString() + ", magic=" + magic;
    }

    @Override
    public String getInfo() {
        return role;
    }
}
