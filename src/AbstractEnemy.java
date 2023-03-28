public abstract class AbstractEnemy {
    public String name;
    public int maxHp, hp, xp;

    // Constructor for character
    public AbstractEnemy(String name, int maxHp, int xp){
        this.name = name;
        this.maxHp = maxHp;
        this.xp = xp;
        this.hp = maxHp;
    }

    //methods every character has
    public static int attack() {
        return 0;
    }

    public abstract int defend();
}
