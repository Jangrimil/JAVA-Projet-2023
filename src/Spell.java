import java.util.Arrays;
import java.util.List;

public class Spell extends AbstractSpell {
  public static String name;
    public Spell(String name, int damage) {

        super(name, damage);
        this.name = name;
    }

    public static int damage;
    //public static String AddSpell;
    @Override
    public int spell() {
        Enemy.setMaxhp(Enemy.getMaxhp()-10);
        return 0;
    }
    private static int place=0;
    public static String[] places = {"The Philosopher's Stone", "The Chamber of Secrets", "The Prisoner of Azkaban", "The Goblet of Fire", "The Order of the Phenix", "The half-blood Prince", "The Deathly Hallows"};
    public static void AddSpell(){
        if (Wizzard.xp == 10){
            place = 0;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
            Wizzard.setSpell("Wingardium Leviosa");
            System.out.println("Welcome to your first year, for your first mission the Troll of the Hogwart is located in the toilets next to the dungeon. To defeat him defeat him, you must lift objects and release them when they are over his head. You receive a new spell call Wingardium Leviosa, they attack your Enemy with 30 points of damage");
        } else if (Wizzard.xp == 20) {
            place = 1;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
            if (Wizzard.getHouse() != "Gryffindor"){
                Wizzard.setSpell("Acio");
                System.out.println("You are facing the terrible basilisk. If you are from Griffondor, you can use a new spell call Acio, they attack your Enemy with 35 points of damage");
            }else {
                Wizzard.setSpell("Gryffindor Sword");
                System.out.println("You are facing the terrible basilisk. If you are from Griffondor, you can call upon the legendary sword of Godric Gryffindor to strike it down.");
            }
        } else if (Wizzard.xp == 30) {
            place = 2;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
            System.out.println("The Destroyers are on the loose. They roam the streets, the countryside. Fortunately, you have heard of a spell to put them to flight call Ex....? you have to discover the name for use it, they attack your Enemy with 60 points of damage");
        } else if (Wizzard.xp == 40) {
            place = 3;
            Wizzard.setSpell("Acio");
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
            System.out.println("the Three Wizards Tournament... and the right to die, you have to run away from Voldemort and Peter Pettigrew for that, you must approach the Portolion, draw him to you (accio) and run away.");
        } else if (Wizzard.xp == 50) {
            place = 4;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
            System.out.println("You will receive firework when Mme Dolores have 30hp, attack her until she had 30hp and use firework to do your final blow");
        } else if (Wizzard.xp == 60) {
            place = 5;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
            System.out.println("We are slowly getting closer to the end, but.... the Death Eaters have invaded Hogwarts you must attack them but a choice must be made by Slytherin");
        } else if (Wizzard.xp == 70) {
            place = 5;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
            Wizzard.setSpell("expelliarmus");
            System.out.println("This is the last level of your years at Hogwarts, but after you passed, Voldemort and Bellatrix Lestrange came in person to take you down in one spell! Be careful and use Expelliarmus you've learned over the years.");
        }
    }

    @Override
    public int spellforbiden() {
        return 0;
    }
}
