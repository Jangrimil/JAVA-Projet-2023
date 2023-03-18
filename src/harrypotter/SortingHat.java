package harrypotter;
import java.util.Scanner;
public class SortingHat {
    public static void Quizz() {
        Scanner scanner = new Scanner(System.in);
        String x;
        System.out.println("Which house is your");
        do {
            System.out.println("1. Which of the following options would you most like to study?\n " +
                    "A. Mermaids        B. Werewolves        C. Vampires        D. Goblins ");
            x = scanner.nextLine();
        }while ( !x.equals("A") && !x.equals("B") && !x.equals("C") && !x.equals("D"));

        do {
            System.out.println("2. If given the choice, you would prefer to invent a potion that would guarantee :\n " +
                "A. FAME        B. LOVE        C. POWER        D. WISDOM" );
            x = scanner.nextLine();
        }while ( !x.equals("A") && !x.equals("B") && !x.equals("C") && !x.equals("D"));

        do {
            System.out.println("3. Four cups are placed in front of you. Which one do you choose to drink from? :\n" +
                "A. The thick, creamy, rich purple drink with a delicious smell of chocolate and plums.\n" +
                "B. The mysterious black liquid that glows like ink and gives off fumes that make you see strange things.\n" +
                "C. The frothy, foamy, silvery liquid that shines as if it contains ground diamonds.\n" +
                "D. The golden liquid so bright it hurts the eye, and makes sunspots dance all over the room.");
            x = scanner.nextLine();
        }while ( !x.equals("A") && !x.equals("B") && !x.equals("C") && !x.equals("D"));

        do {
            System.out.println("4. If you were at Hogwarts, what pet would you choose to take with you?\nA. Chat        B. Crapaud        C. Chouette        D. Rat");
        x = scanner.nextLine();
        }while ( !x.equals("A") && !x.equals("B") && !x.equals("C") && !x.equals("D"));
    }
}
