package com.example.demo2;

public class Enemy {

    public int maxhp;
    private int xp;
    private static int damage;
    private static String name;

    public Enemy(String name, int maxhp, int xp) {
        this.name = name;
        this.maxhp = maxhp;
        this.xp = xp;
    }
    public static int attack() {
        if (Wizzard.House.equals("Gryffindor")){
            damage = Wizzard.setMaxhp(Wizzard.getMaxhp()-5);
            Wizzard.die();
        } else if (Enemy.getName() == "Dolores Umbridge") {
                if (Wizzard.House.equals("Gryffindor")) {
                damage = Wizzard.setMaxhp(Wizzard.getMaxhp() - 10);
                Wizzard.die();
                }
                else { damage = Wizzard.setMaxhp(Wizzard.getMaxhp()-20);
                Wizzard.die();
                }
        }
        else {damage = Wizzard.setMaxhp(Wizzard.getMaxhp()-10);
            Wizzard.die();
        }
        return damage;
    }
    public boolean die() {
        if (getMaxhp() <= 0) {
            setMaxhp(0);
        }
        return true;
    }
    public boolean Alive(){
        return getMaxhp() > 0;
    }

    protected int spell(int damage) { //attack with spell
        if (Wizzard.House.equals("Slytherin")) {
            setMaxhp(getMaxhp() - damage*2);
            die();
        } else {
            setMaxhp(getMaxhp() - damage);
            die();
        }
        return damage;
    }

    protected void firework(int damage){
        damage = setMaxhp(getMaxhp())-damage;
        die();
    }
    public int WingardiumLeviosa() {
        damage = setMaxhp(getMaxhp() - 30);
        die();
        return damage;
    }

    public void Acio() {
        if (Wizzard.getXp() == 40){
            int porket=100;
            int find = porket -25;
            if (find==0){
                setMaxhp(getMaxhp()-200);
                System.out.println("The Porket is find you can RUN..........");
            } else {

                find = find -25;
                System.out.println("You are " +find+ "% close to Porket, be careful");
            }
        } else {
            damage = setMaxhp(getMaxhp() - 35);
            die();
        }
    }

    public int GryffindorSword(){
        damage = setMaxhp(getMaxhp() - 50);
        die();
        return damage;
    }
    public int ExpectoPatronus(){
        damage = setMaxhp(getMaxhp() - 60);
        die();
        return damage;
    }

    public int Expelliarmus(){
        damage = setMaxhp(getMaxhp() - 70);
        setMaxhp(getMaxhp()+20);
        die();
        return damage;
    }
    public int Sectumsempra(){
        damage = setMaxhp(getMaxhp() - 45);
        die();
        return damage;
    }

    //Getter / Setter
    public int setMaxhp(int maxhp) {
        this.maxhp = maxhp;
        return maxhp;
    }
    public int getMaxhp() {
        return maxhp;
    }
    public static String getName() {
        return name;
    }
}
