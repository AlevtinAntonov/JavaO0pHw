package HW02;

public class Sniper extends BaseHero {
    private int shots;

    public Sniper(int attack, int defence, int[] damage, int maxHealth, int speed, String name, String role,
                  int health, int shots) {
        super(attack, defence, damage, maxHealth, speed, name, role, health);
        this.shots = shots;
    }

    public Sniper(String name) {
        this(12, 10, new int[]{8, 10}, 15, 9, name,
                "Sniper", 15, 32);
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
