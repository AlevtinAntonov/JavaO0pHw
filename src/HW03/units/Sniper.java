package HW03.units;

import java.util.ArrayList;
import java.util.List;

public class Sniper extends BaseHero {
    int shots;

    public Sniper(int attack, int defence, int[] damage, int maxHealth, int speed, String name, String role,
                  int shots) {
        super(attack, defence, damage, maxHealth, speed, name, role);
        this.shots = shots;
    }

    public Sniper(String name) {
        this(12, 10, new int[]{8, 10}, 15, 9, name,
                "Sniper", 32);
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    @Override
    public int step(ArrayList<BaseHero> heroesList) {
        boolean isPeasant = false;
        List<Integer> tempIndexMan = new ArrayList<>();
        for (int i = 0; i < heroesList.size(); i++) {
            if (heroesList.get(i).role == "Peasant") {
                tempIndexMan.add(i);
            }
        }
        System.out.println("tempIndexMan = " + tempIndexMan);

        for (int i = 0; i < heroesList.size(); i++) {
            if (heroesList.get(i).role == "Sniper" && shots > 0) {
                ((Sniper) heroesList.get(i)).shots -= 1;
                System.out.println(heroesList.get(i).role + " -> " + heroesList.get(i).name + " выстрелил, shots= "
                        + ((Sniper) heroesList.get(i)).shots);
            }

            if (heroesList.get(i).role == "Sniper") {
//                System.out.println("== Sniper -> " + ((Sniper) heroesList.get(i)).shots);
                for (int j = 0; j < tempIndexMan.size(); j++) {
//                    System.out.println("j= " + j + " - " + ((Sniper) heroesList.get(i)).shots);
                    if (((Peasant) heroesList.get(tempIndexMan.get(j))).status == 1) {
                        System.out.println("Peasant status == 1");
                        System.out.println();
                        ((Sniper) heroesList.get(i)).shots += 1;
                        ((Peasant) heroesList.get(tempIndexMan.get(j))).status = 0;
                        System.out.println("heroesList.get(tempIndexMan.get(j))).status = 0 ->" +
                                ((Peasant) heroesList.get(tempIndexMan.get(j))).status);
                        System.out.println(heroesList.get(i).role + " -> " + heroesList.get(i).name + " вернул стрелу" + shots);
                        break;
                    } else {
                        System.out.println("else status = 0 ");
                    }
                }
                for (int j = 0; j < tempIndexMan.size(); j++) {
                    ((Peasant) heroesList.get(tempIndexMan.get(j))).status = 0;
                }
            }
        }
        for (int i = 0; i < tempIndexMan.size(); i++) {
            ((Peasant) heroesList.get(tempIndexMan.get(i))).setStatus(1);
            System.out.println("staus = 1 -> " +(Peasant) heroesList.get(tempIndexMan.get(i)));
        }
        return shots;
    }

    @Override
    public String toString() {
        return "\n Sniper: " + super.toString() + ", shots=" + shots;
    }
}
