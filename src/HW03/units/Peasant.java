package HW03.units;

import java.util.ArrayList;

public class Peasant extends BaseHero {
    protected int delivery;
    protected int status;

    public Peasant(int attack, int defence, int[] damage, int maxHealth, int speed, String name, String role,
                   int delivery, int status) {
        super(attack, defence, damage, maxHealth, speed, name, role);
        this.delivery = delivery;
        this.status = status;
    }

    public Peasant(String name) {
        this(1, 1, new int[]{1}, 1, 3, name,
                "Peasant", 1, 1);
    }

    public int getDelivery() {
        return delivery;
    }
    public int getStatus() { return status;}

    public void setDelivery(int delivery) {this.delivery = delivery;}

    @Override
    public int step(ArrayList<BaseHero> heroesList) {
        return status = 1;
    }

    public void setStatus(int status) {this.status = status;}

    @Override
    public String toString() {
        return "\n Peasant: " + super.toString() + ", delivery=" + delivery + ", status=" + status;
    }


}
