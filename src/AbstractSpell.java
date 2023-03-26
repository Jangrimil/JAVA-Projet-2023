public abstract class  AbstractSpell {
public String name;
public int damage;

// Constructor for character
public AbstractSpell(String name, int damage){
        this.name = name;
        this.damage = damage;
        }

//methods every character has
public abstract int spell();
public abstract int spellforbiden();
}
