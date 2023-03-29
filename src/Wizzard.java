public class Wizzard extends Character{
    public static String Name;
    public static String House;
    public static int maxhp;
    public String Core_Wand;
    public int NbWand;
    public static int damage;
    public static String Spell;
    public String Potion;
    public String Pet;
    public String[] Potionlearn ={};


    public String[] atkUpgrades = {};
    public String[] defendUpgrade = {};

    public Wizzard(int maxhp, int xp, String Name, String Pet, String House, String Core_Wand, int NbWand ){

        super(Name, Pet, 100, 10 );      //name, maxHp, xp
        this.maxhp = maxhp;
        this.xp= xp;
        this.Name = Name;
        this.Pet = Pet;
        this.House = House;
        this.Core_Wand = Core_Wand;
        this.NbWand = NbWand;
    }

    public static String getName() {return Name;}


    //public static String House() {
     //   String house = SortingHat.SortingHat(String "Slytherin");
    //    if (house == Slytherin)
    //}

    public String getPet(){return Pet;}


   //   Setter and Getter of hp Wizzard
    public static int getMaxhp() {
        return maxhp;
    }

    public static int setMaxhp(int maxhp) {
        Wizzard.maxhp = maxhp;
        return maxhp;
    }

    // Getter of Wizzard House
    public static String getHouse(){

        return House;
    }

    public static boolean Alive(){
        return maxhp > 0;
    }


    public static int spell() { //attack with spell
        damage = Enemy.setMaxhp(getMaxhp()-10);
        return damage;
    }

    public static void setSpell(String spell) {
        Spell = spell;
    }

    public static String getSpell() {
        return Spell;
    }
    public static int potion() { //defend with potion
        setMaxhp(getMaxhp()+10);
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }
}

