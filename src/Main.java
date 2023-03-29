import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        String House = null;
        String Core_Wand = null;
        int NbWand = 0;
        /// Define NAME of the Witcher
        System.out.println("Define your Witcher name ");
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        Wizzard Wizzard = new Wizzard(100, 10, Name, null, House, Core_Wand, NbWand);
        System.out.println("Hello ! " + Wizzard.getName());


        /// Define WANd of the Witcher
        do {
            do {
                System.out.println("Give a number for your Wand into 1 and 9");
                NbWand = scanner.nextInt();
            } while (NbWand <= 1);
        } while (NbWand >= 9);

        //Core[] TypeWand = Core.values();
        //Core core = Core.Core;
        System.out.println("What is your preference ? :\n");
        for (Core core : Core.values()) {
            System.out.println((core.ordinal() + 1) + " - " + core.name());
        }

        System.out.print("Enter the number corresponding to the chosen CORE : ");
        Scanner Wand = new Scanner(System.in);
        int choix = Wand.nextInt();

        // Convertir le choix de l'utilisateur en une instance de l'énumération correspondante
        Core corechoix = Core.values()[choix - 1];

        if (corechoix == Core.Phoenix_feather) {
            Core_Wand = "Phoenix Feather";
            Wand WizzardWand = new Wand(Core_Wand, NbWand);
            System.out.println("Information about your Wang : ELEMENT = " + WizzardWand.getCore_Wang() + " and LENGTH : " + WizzardWand.getNbWand());
        } else {
            Core_Wand = "Dragon Heather";
            Wand WizzardWand = new Wand(Core_Wand, NbWand);
            System.out.println("Information about your Wang : ELEMENT = " + WizzardWand.getCore_Wang() + " and LENGTH : " + WizzardWand.getNbWand());
            //Wizzard = Wizzard(Name, Pet, House, Core_Wand, NbWand);
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
        } while (!response.equals("A") && !response.equals("B") && !response.equals("C") && !response.equals("D"));

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
        } while (!response.equals("A") && !response.equals("B") && !response.equals("C") && !response.equals("D"));

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
        } while (!response.equals("A") && !response.equals("B") && !response.equals("C") && !response.equals("D"));

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
        } while (!response.equals("A") && !response.equals("B") && !response.equals("C") && !response.equals("D"));

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
        } while (!response.equals("A") && !response.equals("B") && !response.equals("C") && !response.equals("D"));

        if (countA > countB && countA > countC && countA > countD) {
            House = "Ravenclaw";
            SortingHat HouseWizzard = new SortingHat(House,1.5f, 1, 1,1 );
            System.out.println("You belong to " + HouseWizzard.getHouse() + " House\nNotable members include Luna Lovegood, Gilderoy Lockhart and Filius Flitwick.\n\n‘Or yet in wise old Ravenclaw\nIf you’ve a ready mind\nWhere those of wit and learning\nWill always find their kind.’\nHarry Potter and the Philosopher’s Stone");
            //Wizzard = Wizzard(Name, null, House, Core_Wand, NbWand);
        } else if (countB > countA && countB > countC && countB > countD) {
            House = "Slytherin";
            SortingHat HouseWizzard = new SortingHat(House, 1,1.5f,1,1);
            System.out.println("You belong to " + HouseWizzard.getHouse() + " House\nNotable members include Severus Snape, Draco Malfoy and (rather unfortunately) Lord Voldemort.\n\n‘Or perhaps in Slytherin\nYou’ll make your real friends\nThose cunning folk use any means\nTo achieve their ends.’\nHarry Potter and the Philosopher’s Stone");
            //Wizzard = Wizzard(Name, null, House, Core_Wand, NbWand);
        } else if (countC > countA && countC > countB && countC > countD) {
            House = "Gryffindor";
            SortingHat HouseWizzard = new SortingHat(House ,1,1,1.5f,1);
            System.out.println("You belong to " + HouseWizzard.getHouse() + " House\nNotable members include (of course) Harry Potter, Hermione Granger and Ron Weasley.\n\n‘You might belong in Gryffindor,\nWhere dwell the brave at heart,\nTheir daring, nerve and chivalry\nSet Gryffindors apart.’\nHarry Potter and the Philosopher’s Stone");
            //Wizzard = Wizzard(Name, null, House, Core_Wand, NbWand);
        } else {
            House = "Hufflepuff";
            SortingHat HouseWizzard = new SortingHat(House,1,1,1,1.5f);
            System.out.println("You belong to " + HouseWizzard.getHouse() + " House\nNotable members include Newt Scamander, Cedric Diggory and Nymphadora Tonks.\n\n‘You might belong in Hufflepuff\nWhere they are just and loyal\nThose patient Hufflepuffs are true\nAnd unafraid of toil.’\nHarry Potter and the Philosopher’s Stone <3");
            //Wizzard = Wizzard(Name, null, House, Core_Wand, NbWand);
        }

        /// Pet
        System.out.println("Please choose an animal : ");
        for (Pet pet : Pet.values()) {
            System.out.println((pet.ordinal() + 1) + " - " + pet.name());
        }
        Scanner scP = new Scanner(System.in);
        System.out.print("Enter the number corresponding to the chosen animal : ");
        int choixPet = scanner.nextInt();

        Pet petchoix = Pet.values()[choixPet - 1];

        if (petchoix == Pet.cat) {
            String Pet = "Cat";
            Wizzard = new Wizzard(100, 10, Name, Pet, House, Core_Wand, NbWand);
            System.out.println("The chosen animal " + Wizzard.getPet());
        } else if (petchoix == Pet.Owl) {
            String Pet = "Owl";
            Wizzard = new Wizzard(100, 10, Name, Pet, House, Core_Wand, NbWand);
            System.out.println("The chosen animal " + Wizzard.getPet());
        } else if (petchoix == Pet.Rat) {
            String Pet = "Rat";
            Wizzard = new Wizzard(100, 10, Name, Pet, House, Core_Wand, NbWand);
            System.out.println("The chosen animal " + Wizzard.getPet());
        } else if (petchoix == Pet.Toad) {
            String Pet = "Toad";
            Wizzard = new Wizzard(100, 10, Name, Pet, House, Core_Wand, NbWand);
            System.out.println("The chosen animal " + Wizzard.getPet());
        }

        System.out.println(Wizzard);
        Main.checkAct();
        Main.getcheckAct();
        Main.Chap1();


        /// Spell

        /// Potion

        //story.printIntro --> Permet de mettre le texte ecrit dans la classe story
    }

    public static int place = 0, act = 1;
    public static String[] places = {"The Philosopher's Stone", "The Chamber of Secrets", "The Prisoner of Azkaban", "The Goblet of Fire", "The Order of the Phenix", "The half-blood Prince", "The Deathly Hallows"};

    public static void checkAct() {
        if (Wizzard.xp <= 10 && act == 1) {
            act = 2;
            place = 0;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
        } else if (Wizzard.xp >= 20 && act == 2) {
            act = 3;
            place = 1;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
        } else if (Wizzard.xp >= 30 && act == 3) {
            act = 4;
            place = 2;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
        } else if (Wizzard.xp >= 40 && act == 4) {
            act = 5;
            place = 3;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
        } else if (Wizzard.xp >= 50 && act == 5) {
            act = 6;
            place = 4;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
        } else if (Wizzard.xp >= 60 && act == 6) {
            act = 7;
            place = 5;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
        } else if (Wizzard.xp >= 70 && act == 7) {
            act = 7;
            place = 6;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
        } else if (Wizzard.xp >= 80 && act == 8) {
            act = 8;
            place = 7;
            System.out.println("-------------------------------------");
            System.out.println(places[place]);
            System.out.println("-------------------------------------");
        }
    }

    public static int getcheckAct() {
        return act;
    }

    public static void Combat() {
        int round = 0;
        do {
            round = round + 1;
            System.out.println("-------------------------------------");
            System.out.println("ROUND" + round);
            System.out.println("-------------------------------------");
            Random rand = new Random();
            int precisionWizzard;
            int precisionEnemy;
            if (Wizzard.House.equals("Ravenclaw")){
                int min = 25;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min +1)+min;
                precisionEnemy = rand.nextInt(max - min +1)+min;
            } else {
                int min = 0;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min +1)+min;
                precisionEnemy = rand.nextInt(max - min +1)+min;
            }
            if (precisionWizzard > precisionEnemy) {
                System.out.println("You got your attack !! : " +precisionWizzard+ "%");
                System.out.println(Wizzard.getName() + " What do you want to use ? \n spell : attack ? \n potion : defend ? \n spell learn : Wingardium Leviosa ?");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                if (choose.equals("Wingardium Leviosa")) {
                    Wizzard.WingardiumLeviosa();
                    System.out.println(" Vous avez infligez " + Enemy.getMaxhp() + " au Troll, il vous reste " + Wizzard.maxhp);
                } else if (choose.equals("potion")) {
                    if (Wizzard.maxhp == 100) {
                        System.out.println(" You can't use potion you have " + Wizzard.getMaxhp());
                        Enemy.attack();
                        System.out.println("Enemy vous a attaquez, il vous reste " + Wizzard.maxhp);
                    } else {
                        Wizzard.potion();
                        System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp());
                    }
                } else {
                    Wizzard.spell();
                    System.out.println(" Vous avez infligez " + Enemy.getMaxhp() + " au Troll, il vous reste " + Wizzard.maxhp);
                }
            } else if (precisionEnemy > precisionWizzard) {
                System.out.println("It's the tour of your Enemy...");
                Enemy.attack();
                System.out.println("Enemy vous a attaquez, il vous reste " + Wizzard.maxhp);
            } else {
                System.out.println("Your Enemy have an advantage");
                Enemy.attack();
                System.out.println("Enemy vous a attaquez, il vous reste " + Wizzard.maxhp);
            }

        } while (Enemy.Alive() && Wizzard.Alive());
    }

    public static void Chap1() {
        checkAct();
        Spell.AddSpell();
        Enemy Troll = new Enemy("Troll", 100, 50);
        Combat();
        if (Enemy.Alive()) {
            System.out.println("Vous avez perdu ! Voulez vous recommencez ?");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response == "yes") {
                Chap1();
            } else {
                System.out.println("A bientot");
            }
        } else if (Wizzard.Alive()){
            Wizzard.setXp(20);
            Wizzard.setMaxhp(100);
            System.out.println("Congrat you have win ! let's go to the 2nd years of Hogwarts, But first, here is your reward : "  );
            Chap2();
        }
    }

    public static void Combat2G(){
        int round = 0;
        do {
            round = round + 1;
            System.out.println("-------------------------------------");
            System.out.println("ROUND" + round);
            System.out.println("-------------------------------------");
            // PRECISION OF ENEMY AND WIZZARD (DISTRIBUTION OF ROUND)
            Random rand = new Random();
            int precisionWizzard;
            int precisionEnemy;
            if (Wizzard.House.equals("Ravenclaw")){
                int min = 25;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min +1)+min;
                precisionEnemy = rand.nextInt(max - min +1)+min;
            } else {
                int min = 0;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min +1)+min;
                precisionEnemy = rand.nextInt(max - min +1)+min;
            }
            /////////////////////////////////////////////////////////////////////
            if (precisionWizzard > precisionEnemy) {
                System.out.println("You got your attack !! : " +precisionWizzard+ "%");
                System.out.println(Wizzard.getName() + " What do you want to use ? \n spell : attack ? \n potion : defend ? \n items : Gryffondor Sword (50) ?");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                if (choose.equals("Gryffondor Sword")) {
                    Wizzard.GryffindorSword();
                    System.out.println(" Vous avez infligez " + Enemy.getMaxhp() + " au " +Enemy.getName()+" il vous reste " + Wizzard.maxhp);
                } else if (choose.equals("potion")) {
                    if (Wizzard.maxhp == 100) {
                        System.out.println(" You can't use potion you have " + Wizzard.getMaxhp());
                        Enemy.attack();
                        System.out.println("Enemy vous a attaquez, il vous reste " + Wizzard.maxhp);
                    } else {
                        Wizzard.potion();
                        System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp()+ "Your enemy have : " +Enemy.getMaxhp());
                    }
                } else {
                    Wizzard.spell();
                    System.out.println(" Vous avez infligez " + Enemy.getMaxhp() + " au "+Enemy.getName()+", il vous reste " + Wizzard.maxhp);
                }
            } else if (precisionEnemy > precisionWizzard) {
                System.out.println("It's the tour of your Enemy...");
                Enemy.attack();
                System.out.println("Enemy vous a attaquez, il vous reste " + Wizzard.maxhp);
            } else {
                System.out.println("Your Enemy have an advantage");
                Random randEne = new Random();
                int min = 1;
                int max = 2;
                int chooseEnemy = randEne.nextInt(max - min +1)+min;
                if (chooseEnemy==1){
                    Enemy.setMaxhp(Enemy.getMaxhp()+5);
                    System.out.println("Enemy choose health : " +Enemy.getMaxhp());
                } else {
                    Enemy.attack();
                    System.out.println("Enemy has attacked you, you are left " + Wizzard.maxhp);
                }
            }
        } while (Enemy.Alive() && Wizzard.Alive());
    }
    public static void Combat2(){
        int round = 0;
        do {
            round = round + 1;
            System.out.println("-------------------------------------");
            System.out.println("ROUND" + round);
            System.out.println("-------------------------------------");
            // PRECISION OF ENEMY AND WIZZARD (DISTRIBUTION OF ROUND)
            Random rand = new Random();
            int precisionWizzard;
            int precisionEnemy;
            if (Wizzard.House.equals("Ravenclaw")){
                int min = 25;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min +1)+min;
                precisionEnemy = rand.nextInt(max - min +1)+min;
            } else {
                int min = 0;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min +1)+min;
                precisionEnemy = rand.nextInt(max - min +1)+min;
            }
            /////////////////////////////////////////////////////////////////////
            if (precisionWizzard > precisionEnemy) {
                System.out.println("You got your attack !! : " +precisionWizzard+ "%");
                System.out.println(Wizzard.getName() + " What do you want to use ? \n spell : attack ? \n potion : defend ? \n new spell : Acio (35) ?");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                if (choose.equals("Acio")) {
                    Wizzard.Acio();
                    System.out.println(" Vous avez infligez " + Enemy.getMaxhp() + " au " +Enemy.getName()+" il vous reste " + Wizzard.maxhp);
                } else if (choose.equals("potion")) {
                    if (Wizzard.maxhp == 100) {
                        System.out.println(" You can't use potion you have " + Wizzard.getMaxhp());
                        Enemy.attack();
                        System.out.println("Enemy vous a attaquez, il vous reste " + Wizzard.maxhp);
                    } else {
                        Wizzard.potion();
                        System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp()+ "Your enemy have : " +Enemy.getMaxhp());
                    }
                } else {
                    Wizzard.spell();
                    System.out.println(" Vous avez infligez " + Enemy.getMaxhp() + " au "+Enemy.getName()+", il vous reste " + Wizzard.maxhp);
                }
            } else if (precisionEnemy > precisionWizzard) {
                System.out.println("It's the tour of your Enemy...");
                Enemy.attack();
                System.out.println("Enemy vous a attaquez, il vous reste " + Wizzard.maxhp);
            } else {
                System.out.println("Your Enemy have an advantage");
                Random randEne = new Random();
                int min = 1;
                int max = 2;
                int chooseEnemy = randEne.nextInt(max - min +1)+min;
                if (chooseEnemy==1){
                    Enemy.setMaxhp(Enemy.getMaxhp()+5);
                    System.out.println("Enemy choose health : " +Enemy.getMaxhp());
                } else {
                    Enemy.attack();
                    System.out.println("Enemy has attacked you, you are left " + Wizzard.maxhp);
                }
            }
        } while (Enemy.Alive() && Wizzard.Alive());
    }

    public static void Chap2(){
        checkAct();
        Spell.AddSpell();
        Enemy Basilic = new Enemy("Basilic", 110, 50);
        if (Wizzard.House.equals("Gryffondor")) {
            Combat2G();
        } else {
            Combat();
        }
        if (Enemy.Alive()) {
            System.out.println("Vous avez perdu ! Voulez vous recommencez ?");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response == "yes") {
                if (Wizzard.House.equals("Gryffondor")) {
                    Combat2G();
                } else {
                    Combat();
                }
            } else {
                System.out.println("A bientot");
            }
        } else if (Wizzard.Alive()){
            Wizzard.setXp(30);
            Wizzard.setMaxhp(100);
            System.out.println("Congrat you have win ! let's go to the 2nd years of Hogwarts, But first, here is your reward : "  );
            Chap3();
        }
    }
    public static void Chap3(){
        System.out.println("Building...");
    }

}


