package harrypotter;
import java.util.Scanner;
public class sorcier {
    private int niveau;

    public sorcier(String nom){
       sorcier.Wizard();
       Wand.baguette();
       SortingHat.Quizz();
    }
      public static void Wizard(){
        System.out.println("Define your Witcher name " );
        Scanner scanner = new Scanner(System.in);
        String Wizard = scanner.nextLine();
        System.out.println("Hello ! " +Wizard);
    }
}
