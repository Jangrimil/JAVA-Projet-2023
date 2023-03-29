import java.util.Scanner;

public class Wizzard extends Character {
    public static String Name;
    public static String House;
    public static int maxhp, xp;
    public String Core_Wand;
    public int NbWand;
    public static int damage;
    public static String Spell;
    public String Pet;

    public Wizzard(int maxhp, int xp, String Name, String Pet, String House, String Core_Wand, int NbWand) {

        super(Name, Pet, 100, 10);      //name, maxHp, xp
        this.maxhp = maxhp;
        this.xp = xp;
        this.Name = Name;
        this.Pet = Pet;
        this.House = House;
        this.Core_Wand = Core_Wand;
        this.NbWand = NbWand;
    }

    public static String getName() {
        return Name;
    }



    public String getPet() {
        return Pet;
    }


    //   Setter and Getter of hp Wizzard
    public static int getMaxhp() {
        return maxhp;
    }

    public static int setMaxhp(int maxhp) {
        Wizzard.maxhp = maxhp;
        return maxhp;
    }

    public static int setXp(int xp) {
        Wizzard.xp = xp;
        return xp;
    }

    // Getter of Wizzard House
    public static String getHouse() {

        return House;
    }

    public static boolean Alive() {
        return maxhp > 0;
    }

    //          SPELL           //

    public static int spell() { //attack with spell
        if (House.equals("Slytherin")){
            damage = Enemy.setMaxhp(getMaxhp() - 25);
            return damage;
        }
        damage = Enemy.setMaxhp(getMaxhp() - 20);
        return damage;
    }
    public static int WingardiumLeviosa() {
        damage = Enemy.setMaxhp(getMaxhp() - 30);
        return damage;
    }
    public static int Acio() {
        damage = Enemy.setMaxhp(getMaxhp() - 35);
        return damage;
    }
    public static int GryffindorSword(){
        damage = Enemy.setMaxhp(getMaxhp() - 50);
        return damage;
    }
    public static int ExpectoPatronum(){
        damage = Enemy.setMaxhp(getMaxhp() - 60);
        return damage;
    }

    public static void setSpell(String spell) {
        Spell = spell;
    }

    public static String getSpell() {
        return Spell;
    }
    public static int potion() { //defend with potion
        if (House.equals("Hufflepuff")){
            setMaxhp(getMaxhp()+20);
        }
        setMaxhp(getMaxhp()+10);
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }
}

