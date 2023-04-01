public abstract class AbstractEnemy {
    protected String name;
    protected int maxHp, hp, xp;

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
}
