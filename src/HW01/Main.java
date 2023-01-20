package HW01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int teamCount = 50;
        Random rand = new Random();
        String heroName;


        List<BaseHero> peasant = new ArrayList<>();
        List<BaseHero> outlaw = new ArrayList<>();
        List<BaseHero> sniper = new ArrayList<>();
        List<BaseHero> magician = new ArrayList<>();
        List<BaseHero> spearman = new ArrayList<>();
        List<BaseHero> crossbowman = new ArrayList<>();
        List<BaseHero> monk = new ArrayList<>();

        for (int i = 0; i < teamCount; i++) {
            heroName = String.valueOf(Name.values()[rand.nextInt(Name.values().length)]);

            switch (rand.nextInt(7)) {
                case 0:
                    peasant.add(new Peasant(heroName));
                    break;
                case 1:
                    outlaw.add(new Outlaw(heroName));
                    break;
                case 2:
                    sniper.add(new Sniper(heroName));
                    break;
                case 3:
                    magician.add(new Magician(heroName));
                    break;
                case 4:
                    spearman.add(new Spearman(heroName));
                    break;
                case 5:
                    crossbowman.add(new Crossbowman(heroName));
                    break;
                case 6:
                    monk.add(new Monk(heroName));
                    break;
                default:
                    break;
            }
        }

        System.out.println(peasant);
        System.out.println(outlaw);
        System.out.println(sniper);
        System.out.println(magician);
        System.out.println(spearman);
        System.out.println(crossbowman);
        System.out.println(monk);
    }
}