package harrypotter;
import java.util.Scanner;
public class Wand {

    public static void baguette(){
        Scanner scanner = new Scanner(System.in);
        //Element de la baguette
        int x;
        Core TypeWang[]= Core.values();
        String choose_TWang;
        do {
            System.out.println("What your preference ? :\n" +TypeWang);            //Essayer de mettre une condition
            x = scanner.nextInt();
        } while (x<=0 || x>=3);

        if (x==1){
            choose_TWang="PHOENIX_FEATHER";
        }
        else {
            choose_TWang="DRAGON_HEARTSTRING";
        }
        //Longueur Baguette
        int NbWang;
        do {
            System.out.println("Give a number for your Wand into 1 and 9");
            NbWang = scanner.nextInt();
        } while (NbWang<=1 || NbWang>=9);

        System.out.println("Information about your Wang : LENGTH = " +NbWang+ " and ELEMENT : " +choose_TWang);
    }
}
