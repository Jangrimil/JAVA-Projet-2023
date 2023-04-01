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



    //          SPELL           //

    public static void spell(int damage) { //attack with spell
        if (House.equals("Slytherin")) {
            Enemy.setMaxhp(Enemy.getMaxhp() - damage*2);
            Enemy.die();
            //return damage;
        } else {
            damage = Enemy.setMaxhp(Enemy.getMaxhp() - damage); //10
            Enemy.die();
            //return damage;
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
    public static int Sectumsempra(int damage){
        damage = Enemy.setMaxhp(Enemy.getMaxhp() - 45);
        return damage;
    }

    public static void setSpell(String spell) {
        Spell = spell;
    }

    public static String getSpell() {
        return Spell;
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

    public static boolean Alive() {
        return Wizzard.maxhp > 0;
    }
    public static boolean die(){
        if (Wizzard.maxhp<=0){
            Wizzard.setMaxhp(0);
        }
        return true;
    }

    @Override
    public int defend() {
        return 0;
    }
}

