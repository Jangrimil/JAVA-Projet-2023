public class Enemy extends AbstractEnemy{

    public static int maxhp,xp;

    private static String name;
    public static int damage, totaldamage;

    public Enemy(String name, int maxhp, int xp) {
        super(name, 100, 10);
        this.name = name;
        this.maxhp = maxhp;
        this.xp = xp;
    }

    public static boolean Alive(){
        int Life = Enemy.maxhp;
        return Enemy.maxhp > 0;
    }

    public static void takeDamage() {
        totaldamage += damage;
        die();
    }
    public int getTotaldamage() {
        return maxhp;
    }
    public static int attack() {
        if (Wizzard.House.equals("Gryffindor")){
            damage = Wizzard.setMaxhp(Wizzard.getMaxhp()-5);
            Wizzard.die();
        } else if (Enemy.getName() == "Dolores Umbridge") {
            if (Wizzard.House.equals("Gryffindor")) {
                damage = Wizzard.setMaxhp(Wizzard.getMaxhp() - 10);
                Wizzard.die();
            } else { damage = Wizzard.setMaxhp(Wizzard.getMaxhp()-20);
                Wizzard.die();
            }
        }
        else {damage = Wizzard.setMaxhp(Wizzard.getMaxhp()-10);
            Wizzard.die();
        }
        return damage;
    }

    public static int die() {
        if (Enemy.maxhp <= 0) {
            Enemy.setMaxhp(0);
        }
        return maxhp;
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
