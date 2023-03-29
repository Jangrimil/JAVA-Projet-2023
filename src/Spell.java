import java.util.Arrays;
import java.util.List;

public class Spell extends AbstractSpell {
    public Spell(String name, int damage) {
        super(name, damage);
    }

    public static int damage;
    //public static String AddSpell;
    @Override
    public int spell() {
        Enemy.setMaxhp(Enemy.getMaxhp()-10);
        return 0;
    }

    public static void AddSpell(){
        //String[] ListSpell={"Wingardium Leviosa", "Gryffindor Sword", "Acio", "Expecto Patronum", "Sectumsempra"};
        //Main.checkAct();
        if (Main.getcheckAct() == 1){
            Wizzard.setSpell("Wingardium Leviosa");
            //damage = Enemy.setMaxhp(Enemy.getMaxhp()-10);

            System.out.println("You receive a new spell call Wingardium Leviosa, they attack your Enemy with 10 points of damage");
        } else if (Main.getcheckAct() == 2) {
            if (Wizzard.getHouse() != "Gryffindor"){
                Wizzard.setSpell("Acio");
                System.out.println("You receive a new spell call Wingardium Leviosa, they attack your Enemy with 20 points of damage");
            }else {
                Wizzard.setSpell("Gryffindor Sword");
                System.out.println("You receive a special sword for Gryffondor, they attack your Enemy with 70 points of damage");
            }
        } else if (Main.getcheckAct()==3) {
            System.out.println("You receive a new spell call Ex....? you have to discover the name for use it, they attack your Enemy with 70 points of damage");
        } else if (Main.getcheckAct()==4) {
            System.out.println("You receive a new spell call Acio, they attack your Enemy with 30 points of damage");
        }
    }

    @Override
    public int spellforbiden() {
        return 0;
    }
}
