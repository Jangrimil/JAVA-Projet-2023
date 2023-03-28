public abstract class Character {

    // Variables / Attributes all characters have
    public String name;
    public String Pet;
    public static int maxHp, hp, xp;

    // Constructor for character
    public Character(String name, String Pet, int maxHp, int xp){
        this.name = name;
        this.Pet = Pet;
        this.maxHp = maxHp;
        this.xp = xp;
        this.hp = maxHp;
    }


    //methods every character has
    public abstract int defend();
}
