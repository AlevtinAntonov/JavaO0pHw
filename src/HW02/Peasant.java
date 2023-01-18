package HW02;

public class Peasant extends BaseHero {
    private int delivery;

    public Peasant(int attack, int defence, int[] damage, int hp, int speed, String name, String role, int delivery) {
        super(attack, defence, damage, hp, speed, name, role);
        this.delivery = delivery;
    }

    public Peasant(String name){
        this(1, 1, new int[]{1}, 1, 3, name, "Peasant", 1);
    }

    public int getDelivery() {
        return delivery;
    }

    @Override
    public String toString() {
        return  "\n Peasant: " + super.toString() + ", delivery=" + delivery;
    }

    @Override
    public String getInfo() {
        return role;
    }
}
