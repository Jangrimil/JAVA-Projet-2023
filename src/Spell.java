public class Spell extends AbstractSpell {
    public String[] Spellchoosen = {"Wingardium Leviosa", "Gryffindor Sword", "Acio", "Expecto Patronum", "Sectumsempra"};
    public Spell(String name, int damage) {
        super(name, damage);
    }

    public static int Spellchoose = 0;
    @Override
    public int spell() {
        if (Wizzard.xp >= 10){
            Spellchoose = 1;
            System.out.println(Spellchoosen[Spellchoose]);
        }
        else if (Wizzard.xp >= 20){
            //for ( )
            Spellchoose = 2;
            System.out.println(Spellchoosen[Spellchoose]);
        }
        return 0;
    }

    @Override
    public int spellforbiden() {
        return 0;
    }
}
