import javax.naming.Name;

public class Enemy extends AbstractEnemy{

    private static int maxhp;

    private static String name;
    public static int damage;

    public Enemy(String name, int maxHp, int xp) {
        super(name, maxHp, xp);
        this.name = name;
    }

    public static boolean Alive(){
        int Life = Enemy.maxhp;
        return Enemy.maxhp > 0;
    }

    public static int attack() {
        if (Wizzard.House.equals("Gryffindor")){
            damage = Wizzard.setMaxhp(Wizzard.getMaxhp()-5);
            return damage;
        }
        damage = Wizzard.setMaxhp(Wizzard.getMaxhp()-10);
        return damage;
    }

    public static int setMaxhp(int maxhp) {
        Enemy.maxhp = maxhp;
        return maxhp;
    }

    public static int getMaxhp() {
        return maxhp;
    }

    public static String getName() {
        return name;
    }

    //@Override
    //public int attack() {
    //    int maxhpWizard = Wizzard.hp;
    //    maxhpWizard = -1;
    //    return 0;
    //}

    @Override
    public int defend() {
        return 0;
    }
}
