import java.util.Scanner;

public class Wizzard extends Character {
    private static String Name;
    protected static String House;
    private static int maxhp, xp, NbWand, damage;
    protected String Core_Wand, Pet;
    protected static String Spell;
    public Wizzard(int maxhp, int xp, String Name, String Pet, String House, String Core_Wand, int NbWand) {
        super(Name, Pet, 100, 10);      //name, maxHp, xp
        Wizzard.maxhp = maxhp;
        Wizzard.xp = xp;
        Wizzard.Name = Name;
        this.Pet = Pet;
        Wizzard.House = House;
        this.Core_Wand = Core_Wand;
        this.NbWand = NbWand;
    }
    public static String getName() {
        return Name;
    }
    public String getPet() {
        return Pet;
    }

    //   Setter and Getter of hp/xp Wizzard
    public static int getMaxhp() {
        return maxhp;
    }

    protected static int setMaxhp(int maxhp) {
        Wizzard.maxhp = maxhp;
        return maxhp;
    }
    protected static int getXp(){
        return xp;
    }

    protected static int setXp(int xp) {
        Wizzard.xp = xp;
        return xp;
    }

    // Getter of Wizzard House
    public static String getHouse() {
        return House;
    }

    public static void setHouse(String house) {
        House = house;
    }

    public static void setSpell(String spell) {
        Spell = spell;
    }
    public static void potion(int pv) { //defend with potion
        if (Wizzard.maxhp == 100) {
            System.out.println(" You can't use potion you have " + Wizzard.getMaxhp());
        } else {
            if (House.equals("Hufflepuff")) {
                setMaxhp(getMaxhp() + pv * 2);
            } else {
                setMaxhp(getMaxhp() + pv);
            }
        }

    }
    protected static boolean Alive() {
        return Wizzard.maxhp > 0;
    }
    protected static boolean die(){
        if (Wizzard.maxhp<=0){
            Wizzard.setMaxhp(0);
        }
        return true;
    }
}

