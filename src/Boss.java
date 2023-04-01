public class Boss extends AbstractEnemy{
    protected static int maxhp,xp;
    private static String name;
    public static int damage;
    public static String CoreWand;
    public Boss(String name, int maxhp, int xp){
        super(name,200,50);
        this.maxhp = maxhp;
        this.xp = xp;
        this.name = name;
        this.CoreWand = CoreWand;
        
    }
    public static boolean Alive(){return Boss.maxhp > 0;}
    public static int attack(int damage) {
        if (Wizzard.House.equals("Gryffindor")) {
            damage = Wizzard.setMaxhp(Wizzard.getMaxhp() - damage);
            Wizzard.die();
        } else {
            damage = Wizzard.setMaxhp(Wizzard.getMaxhp() - damage);
            Wizzard.die();
        }
        return damage;
    }

    public static void beattacked(int damage){
        if (Wizzard.House.equals("Slytherin")) {
            Boss.setMaxhp(Boss.getMaxhp() - 2 *damage);
            Boss.die();
            //return damage;

        } else {
            Boss.setMaxhp(Boss.getMaxhp() - damage); //10
            Boss.die();
            //return damage;
        }
    }

    public static void setCoreWand(String coreWand) {
        CoreWand = coreWand;
    }

    public static void setMaxhp(int maxhp) {
        Boss.maxhp = maxhp;
    }

    public static int getMaxhp() {
        return maxhp;
    }

    public static String getName() {return name;}

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
