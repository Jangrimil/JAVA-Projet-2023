import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /// Define NAME of the Witcher
        System.out.println("Define your Witcher name ");
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        Wizzard NameWizzard = new Wizzard(Name,null);
        System.out.println("Hello ! " + NameWizzard.getName());


        /// Define WANd of the Witcher
        int NbWand;
        do {
            do {
                System.out.println("Give a number for your Wand into 1 and 9");
                NbWand = scanner.nextInt();
            } while(NbWand <= 1);
        } while(NbWand >= 9);

        //Core[] TypeWand = Core.values();

        System.out.println("What is your preference ? :\n" );
        for (Core core : Core.values()) {
            System.out.println((core.ordinal() + 1) + " - " + core.name());
        }

        System.out.print("Enter the number corresponding to the chosen CORE : ");
        Scanner Wand = new Scanner(System.in);
        int choix = Wand.nextInt();

        // Convertir le choix de l'utilisateur en une instance de l'énumération correspondante
        Core corechoix = Core.values()[choix-1];

        if (corechoix == Core.Phoenix_feather){
            String Core_Wand = "Phoenix Feather";
            Wand WizzardWand = new Wand(Core_Wand,NbWand);
            System.out.println("Information about your Wang : ELEMENT = " + WizzardWand.getCore_Wang() + " and LENGTH : " + WizzardWand.getNbWand());
        }
        else {
            String Core_Wand = "Dragon Heather";
            Wand WizzardWand = new Wand(Core_Wand,NbWand);
            System.out.println("Information about your Wang : ELEMENT = " + WizzardWand.getCore_Wang() + " and LENGTH : " + WizzardWand.getNbWand());

        }




        // Define House of Wizzard

            Scanner sc = new Scanner(System.in);
            int countA = 0;
            int countB = 0;
            int countC = 0;
            int countD = 0;
            System.out.println("Which house is your");

            String response;
            do {
                System.out.println("1. Which of the following options would you most like to study?\n A. Mermaids        B. Werewolves        C. Vampires        D. Goblins ");
                response = sc.nextLine();
                if (response.equals("A")) {
                    ++countA;
                } else if (response.equals("B")) {
                    ++countB;
                } else if (response.equals("C")) {
                    ++countC;
                } else {
                    ++countD;
                }
            } while(!response.equals("A") && !response.equals("B") && !response.equals("C") && !response.equals("D"));

            do {
                System.out.println("2. If given the choice, you would prefer to invent a potion that would guarantee :\n A. WISDOM        B. FAME        C. BRAVE        D. LOVE");
                response = sc.nextLine();
                if (response.equals("A")) {
                    ++countA;
                } else if (response.equals("B")) {
                    ++countB;
                } else if (response.equals("C")) {
                    ++countC;
                } else {
                    ++countD;
                }
            } while(!response.equals("A") && !response.equals("B") && !response.equals("C") && !response.equals("D"));

            do {
                System.out.println("3. Four cups are placed in front of you. Which one do you choose to drink from? :\nA. The thick, creamy, rich purple drink with a delicious smell of chocolate and plums.\nB. The mysterious black liquid that glows like ink and gives off fumes that make you see strange things.\nC. The frothy, foamy, silvery liquid that shines as if it contains ground diamonds.\nD. The golden liquid so bright it hurts the eye, and makes sunspots dance all over the room.");
                response = sc.nextLine();
                if (response.equals("A")) {
                    ++countA;
                } else if (response.equals("B")) {
                    ++countB;
                } else if (response.equals("C")) {
                    ++countC;
                } else {
                    ++countD;
                }
            } while(!response.equals("A") && !response.equals("B") && !response.equals("C") && !response.equals("D"));

            do {
                System.out.println("4. If you were at Hogwarts, what pet would you choose to take with you?\n A. Chat        B. Serpent        C. Chouette        D. Rat");
                response = sc.nextLine();
                if (response.equals("A")) {
                    ++countA;
                } else if (response.equals("B")) {
                    ++countB;
                } else if (response.equals("C")) {
                    ++countC;
                } else {
                    ++countD;
                }
            } while(!response.equals("A") && !response.equals("B") && !response.equals("C") && !response.equals("D"));

            do {
                System.out.println("5. Imagine you were faced with an insurmountable obstacle. How would you react?\n A. I would look for a solution using my logic and creativity        B. I would try to get around the obstacle using all the means at my disposal.         C. I would face the obstacle with courage and determination, seeking to overcome it.         D. I would seek help from my friends and community to find a solution.");
                response = sc.nextLine();
                if (response.equals("A")) {
                    ++countA;
                } else if (response.equals("B")) {
                    ++countB;
                } else if (response.equals("C")) {
                    ++countC;
                } else {
                    ++countD;
                }
            } while(!response.equals("A") && !response.equals("B") && !response.equals("C") && !response.equals("D"));

            if (countA > countB && countA > countC && countA > countD) {
                String House = "Ravenclaw";
                SortingHat HouseWizzard = new SortingHat(House);
                System.out.println("You belong to " +HouseWizzard.getHouse()+ " House\nNotable members include Luna Lovegood, Gilderoy Lockhart and Filius Flitwick.\n\n‘Or yet in wise old Ravenclaw\nIf you’ve a ready mind\nWhere those of wit and learning\nWill always find their kind.’\nHarry Potter and the Philosopher’s Stone");

            } else if (countB > countA && countB > countC && countB > countD) {
                String House = "Slytherin";
                SortingHat HouseWizzard = new SortingHat(House);
                System.out.println("You belong to " +HouseWizzard.getHouse()+ " House\nNotable members include Severus Snape, Draco Malfoy and (rather unfortunately) Lord Voldemort.\n\n‘Or perhaps in Slytherin\nYou’ll make your real friends\nThose cunning folk use any means\nTo achieve their ends.’\nHarry Potter and the Philosopher’s Stone");
            } else if (countC > countA && countC > countB && countC > countD) {
                String House = "Gryffindor";
                SortingHat HouseWizzard = new SortingHat(House);
                System.out.println("You belong to " +HouseWizzard.getHouse()+ " House\nNotable members include (of course) Harry Potter, Hermione Granger and Ron Weasley.\n\n‘You might belong in Gryffindor,\nWhere dwell the brave at heart,\nTheir daring, nerve and chivalry\nSet Gryffindors apart.’\nHarry Potter and the Philosopher’s Stone");
            } else {
                String House = "Hufflepuff";
                SortingHat HouseWizzard = new SortingHat(House);
                System.out.println("You belong to " +HouseWizzard.getHouse()+ " House\nNotable members include Newt Scamander, Cedric Diggory and Nymphadora Tonks.\n\n‘You might belong in Hufflepuff\nWhere they are just and loyal\nThose patient Hufflepuffs are true\nAnd unafraid of toil.’\nHarry Potter and the Philosopher’s Stone <3");
            }

            /// Pet
        System.out.println("Please choose an animal : ");
            for (Pet pet : Pet.values()) {
                System.out.println((pet.ordinal() + 1) + " - " + pet.name());
            }
        Scanner scP = new Scanner(System.in);
        System.out.print("Enter the number corresponding to the chosen animal : ");
        int choixPet = scanner.nextInt();

        Pet petchoix =  Pet.values()[choixPet - 1];

        if (petchoix == Pet.cat){
            String Pet = "Cat";
            Wizzard WizzardPet = new Wizzard(Name,Pet);
            System.out.println("The chosen animal " + WizzardPet.getPet());
        }
        else if (petchoix==Pet.Owl) {
            String Pet = "Owl";
            Wizzard WizzardPet = new Wizzard(Name,Pet);
            System.out.println("The chosen animal " + WizzardPet.getPet());
        }
        else if (petchoix==Pet.Rat) {
            String Pet = "Rat";
            Wizzard WizzardPet = new Wizzard(Name,Pet);
            System.out.println("The chosen animal " + WizzardPet.getPet());
        }
        else if (petchoix==Pet.Toad) {
            String Pet = "Toad";
            Wizzard WizzardPet = new Wizzard(Name,Pet);
            System.out.println("The chosen animal " + WizzardPet.getPet());
        }

            /// Sort

            /// Potion
    }
}



