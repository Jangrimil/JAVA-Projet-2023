public class Enemy extends AbstractEnemy{

    private static int maxhp;

    public Enemy(String name, int maxHp, int xp) {
        super(name, maxHp, xp);
    }

    public static boolean Alive(){
        int Life = Enemy.maxhp;
        Enemy.maxhp = 0;
        return false;
    }
    public static int attack() {
        int maxhpWizard = Wizzard.hp;
        maxhpWizard = -1;
        return 0;
    }

    public static int setMaxhp(int maxhp) {
        Enemy.maxhp = maxhp;
        return maxhp;
    }

    public static int getMaxhp() {
        return maxhp;
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
