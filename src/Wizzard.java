
import javax.naming.Name;
import java.util.Scanner;
public class Wizzard extends Character{
    public String Name;
    public String House;
    public String Core_Wand;
    public int NbWand;
    public String Spell;
    public String Potion;
    public String Pet;
    //public String[] Spelllearn = {"Wingardium Leviosa", ""};
    public String[] Potionlearn ={};


    public String[] atkUpgrades = {};
    public String[] defendUpgrade = {};

    public Wizzard(String Name, String Pet, String House, String Core_Wand, int NbWand ){

        super(Name, Pet, 100, 0 );      //name, maxHp, xp
        this.House = House;
        this.Core_Wand = Core_Wand;
        this.NbWand = NbWand;
    }

    public String getName() {
        return Name;
    }

    public String getPet(){
        return Pet;
    }

    @Override
    public int spell() { //attack with spell
        return 0;
    }

    @Override
    public int potion() { //defend with potion
        return 0;
    }

    //public static void Wizzard() {
      //  System.out.println("Define your Witcher name ");
        //Scanner scanner = new Scanner(System.in);
        //this.Name = scanner.nextLine();
        //System.out.println("Hello ! " + this.Name);
        //Wizzard Wizzard = new Wizzard("Name", 56, "PHOENIX","Poussoufle");
    //}

    //public int NbWang;
    //public String choose_TWang;

    //public String House;

    //public Wizzard(String Name, int NbWang, String choose_TWang, String House ) {

        //this.NbWang = NbWang;
        //this.choose_TWang = choose_TWang;
        //this.Name = Name;
        //this.House = House;
    //}
}

