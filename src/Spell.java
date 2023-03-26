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
            //for(SortingHat ) //(Grinfondor épéee autre Acio)
            Spellchoose = 2;
            System.out.println(Spellchoosen[Spellchoose]);
        }else if (Wizzard.xp >= 30){
            //for ( )
            Spellchoose = 3;
            System.out.println(Spellchoosen[Spellchoose]);
        }else if (Wizzard.xp >= 40){
            //for ( )
            Spellchoose = 4;
            System.out.println(Spellchoosen[Spellchoose]);
        }else if (Wizzard.xp >= 50){
            //for ( )
            Spellchoose = 5;
            System.out.println(Spellchoosen[Spellchoose]);
        }else if (Wizzard.xp >= 60){
            //for ( )
            Spellchoose = 6;
            System.out.println(Spellchoosen[Spellchoose]);
        }else if (Wizzard.xp >= 70){
            //for ( )
            Spellchoose = 7;
            System.out.println(Spellchoosen[Spellchoose]);
        }
        return 0;
    }

    @Override
    public int spellforbiden() {
        return 0;
    }
}
