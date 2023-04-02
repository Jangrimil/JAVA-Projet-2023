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

    //          SPELL           //

    protected static void spell(int damage) { //attack with spell
        if (House.equals("Slytherin")) {
            Enemy.setMaxhp(Enemy.getMaxhp() - damage*2);
            Enemy.die();
        } else {
            Enemy.setMaxhp(Enemy.getMaxhp() - damage);
            Enemy.die();
        }
    }
    protected static void firework(int damage){
        damage = Enemy.setMaxhp(Enemy.getMaxhp())-damage;
        Enemy.die();
    }
    public static int WingardiumLeviosa() {
        damage = Enemy.setMaxhp(Enemy.getMaxhp() - 30);
        Enemy.die();
        return damage;

    }
    public static void Acio() {
        if (Wizzard.xp == 40){
            int porket=100;
            int find = porket -25;
            if (find==0){
                Boss.setMaxhp(Boss.getMaxhp()-200);
                System.out.println("The Porket is find you can RUN..........");
            } else {

                find = find -25;
                System.out.println("You are " +find+ "% close to Porket, be careful");
            }
        } else {
            damage = Enemy.setMaxhp(Enemy.getMaxhp() - 35);
            Enemy.die();
        }
        }
    public static int GryffindorSword(){
        damage = Enemy.setMaxhp(Enemy.getMaxhp() - 50);
        Enemy.die();
        return damage;
    }
    public static int ExpectoPatronus(){
        damage = Enemy.setMaxhp(Enemy.getMaxhp() - 60);
        Enemy.die();
        return damage;
    }

    public static int Expelliarmus(){
        damage = Enemy.setMaxhp(Enemy.getMaxhp() - 70);
        setMaxhp(getMaxhp()+20);
        Enemy.die();
        return damage;
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

