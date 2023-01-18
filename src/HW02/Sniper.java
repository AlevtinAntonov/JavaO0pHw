package HW02;

public class Sniper extends BaseHero {
    private int shots;

    public Sniper(int attack, int defence, int[] damage, int hp, int speed, String name, String role, int shots) {
        super(attack, defence, damage, hp, speed, name, role);
        this.shots = shots;
    }

    public Sniper(String name) {
        this(12, 10, new int[]{8, 10}, 15, 9, name,"Sniper", 32);
    }

    @Override
    public String toString() {
        return "\n Sniper: " + super.toString() + ", shots=" + shots;
    }

    @Override
    public String getInfo() {
        return role;
    }
}
