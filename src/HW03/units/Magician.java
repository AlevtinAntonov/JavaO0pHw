package HW03.units;

import java.util.ArrayList;
import java.util.List;

public class Magician extends BaseHero {
    int magic;

    public Magician(int attack, int defence, int[] damage, int maxHealth, int speed, String name,
                    String role, int magic) {
        super(attack, defence, damage, maxHealth, speed, name, role);
        this.magic = magic;
    }

    public Magician(String name) {
        this(17, 12, new int[]{-5}, 30, 9,
                name, "Magician", 1);
    }

    public int getMagic() { return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    @Override
    public String toString() {
        return "\n Magician: " + super.toString() + ", magic=" + magic;
    }

    @Override
    public int step(ArrayList<BaseHero> heroesList) {
        double maxLostPercent = 0;
        int maxLostIndex = 0;
        List<Integer> tempIndexMag = new ArrayList<>();
        int newMagic = 0;
        for (int i = 0; i < heroesList.size(); i++) {
            String[] params = heroesList.get(i).getInfo().split(" ");
            if (Integer.parseInt(params[1]) != Integer.parseInt(params[2])) {
                double temp = (Double.parseDouble(params[1]) - Double.parseDouble(params[2])) / Double.parseDouble(params[1]) * 100;
                if (temp > maxLostPercent) {
                    maxLostPercent = temp;
                    maxLostIndex = i;
                }
            }
            if (heroesList.get(i).role == "Magician") {
                tempIndexMag.add(i);
            }
        }
        System.out.println("Макс урон %: " + maxLostPercent + ", Индекс: " + maxLostIndex);

        for (int i = 0; i < tempIndexMag.size(); i++) {
            if (((Magician)heroesList.get(tempIndexMag.get(i))).magic > 0) {
                int healer = (int) (heroesList.get(maxLostIndex).health + (heroesList.get(maxLostIndex).maxHealth *
                                                                           maxLostPercent / 100 / 2));
                if (healer <= heroesList.get(maxLostIndex).maxHealth) {
                    heroesList.get(maxLostIndex).setHealth(healer);
                } else {
                    heroesList.get(maxLostIndex).setHealth(heroesList.get(maxLostIndex).maxHealth);
                }
                System.out.println("Колдун: " + heroesList.get(tempIndexMag.get(i)).name + " вылечил -> " +
                                   heroesList.get(maxLostIndex).role + " имя: " +
                                   heroesList.get(maxLostIndex).name +
                                   " new health= " + heroesList.get(maxLostIndex).health);
                newMagic = ((Magician) heroesList.get(tempIndexMag.get(i))).magic - 1;
                ((Magician) heroesList.get(tempIndexMag.get(i))).setMagic(newMagic);
                break;
            } else {
                newMagic = ((Magician) heroesList.get(tempIndexMag.get(i))).magic + 1;
                ((Magician) heroesList.get(tempIndexMag.get(i))).setMagic(newMagic);
            }
        }
        return maxLostIndex;
    }

}
