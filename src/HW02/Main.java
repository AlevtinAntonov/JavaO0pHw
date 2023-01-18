package HW02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();
        String heroName;

        List<BaseHero> heroesOne = new ArrayList<>();
        List<BaseHero> heroesTwo = new ArrayList<>();

        for (int i = 0; i < teamCount; i++) {
            heroName = String.valueOf(Name.values()[rand.nextInt(Name.values().length)]);

            switch (rand.nextInt(4)) {
                case 0:
                    heroesOne.add(new Peasant(heroName));
                    break;
                case 1:
                    heroesOne.add(new Outlaw(heroName));
                    break;
                case 2:
                    heroesOne.add(new Sniper(heroName));
                    break;
                case 3:
                    heroesOne.add(new Magician(heroName));
                    break;
            }
            switch (rand.nextInt(4)) {
                case 0:
                    heroesTwo.add(new Peasant(heroName));
                    break;
                case 1:
                    heroesTwo.add(new Spearman(heroName));
                    break;
                case 2:
                    heroesTwo.add(new Crossbowman(heroName));
                    break;
                case 3:
                    heroesTwo.add(new Monk(heroName));
                    break;
            }
        }

        heroesOne.forEach(n -> System.out.print(n.getInfo()+", "));
        System.out.println();
        heroesTwo.forEach(n -> System.out.print(n.getInfo()+", "));

        System.out.println(heroesOne);
        System.out.println(heroesTwo);

    }
}