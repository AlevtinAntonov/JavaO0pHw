package HW04;

import HW04.chars.*;

import java.util.*;

public class Main {
    public static final int GANG_SIZE = 5;
    public static ArrayList<UnitBase> whiteSide;
    public static ArrayList<UnitBase> whitePeasant;
    public static ArrayList<UnitBase> whiteTeam;
    public static ArrayList<UnitBase> darkSide;
    public static ArrayList<UnitBase> darkPeasant;
    public static ArrayList<UnitBase> darkTeam;


    public static void main(String[] args) {
        init();






        whiteSide.forEach(n -> System.out.print(n.getInfo() + ", "));
        System.out.println();
        darkSide.forEach(n -> System.out.print(n.getInfo() + ", "));
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("****** White Team ******");
            whiteSide.forEach(n -> n.step(darkSide));
            System.out.println("***** Dark Team *******");
            darkSide.forEach(n -> n.step(whiteSide));
            scanner.nextLine();
        }
    }
    private static void init(){
        Random rand = new Random();
        String heroName;
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>();
        whitePeasant = new ArrayList<>();
        whiteTeam = new ArrayList<>();
        darkPeasant = new ArrayList<>();
        darkTeam = new ArrayList<>();

        int x = 1;
        int y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            heroName = String.valueOf(Name.values()[rand.nextInt(Name.values().length)]);
            switch (new Random().nextInt(4)) {
                case 0: whitePeasant.add(new Peasant(heroName, whiteSide, x, y++)); break;
                case 1: whiteTeam.add(new Outlaw(heroName, whiteSide, x, y++)); break;
                case 2: whiteTeam.add(new Sniper(heroName, whiteSide, x, y++)); break;
                default: whiteSide.add(new Magician(heroName, whiteSide, x, y++)); break;
            }
        }

        whiteSide.addAll(whiteTeam);
        whiteSide.addAll(whitePeasant);


        x = GANG_SIZE;
        y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            heroName = String.valueOf(Name.values()[rand.nextInt(Name.values().length)]);

            switch (new Random().nextInt(4)) {
                case 0: darkPeasant.add(new Peasant(heroName, darkSide, x, y++)); break;
                case 1: darkTeam.add(new Spearman(heroName, darkSide, x, y++)); break;
                case 2: darkTeam.add(new Crossbowman(heroName, darkSide, x, y++)); break;
                default: darkSide.add(new Monk(heroName, darkSide, x, y++)); break;
            }
        }
        darkSide.addAll(darkTeam);
        darkSide.addAll(darkPeasant);
    }
}