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
            System.out.println("You receive a new spell call Wingardium Leviosa, they attack your Enemy with 30 points of damage");
        } else if (Wizzard.xp == 20) {
            place = 1;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
            if (Wizzard.getHouse() != "Gryffindor"){
                Wizzard.setSpell("Acio");
                System.out.println("You receive a new spell call Acio, they attack your Enemy with 35 points of damage");
            }else {
                Wizzard.setSpell("Gryffindor Sword");
                System.out.println("You receive a special sword for Gryffondor, they attack your Enemy with 50 points of damage");
            }
        } else if (Wizzard.xp == 30) {
            place = 2;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
            System.out.println("You receive a new spell call Ex....? you have to discover the name for use it, they attack your Enemy with 60 points of damage");
        } else if (Wizzard.xp == 40) {
            place = 3;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
            System.out.println("You receive a spell call Acio, they attack your Enemy with 35 points of damage");
        }
    }

    @Override
    public int spellforbiden() {
        return 0;
    }
}
