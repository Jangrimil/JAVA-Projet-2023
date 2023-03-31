import java.util.Scanner;

public class Wizzard extends Character {
    public static String Name;
    public static String House;
    public static int maxhp, xp;
    public String Core_Wand;
    public int NbWand;
    public static int damage,totaldamage;
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

    public static void takeDamage() {
        totaldamage += damage;
        die();
    }
    public static int getTotaldamage() {
        return totaldamage;
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

    public static void spell(Enemy Enemy) { //attack with spell
        if (House.equals("Slytherin")) {
            damage = Enemy.setMaxhp(Enemy.getMaxhp() - 20);
            Enemy.die();
            //return damage;

        } else {
            damage = Enemy.setMaxhp(Enemy.getMaxhp() - 10);
            Enemy.die();
            //return damage;
        }
    }

    public static void spell5(Enemy Enemy){
        if (House.equals("Slytherin")) {
            damage = Enemy.setMaxhp(Enemy.getMaxhp() - 25);
            Enemy.die();
        } else {
            damage = Enemy.setMaxhp(Enemy.getMaxhp() - 20);
            Enemy.die();
        }
    }

    protected static void firework(int damage){
        damage = Enemy.setMaxhp(Enemy.getMaxhp())-damage;
    }
    public static int WingardiumLeviosa() {
        damage = Enemy.setMaxhp(Enemy.getMaxhp() - 30);
        Enemy.die();
        return damage;

    }
    public static int Acio() {
        damage = Enemy.setMaxhp(Enemy.getMaxhp() - 35);
        Enemy.die();
        return damage;
    }
    public static int GryffindorSword(){
        damage = Enemy.setMaxhp(Enemy.getMaxhp() - 50);
        Enemy.die();
        return damage;
    }
    public static int ExpectoPatronus(Enemy Enemy){
        damage = Enemy.setMaxhp(Enemy.getMaxhp() - 60);
        Enemy.die();
        return damage;
    }

    public static void setSpell(String spell) {
        Spell = spell;
    }

    public static String getSpell() {
        return Spell;
    }
    public static void potion() { //defend with potion
        if (House.equals("Hufflepuff")){
            setMaxhp(getMaxhp()+20);
        }
        setMaxhp(getMaxhp()+10);
        if (Wizzard.maxhp == 100) {
            System.out.println(" You can't use potion you have " + Wizzard.getMaxhp());
        }
    }

    public static int die(){
        if (Wizzard.maxhp<=0){
            Wizzard.setMaxhp(0);
        }
        return maxhp;
    }

    @Override
    public int defend() {
        return 0;
    }
}

