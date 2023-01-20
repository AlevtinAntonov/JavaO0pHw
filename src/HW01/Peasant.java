package HW01;

public class Peasant extends BaseHero {
    private int delivery;

    public Peasant(int attack, int defence, int[] damage, int hp, int speed, String name, int delivery) {
        super(attack, defence, damage, hp, speed, name);
        this.delivery = delivery;
    }

    public Peasant(String name){
        this(1, 1, new int[]{1}, 1, 3, name, 1);
    }

    public int getDelivery() {
        return delivery;
    }

    @Override
    public String toString() {
        return  "\n HW01.Peasant: " + super.toString() + ", delivery=" + delivery;
    }
}
