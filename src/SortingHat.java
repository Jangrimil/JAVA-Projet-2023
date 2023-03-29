import java.util.Scanner;
import java.util.Random;
public class SortingHat {

    public static String House;
    public static Wizzard maxhp, xp;
    public static float heal,resistant,accurate, damage;
    public SortingHat(String House, float heal, float damage, float resistant, float accurate){
        this.House = House;
        this.heal = heal;
        this.damage = damage;
        this.resistant = resistant;
        this.accurate = accurate;

    }
    public void HufflepuffH(){
        if (House.equals("Ravenclaw")) {
            heal += 5;
        } else {
            resistant += 2;
        }
    }

    public void SlytherinD(){
        if (House.equals("Slytherin")){
            damage*=2;
        }else {
            damage*=1;
        }
    }
    public void GryffindorR(){
        if (House.equals("Gryffindor")){
            damage -=8;
        }
    }

    public static void RavenclawA(){
        Random rand = new Random();
        if (House.equals("Ravenclaw")){
            int min = 25;
            int max = 100;
            int precisionWizzard = rand.nextInt(max - min +1)+min;
            int precisionEnemy = rand.nextInt(max - min +1)+min;
        } else {
            int min = 0;
            int max = 100;
            int precisionWizzard = rand.nextInt(max - min +1)+min;
            int precisionEnemy = rand.nextInt(max - min +1)+min;
        }
    }
    public String getHouse(){
        return House;
    }

}
