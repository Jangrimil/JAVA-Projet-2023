package harrypotter;
import java.util.Scanner;
public class SortingHat {
    public static void Quizz() {
        Scanner scanner = new Scanner(System.in);
        String x;
        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        System.out.println("Which house is your");
        do {
            System.out.println("1. Which of the following options would you most like to study?\n " +
                    "A. Mermaids        B. Werewolves        C. Vampires        D. Goblins ");
            x = scanner.nextLine();
            if (x.equals("A")){
                countA++;
            } else if (x.equals("B")) {
                countB++;
            } else if (x.equals("C")) {
                countC++;
            } else {
                countD++;
            }
        }while ( !x.equals("A") && !x.equals("B") && !x.equals("C") && !x.equals("D"));

        do {
            System.out.println("2. If given the choice, you would prefer to invent a potion that would guarantee :\n " +
                "A. WISDOM        B. FAME        C. BRAVE        D. LOVE" );
            x = scanner.nextLine();
            if (x.equals("A")){
                countA++;
            } else if (x.equals("B")) {
                countB++;
            } else if (x.equals("C")) {
                countC++;
            } else {
                countD++;
            }
        }while ( !x.equals("A") && !x.equals("B") && !x.equals("C") && !x.equals("D"));

        do {
            System.out.println("3. Four cups are placed in front of you. Which one do you choose to drink from? :\n" +
                "A. The thick, creamy, rich purple drink with a delicious smell of chocolate and plums.\n" +
                "B. The mysterious black liquid that glows like ink and gives off fumes that make you see strange things.\n" +
                "C. The frothy, foamy, silvery liquid that shines as if it contains ground diamonds.\n" +
                "D. The golden liquid so bright it hurts the eye, and makes sunspots dance all over the room.");
            x = scanner.nextLine();
            if (x.equals("A")){
                countA++;
            } else if (x.equals("B")) {
                countB++;
            } else if (x.equals("C")) {
                countC++;
            } else {
                countD++;
            }
        }while ( !x.equals("A") && !x.equals("B") && !x.equals("C") && !x.equals("D"));

        do {
            System.out.println("4. If you were at Hogwarts, what pet would you choose to take with you?\n A. Chat        B. Serpent        C. Chouette        D. Rat");
        x = scanner.nextLine();
            if (x.equals("A")){
                countA++;
            } else if (x.equals("B")) {
                countB++;
            } else if (x.equals("C")) {
                countC++;
            } else {
                countD++;
            }
        }while ( !x.equals("A") && !x.equals("B") && !x.equals("C") && !x.equals("D"));

        do {
            System.out.println("5. Imagine you were faced with an insurmountable obstacle. How would you react?\n A. I would look for a solution using my logic and creativity        B. I would try to get around the obstacle using all the means at my disposal.         C. I would face the obstacle with courage and determination, seeking to overcome it.         D. I would seek help from my friends and community to find a solution.");
            x = scanner.nextLine();
            if (x.equals("A")){
                countA++;
            } else if (x.equals("B")) {
                countB++;
            } else if (x.equals("C")) {
                countC++;
            } else {
                countD++;
            }
        }while ( !x.equals("A") && !x.equals("B") && !x.equals("C") && !x.equals("D"));


        if (countA > countB && countA > countC && countA > countD){
            System.out.println("You belong to Ravenclaw House\n" +
                    "Notable members include Luna Lovegood, Gilderoy Lockhart and Filius Flitwick.\n" +
                    "\n" +
                    "‘Or yet in wise old Ravenclaw\n" +
                    "If you’ve a ready mind\n" +
                    "Where those of wit and learning\n" +
                    "Will always find their kind.’\n" +
                    "Harry Potter and the Philosopher’s Stone");
        } else if (countB > countA && countB > countC && countB > countD) {
            System.out.println("You belong to Slytherin House\n" +
                    "Notable members include Severus Snape, Draco Malfoy and (rather unfortunately) Lord Voldemort.\n" +
                    "\n" +
                    "‘Or perhaps in Slytherin\n" +
                    "You’ll make your real friends\n" +
                    "Those cunning folk use any means\n" +
                    "To achieve their ends.’\n" +
                    "Harry Potter and the Philosopher’s Stone");
        } else if (countC > countA && countC > countB && countC > countD) {
            System.out.println("You belong to Gryffindor House\n" +
                    "Notable members include (of course) Harry Potter, Hermione Granger and Ron Weasley.\n" +
                    "\n" +
                    "‘You might belong in Gryffindor,\n" +
                    "Where dwell the brave at heart,\n" +
                    "Their daring, nerve and chivalry\n" +
                    "Set Gryffindors apart.’\n" +
                    "Harry Potter and the Philosopher’s Stone");
        } else {
            System.out.println("You belong to Hufflepuff House\n" +
                    "Notable members include Newt Scamander, Cedric Diggory and Nymphadora Tonks.\n" +
                    "\n" +
                    "‘You might belong in Hufflepuff\n" +
                    "Where they are just and loyal\n" +
                    "Those patient Hufflepuffs are true\n" +
                    "And unafraid of toil.’\n" +
                    "Harry Potter and the Philosopher’s Stone");
        }

    }
}
