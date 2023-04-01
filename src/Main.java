import java.util.Arrays;
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
            SortingHat HouseWizzard = new SortingHat(House, 1.5f, 1, 1, 1);
            System.out.println("You belong to " + HouseWizzard.getHouse() + " House\nNotable members include Luna Lovegood, Gilderoy Lockhart and Filius Flitwick.\n\n‘Or yet in wise old Ravenclaw\nIf you’ve a ready mind\nWhere those of wit and learning\nWill always find their kind.’\nHarry Potter and the Philosopher’s Stone");
            //Wizzard = Wizzard(Name, null, House, Core_Wand, NbWand);
        } else if (countB > countA && countB > countC && countB > countD) {
            House = "Slytherin";
            SortingHat HouseWizzard = new SortingHat(House, 1, 1.5f, 1, 1);
            System.out.println("You belong to " + HouseWizzard.getHouse() + " House\nNotable members include Severus Snape, Draco Malfoy and (rather unfortunately) Lord Voldemort.\n\n‘Or perhaps in Slytherin\nYou’ll make your real friends\nThose cunning folk use any means\nTo achieve their ends.’\nHarry Potter and the Philosopher’s Stone");
            //Wizzard = Wizzard(Name, null, House, Core_Wand, NbWand);
        } else if (countC > countA && countC > countB && countC > countD) {
            House = "Gryffindor";
            SortingHat HouseWizzard = new SortingHat(House, 1, 1, 1.5f, 1);
            System.out.println("You belong to " + HouseWizzard.getHouse() + " House\nNotable members include (of course) Harry Potter, Hermione Granger and Ron Weasley.\n\n‘You might belong in Gryffindor,\nWhere dwell the brave at heart,\nTheir daring, nerve and chivalry\nSet Gryffindors apart.’\nHarry Potter and the Philosopher’s Stone");
            //Wizzard = Wizzard(Name, null, House, Core_Wand, NbWand);
        } else {
            House = "Hufflepuff";
            SortingHat HouseWizzard = new SortingHat(House, 1, 1, 1, 1.5f);
            System.out.println("You belong to " + HouseWizzard.getHouse() + " House\nNotable members include Newt Scamander, Cedric Diggory and Nymphadora Tonks.\n\n‘You might belong in Hufflepuff\nWhere they are just and loyal\nThose patient Hufflepuffs are true\nAnd unafraid of toil.’\nHarry Potter and the Philosopher’s Stone <3");
            //Wizzard = Wizzard(Name, null, House, Core_Wand, NbWand);
        }

        /// Pet
        int choixPet;
        do {
            System.out.println("Please choose an animal : ");
            for (Pet pet : Pet.values()) {
                System.out.println((pet.ordinal() + 1) + " - " + pet.name());
            }
            Scanner scP = new Scanner(System.in);
            System.out.print("Enter the number corresponding to the chosen animal : ");
            choixPet = scanner.nextInt();

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
        } while (choixPet <= 0 || choixPet > 4);
        System.out.println(Wizzard);
        Main.Chap1();
    }
    public static void Combat() {
        int round = 0;
        Enemy Troll = new Enemy("Troll", 100, 50);
        do {
            round = round + 1;
            System.out.println("-------------------------------------");
            System.out.println("ROUND" + round);
            System.out.println("-------------------------------------");
            Random rand = new Random();
            int precisionWizzard;
            int precisionEnemy;
            if (Wizzard.House.equals("Ravenclaw")) {
                int min = 25;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min + 1) + min;
                precisionEnemy = rand.nextInt(max - min + 1) + min;
            } else {
                int min = 0;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min + 1) + min;
                precisionEnemy = rand.nextInt(max - min + 1) + min;
            }
            if (precisionWizzard > precisionEnemy) {
                System.out.println("You got your attack !! : " + precisionWizzard + "%");
                System.out.println(Wizzard.getName() + " What do you want to use (choose number) ? \n 1 - spell \n 2 - potion \n 3 - Wingardium Leviosa(30) ?");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                if (choose.equals("3")) {
                    Wizzard.WingardiumLeviosa();
                    System.out.println(" The number of hp you have left for your opponent is " + Enemy.maxhp + " hp, the remaining hp is " + Wizzard.maxhp);
                } else if (choose.equals("2")) {
                    Wizzard.potion(10);
                    System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp());
                } else {
                    Wizzard.spell(10);
                    System.out.println(" the number of hp you have left for your opponent is " + Enemy.maxhp + " hp, the remaining hp is " + Wizzard.maxhp);
                }
            } else if (precisionEnemy > precisionWizzard) {
                System.out.println("It's the tour of your Enemy...");
                Enemy.attack();
                Wizzard.setMaxhp(Wizzard.getMaxhp());
                System.out.println("Enemy has attacked you, you are left " + Wizzard.maxhp);
            } else {
                System.out.println("Your Enemy have an advantage");
                Enemy.attack();
                Wizzard.setMaxhp(Wizzard.getMaxhp());
                System.out.println("Enemy has attacked you, you are left " + Wizzard.maxhp);
            }

        } while (Enemy.Alive() && Wizzard.Alive());
    }

    public static void Chap1() {
        Spell.AddSpell();
        Combat();
        if (Enemy.Alive()) {
            System.out.println("GAME OVER ! Do you want to continue ? y or n");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equals("y")) {
                Main.Chap1();
                Wizzard.setMaxhp(100);
            } else {
                        System.out.println("-------------------------------------");
                        System.out.println("To a balanced mind, death is just one more great adventure.");
                        System.out.println("-------------------------------------");
            }
        } else if (Wizzard.Alive()) {
            Wizzard.setXp(20);
            Wizzard.setMaxhp(100);
            System.out.println("Congrat you have win ! let's go to the 2nd years of Hogwarts, But first, here is your reward : 20xp + 100hp ");
            Main.Chap2();
        }
    }

    public static void Combat2G() {
        Enemy Basilic = new Enemy("Basilic", 110, 50);
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
            if (Wizzard.House.equals("Ravenclaw")) {
                int min = 25;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min + 1) + min;
                precisionEnemy = rand.nextInt(max - min + 1) + min;
            } else {
                int min = 0;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min + 1) + min;
                precisionEnemy = rand.nextInt(max - min + 1) + min;
            }
            /////////////////////////////////////////////////////////////////////
            if (precisionWizzard > precisionEnemy) {
                System.out.println("You got your attack !! : " + precisionWizzard + "%");
                System.out.println(Wizzard.getName() + " What do you want to use (choose number) ? \n 1 - spell \n 2 - potion \n 3 - items : Gryffondor Sword (50) ?");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                if (choose.equals("3")) {
                    Wizzard.GryffindorSword();
                    System.out.println(" The number of hp you have left for " + Enemy.getName() + " is " + Enemy.getMaxhp() + " hp, the remaining hp is " + Wizzard.maxhp);
                } else if (choose.equals("2")) {
                    Wizzard.potion(10);
                    System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp() + "Your enemy have : " + Enemy.getMaxhp());
                } else {
                    Wizzard.spell(10);
                    System.out.println(" The number of hp you have left for " + Enemy.getName() + " is " + Enemy.getMaxhp() + " hp, the remaining hp is " + Wizzard.maxhp);
                }
            } else if (precisionEnemy > precisionWizzard) {
                System.out.println("It's the tour of your Enemy...");
                Enemy.attack();
                System.out.println("Enemy has attacked you, you are left " + Wizzard.maxhp);
            } else {
                System.out.println("Your Enemy have an advantage");
                Random randEne = new Random();
                int min = 1;
                int max = 2;
                int chooseEnemy = randEne.nextInt(max - min + 1) + min;
                if (chooseEnemy == 1) {
                    Enemy.setMaxhp(Enemy.getMaxhp() + 5);
                    System.out.println("Enemy choose health : " + Enemy.getMaxhp());
                } else {
                    Enemy.attack();
                    System.out.println("Enemy has attacked you, you are left " + Wizzard.maxhp);
                }
            }
        } while (Enemy.Alive() && Wizzard.Alive());
    }

    public static void Combat2() {
        Enemy Basilic = new Enemy("Basilic", 110, 50);
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
            if (Wizzard.House.equals("Ravenclaw")) {
                int min = 25;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min + 1) + min;
                precisionEnemy = rand.nextInt(max - min + 1) + min;
            } else {
                int min = 0;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min + 1) + min;
                precisionEnemy = rand.nextInt(max - min + 1) + min;
            }
            /////////////////////////////////////////////////////////////////////
            if (precisionWizzard > precisionEnemy) {
                System.out.println("You got your attack !! : " + precisionWizzard + "%");
                System.out.println(Wizzard.getName() + " What do you want to use (choose number) ? \n 1 - spell \n 2 - potion  \n 3 - Acio (35) ?");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                if (choose.equals("3")) {
                    Wizzard.Acio();
                    System.out.println(" The number of hp you have left for " +Enemy.getName()  + " is " + Enemy.getMaxhp() + " hp, the remaining hp is " + Wizzard.maxhp);
                } else if (choose.equals("2")) {
                    Wizzard.potion(10);
                    System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp() + "Your enemy have : " + Enemy.getMaxhp());
                } else {
                    Wizzard.spell(10);
                    System.out.println(" The number of hp you have left for " + Enemy.getName() + " is " + Enemy.getMaxhp() + " hp, the remaining hp is " + Wizzard.maxhp);
                }
            } else if (precisionEnemy > precisionWizzard) {
                System.out.println("It's the tour of your Enemy...");
                Enemy.attack();
                System.out.println("Enemy has attacked you, you are left " + Wizzard.maxhp);
            } else {
                System.out.println("Your Enemy have an advantage");
                Random randEne = new Random();
                int min = 1;
                int max = 2;
                int chooseEnemy = randEne.nextInt(max - min + 1) + min;
                if (chooseEnemy == 1) {
                    Enemy.setMaxhp(Enemy.getMaxhp() + 5);
                    System.out.println("Enemy choose health : " + Enemy.getMaxhp());
                } else {
                    Enemy.attack();
                    System.out.println("Enemy has attacked you, you are left " + Wizzard.maxhp);
                }
            }
        } while (Enemy.Alive() && Wizzard.Alive());
    }

    public static void Chap2() {
        Spell.AddSpell();
        if (Wizzard.House.equals("Gryffindor")) {
            Main.Combat2G();
        } else {
            Main.Combat2();
        }
        if (Enemy.Alive()) {
            System.out.println("GAME OVER ! Do you want to continue ? y or n");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equals("y")) {
                if (Wizzard.House.equals("Gryffindor")) {
                    Combat2G();
                    Wizzard.setMaxhp(100);
                } else {
                    Combat2();
                    Wizzard.setMaxhp(100);
                }
            } else {
                        System.out.println("-------------------------------------");
                        System.out.println("To a balanced mind, death is just one more great adventure.");
                        System.out.println("-------------------------------------");
            }
        } else if (Wizzard.Alive()) {
            Wizzard.setXp(30);
            Wizzard.setMaxhp(100);
            System.out.println("Congrat you have win ! let's go to the 3nd years of Hogwarts, But first, here is your reward : 30xp + 100hp ");
            Main.Chap3();
        }
    }

    public static void Combat3() {
        String[] mystspell = {"E", "X", "P", "E", "C", "T", "O", "PA", "TR", "ON", "US"};
        int round = 0;
        int n = -1;
        Enemy Detracker1 = new Enemy("Detracker1", 110, 50);
        Enemy Detracker2 = new Enemy("Detracker2", 110, 50);
        do {
            round = round + 1;
            System.out.println("-------------------------------------");
            System.out.println("ROUND" + round);
            System.out.println("-------------------------------------");
            // PRECISION OF ENEMY AND WIZZARD (DISTRIBUTION OF ROUND)
            Random rand = new Random();
            System.out.println("Maxhp of Detracker1 : " + Detracker1.getMaxhp());
            System.out.println("Maxhp of Detracker2 : " + Detracker2.getMaxhp());
            System.out.println("Your maxhp value : " + Wizzard.getMaxhp());
            int precisionWizzard;
            int precisionEnemy1 = 0;
            int precisionEnemy2 = 0;
            if (Wizzard.House.equals("Ravenclaw")) {
                int min = 25;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min + 1) + min;

            } else {
                int min = 0;
                int max = 100;
                precisionWizzard = rand.nextInt(120 - 0 + 1) + 0;
                precisionEnemy1 = rand.nextInt(max - min + 1) + min;
                precisionEnemy2 = rand.nextInt(max - min + 1) + min;

            }
            /////////////////////////////////////////////////////////////////////
            if (precisionWizzard > precisionEnemy1 && precisionWizzard > precisionEnemy2) {
                System.out.println("You got your attack !! : " + precisionWizzard + "%");
                n++;
                System.out.println("You have one letter of the spell : " + mystspell[n]);
                System.out.println(" which enemy wanted to attack ? \n  1 - Enemy1 \n 2- Enemy2 ");
                Scanner chooseWiz = new Scanner(System.in);
                String chooseWizzard = chooseWiz.nextLine();

                if (chooseWizzard.equals("1")) {
                    System.out.println(" You want to attack 1st Detracker ! ");
                    System.out.println(Wizzard.getName() + " What do you want to use(choose number) ? \n 1 - spell \n 2 - potion  \n 3 - new spell : find this one... (60) ?");
                    Scanner scanner = new Scanner(System.in);
                    String choose = scanner.nextLine();
                    if (choose.equals("Expecto Patronus")) {
                        Wizzard.ExpectoPatronus();
                        System.out.println(" The number of hp you have left for " +Detracker1.getName()  + " is " + Detracker1.getMaxhp() + " hp, the remaining hp is " + Wizzard.maxhp);
                    } else if (choose.equals("2")) {
                        Wizzard.potion(10);
                        System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp() + "Your enemy have : " + Detracker1.getMaxhp());
                    } else {
                        Wizzard.spell(10);
                        System.out.println(" The number of hp you have left for " +Detracker1.getName()  + " is " + Detracker1.getMaxhp() + " hp, the remaining hp is " + Wizzard.maxhp);
                    }
                } else if (chooseWizzard.equals("2")) {
                    System.out.println(" You want to attack 2st Detracker ! ");
                    System.out.println(Wizzard.getName() + " What do you want to use(choose number) ? \n 1 - spell \n 2 - potion  \n 3 - new spell : S….. (35) ?");
                    Scanner scanner = new Scanner(System.in);
                    String choose = scanner.nextLine();
                    if (choose.equals("Expecto Patronus")) {
                        Wizzard.ExpectoPatronus();
                        System.out.println(" The number of hp you have left for " + Detracker2.getName() + " is " + Detracker2.getMaxhp() + " hp, the remaining hp is " + Wizzard.maxhp);
                    } else if (choose.equals("2")) {
                        Wizzard.potion(10);
                        System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp() + "Your enemy have : " + Detracker2.getMaxhp());
                    } else {
                        Wizzard.spell(10);
                        System.out.println(" The number of hp you have left for " + Detracker2.getName() + " is " + Detracker2.getMaxhp() + ", hp, the remaining hp is " + Wizzard.maxhp);
                    }
                }
            } else if (precisionEnemy1 > precisionWizzard && precisionEnemy1 > precisionEnemy2) {
                System.out.println("It's the tour of Detrackeur1...");
                Detracker1.attack();
                System.out.println(Detracker1.getName() + " has attacked you, you are left " + Wizzard.maxhp);
            } else if (precisionEnemy2 > precisionWizzard && precisionEnemy2 > precisionEnemy1) {
                System.out.println("It's the tour of your Detrackeur2...");
                Detracker2.attack();
                System.out.println(Detracker2.getName() + " has attacked you, you are left " + Wizzard.maxhp);
            } else {
                System.out.println("Your Enemy have an advantage");
                Random randEne = new Random();
                int min = 1;
                int max = 2;
                int chooseEnemy = randEne.nextInt(max - min + 1) + min;
                if (chooseEnemy == 1) {
                    Detracker1.setMaxhp(Detracker1.getMaxhp() + 5);
                    System.out.println("Detrackeur1 choose health : " + Detracker1.getMaxhp());
                } else {
                    Detracker2.attack();
                    System.out.println("Detrackeur2 : " + Detracker2.maxHp + " has attacked you, you are left " + Wizzard.maxhp);
                }
            }
        } while (Enemy.Alive() && Wizzard.Alive());
    }

    public static void Chap3() {
        Spell.AddSpell();
        Combat3();
        if (Enemy.Alive()) {
            System.out.println("GAME OVER ! Do you want to continue ? y or n y or n");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equals("y")) {
                Main.Chap3();
                Wizzard.setMaxhp(100);
            } else {
                        System.out.println("-------------------------------------");
                        System.out.println("To a balanced mind, death is just one more great adventure.");
                        System.out.println("-------------------------------------");
            }
        } else if (Wizzard.Alive()) {
            Wizzard.setXp(40);
            Wizzard.setMaxhp(100);
            System.out.println("Congrat you have win ! let's go to the 4nd years of Hogwarts, But first, here is your reward : 40xp + 100hp ");
            Main.Chap4();
        }
    }

    public static void Chap4() {
        Spell.AddSpell();
        Combat4();
        if (Wizzard.Alive()) {
            Wizzard.setXp(50);
            Wizzard.setMaxhp(100);
            System.out.println("Congrat you have win ! let's go to the 5nd years of Hogwarts, But first, here is your reward : 50xp + 100hp ");
            Main.Chap5();
        } else if (Boss.Alive()) {
            System.out.println("GAME OVER ! Do you want to continue ? y or n");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equals("y")) {
                Main.Chap4();
            } else {
                System.out.println("-------------------------------------");
                System.out.println("To a balanced mind, death is just one more great adventure.");
                System.out.println("-------------------------------------");
            }
        }
    }

    public static void Combat4(){
        Enemy Peter = new Enemy("Peter Pettigrow", 110, 50);
        Boss Voldemort = new Boss("Voldemort", 200,50);
        int round = 0;
        int porket=100;
        do {
            round = round + 1;
            System.out.println("-------------------------------------");
            System.out.println("ROUND" + round);
            System.out.println("-------------------------------------");
            // PRECISION OF ENEMY AND WIZZARD (DISTRIBUTION OF ROUND)
            Random rand = new Random();
            int precisionWizzard;
            int precisionEnemy;
            if (Wizzard.House.equals("Ravenclaw")) {
                int min = 25;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min + 1) + min;
                precisionEnemy = rand.nextInt(max - min + 1) + min;
            } else {
                int min = 0;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min + 1) + min;
                precisionEnemy = rand.nextInt(max - min + 1) + min;
            }
            /////////////////////////////////////////////////////////////////////
            if (precisionWizzard > precisionEnemy) {
                System.out.println("You have not been found of Voldemort and Peter, try to find Portkey ");
                System.out.println(Wizzard.getName() + " Use ? \n 1 - Acio \n 2 - Potion ?");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                if (choose.equals("1")) {
                    int find = porket -25;
                    porket = find;
                    if (find==0){
                        Boss.setMaxhp(Boss.getMaxhp()-200);
                        System.out.println("The Porket is find you can RUN..........");
                    } else {
                        System.out.println("You are " +find+ "% close to Porket, be careful");
                    }
                } else if (choose.equals("2")) {
                    Wizzard.potion(10);
                    System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp());}
            } else if (precisionEnemy > precisionWizzard) {
                System.out.println("VOLDEMORT find you ! and ATTACK !!");
                Voldemort.attack(25);
                System.out.println("Enemy has attacked you, you are left " + Wizzard.maxhp + "but you managed to escape it");
            } else {
                System.out.println("Peter find you and attack you");
                Enemy.attack();
                System.out.println("Use a potion and be careful");
                Wizzard.potion(10);
            }
        } while (Boss.Alive() && Wizzard.Alive());
    }

    public static void Chap5() {
        Spell.AddSpell();
        Combat5();
        if (Boss.Alive()) {
            System.out.println("GAME OVER ! Do you want to continue ? y or n");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equals("y")) {
                Main.Chap5();
                Wizzard.setMaxhp(100);
            } else {
                System.out.println("-------------------------------------");
                System.out.println("To a balanced mind, death is just one more great adventure.");
                System.out.println("-------------------------------------");
            }
        } else if (Wizzard.Alive()) {
            Wizzard.setXp(50);
            Wizzard.setMaxhp(100);
            System.out.println("Congrat you have win ! let's go to the 6nd years of Hogwarts, But first, here is your reward : 50xp + 100hp ");
            Main.Chap6();
        }
    }

    public static void Combat5() {
        Enemy Dolores = new Enemy("Dolores Umbridge", 130, 50);
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
            if (Wizzard.House.equals("Ravenclaw")) {
                int min = 25;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min + 1) + min;
                precisionEnemy = rand.nextInt(max - min + 1) + min;
            } else {
                int min = 0;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min + 1) + min;
                precisionEnemy = rand.nextInt(max - min + 1) + min;
            }
            //////////////////////////////////////////////////////////////
            if (precisionWizzard > precisionEnemy) {
                System.out.println("You got your attack !! : " + precisionWizzard + "%");
                System.out.println(Wizzard.getName() + " What do you want to use(choose a number) ? \n 1 - spell  \n 2 - potion ?");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                if (choose.equals("2")) {
                    Wizzard.potion(10);
                    System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp() + "Your enemy have : " + Enemy.getMaxhp());
                } else {
                    Wizzard.spell(20);
                    System.out.println(" The number of hp you have left for " + Enemy.getName() + " is " + Enemy.getMaxhp() + " hp, the remaining hp is " + Wizzard.maxhp);
                }
                if (Dolores.getMaxhp() <= 30) {
                    System.out.println("You receive a new items : firework ");
                    if (choose.equals("firework")) {
                        Wizzard.firework(40);
                    }
                }
            } else if (precisionEnemy > precisionWizzard) {
                System.out.println("It's the tour of Dolores...");
                Enemy.attack();
                System.out.println("Enemy has attacked you, you are left " + Wizzard.maxhp);
            } else {
                System.out.println("Your Enemy have an advantage");
                Random randEne = new Random();
                int min = 1;
                int max = 2;
                int chooseEnemy = randEne.nextInt(max - min + 1) + min;
                if (chooseEnemy == 1) {
                    Enemy.setMaxhp(Enemy.getMaxhp() + 5);
                    System.out.println("Enemy choose health : " + Enemy.getMaxhp());
                } else {
                    Enemy.attack();
                    System.out.println("Enemy has attacked you, you are left " + Wizzard.maxhp);
                }
            }
        } while (Enemy.Alive() && Wizzard.Alive());
    }

    public static void Combat6S() {
        System.out.println("You have join the Death Eaters but... to prove yourself you must have to battle with push Dumbledore");
        Boss Dumbledor = new Boss("Dumbledor", 250, 50);
        int round = 0;
        int push = 100;
        int left = push;
        do {
            round = round + 1;
            System.out.println("-------------------------------------");
            System.out.println("ROUND" + round);
            System.out.println("-------------------------------------");
            // PRECISION OF ENEMY AND WIZZARD (DISTRIBUTION OF ROUND)
            Random rand = new Random();
            System.out.println("Maxhp of Dumbledor : " + Dumbledor.getMaxhp());
            System.out.println("Your maxhp : " + Wizzard.getMaxhp());
            int precisionWizzard;
            int precisionDumbledor = 0;
            int min = 0;
            int max = 100;
            precisionWizzard = 100; //rand.nextInt(max - min + 1) + min;
            precisionDumbledor = rand.nextInt(150 - 10 + 1) + 10;
            /////////////////////////////////////////////////////////////////////
            if (precisionWizzard > precisionDumbledor) {
                System.out.println("You got your attack !! : " + precisionWizzard + "%");
                left = push - 20;
                push = left;
                System.out.println(" You have push Dumbledor of 20m, he still has " + left + " before he falls");
                if (push ==0){
                    System.out.println("Dumbledor has fallen and died you have completed your first mission with the mangemorts");
                    Wizzard.spell(300);
                }
                System.out.println(Wizzard.getName() + " What do you want to use(choose a number)? \n 1 - spell \n 2 - potion \n 3 - spell learn question ?");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                if (choose.equals("1")) {
                    Boss.beattacked(20);
                    System.out.println(" The number of hp you have left for  " + Dumbledor.getName() + " is " +Dumbledor.getMaxhp()  + " hp, the remaining hp is " + Wizzard.maxhp);
                } else if (choose.equals("2")) {
                    Wizzard.potion(10);
                    System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp() + "Your enemy have : " + Dumbledor.getMaxhp());
                } else {
                    System.out.println("Answer to question and you can use the spell concerned");
                    Random choosequestion = new Random();
                    int cursor = choosequestion.nextInt(3 - 1 + 1) + 1;
                    if (cursor == 1) {
                        System.out.println("What the name of the first special spell you use ?");
                        String response = scanner.nextLine();
                        if (response.equals("Wingardium Leviosa")) {
                            Boss.beattacked(30);
                            System.out.println("Bravo ! You learn your lessons well, maxhp of your Enemy : " +Dumbledor.getMaxhp());
                        } else {
                            System.out.println("you pass your turn");
                        }
                    } else if (cursor == 2) {
                        System.out.println("What the name of the second special spell you use ?");
                        String response = scanner.nextLine();
                        if (response.equals("Acio")) {
                            Boss.beattacked(35);
                            System.out.println("Bravo ! You learn your lessons well, maxhp of your Enemy : " +Dumbledor.getMaxhp());
                        } else {
                            System.out.println("you pass your turn");
                        }
                    } else {
                        System.out.println("What the name of the third special spell you use ?");
                        String response = scanner.nextLine();
                        if (response.equals("Expecto Patronum")) {
                            Boss.beattacked(60);
                            System.out.println("Bravo ! You learn your lessons well, maxhp of your Enemy : " +Dumbledor.getMaxhp());
                        } else {
                            System.out.println("you pass your turn");
                        }
                    }
                }
            } else if (precisionWizzard < precisionDumbledor) {
                System.out.println("It's the tour of your Dumbledor...");
                Boss.attack(35);
                System.out.println(Dumbledor.getName() + "has attacked you, you are left " + Wizzard.maxhp);
            } else {
                System.out.println("Dumbledor have an advantage");
                left = left - 20;
                Random randEne = new Random();
                int chooseEnemy = randEne.nextInt(2 - 1 + 1) + 1;
                if (chooseEnemy == 1) {
                    Dumbledor.setMaxhp(Dumbledor.getMaxhp() + 5);
                    System.out.println("Dumbledor choose health : " + Dumbledor.getMaxhp());
                } else {
                    Dumbledor.attack();
                    System.out.println("Dumbledor : " + Dumbledor.maxHp + " has attacked you, you are left " + Wizzard.maxhp);
                }
            }
        } while (Boss.Alive() && Wizzard.Alive());
    }

    public static void Combat6() {
        int round = 0;
        Enemy DeathEaters1 = new Enemy("DeathEaters1", 110, 50);
        Enemy.Mangemort DeathEaters2 = new Enemy.Mangemort("DeathEaters2", 110, 50);
        do {
            round = round + 1;
            System.out.println("-------------------------------------");
            System.out.println("ROUND" + round);
            System.out.println("-------------------------------------");
            // PRECISION OF ENEMY AND WIZZARD (DISTRIBUTION OF ROUND)
            Random rand = new Random();
            System.out.println("Maxhp of DeathEaters1 : " + DeathEaters1.getMaxhp());
            System.out.println("Maxhp of DeathEaters2 : " + DeathEaters2.getMaxhp());
            System.out.println("Your maxhp value : " + Wizzard.getMaxhp());
            int precisionWizzard;
            int precisionEnemy1 = 0;
            int precisionEnemy2 = 0;
            if (Wizzard.House.equals("Ravenclaw")) {
                int min = 25;
                int max = 100;
                precisionWizzard = rand.nextInt(max - min + 1) + min;

            } else {
                int min = 0;
                int max = 100;
                precisionWizzard = rand.nextInt(120 - 0 + 1) + 0;
                precisionEnemy1 = rand.nextInt(max - min + 1) + min;
                precisionEnemy2 = rand.nextInt(max - min + 1) + min;
            }
            /////////////////////////////////////////////////////////////////////
            if (precisionWizzard > precisionEnemy1 && precisionWizzard > precisionEnemy2) {
                System.out.println("You got your attack !! : " + precisionWizzard + "%");
                System.out.println(" which enemy wanted to attack ? \n  1 - Enemy1 \n 2- Enemy2 ");
                Scanner chooseWiz = new Scanner(System.in);
                String chooseWizzard = chooseWiz.nextLine();

                if (chooseWizzard.equals("1")) {
                    System.out.println(" You want to attack 1st Detracker ! ");
                    System.out.println(Wizzard.getName() + " What do you want to use(choose number) ? \n 1 - spell \n 2 - potion  \n 3 - Sectumsempra. (60) ?");
                    Scanner scanner = new Scanner(System.in);
                    String choose = scanner.nextLine();
                    if (choose.equals("3")) {
                        Wizzard.ExpectoPatronus();
                        System.out.println("  The number of hp you have left for "  +DeathEaters1.getName()  + " is " + DeathEaters1.getMaxhp() + " hp, the remaining hp is " + Wizzard.maxhp);
                    } else if (choose.equals("2")) {
                        Wizzard.potion(10);
                        System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp() + "Your enemy have : " + DeathEaters1.getMaxhp());
                    } else {
                        Wizzard.spell(10);
                        System.out.println("  The number of hp you have left for "  + DeathEaters1.getName() + " is " + DeathEaters1.getMaxhp() + ", hp, the remaining hp is " + Wizzard.maxhp);
                    }
                } else if (chooseWizzard.equals("2")) {
                    System.out.println(" You want to attack 2st Detracker ! ");
                    System.out.println(Wizzard.getName() + " What do you want to use(choose number) ? \n 1 - spell \n 2 - potion  \n 3 - Sectumsempra (35) ?");
                    Scanner scanner = new Scanner(System.in);
                    String choose = scanner.nextLine();
                    if (choose.equals("3")) {
                        Enemy.Mangemort.Sectumsempra();
                        System.out.println("  The number of hp you have left for "  +DeathEaters2.getName()  + " is " + DeathEaters2.getMaxhp() + " hp, the remaining hp is " + Wizzard.maxhp);
                    } else if (choose.equals("2")) {
                        Wizzard.potion(10);
                        System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp() + "Your enemy have : " + DeathEaters2.getMaxhp());
                    } else {
                        Enemy.Mangemort.spell();
                        System.out.println("  The number of hp you have left for "  +DeathEaters2.getName()  + " is " + DeathEaters2.getMaxhp() + ", hp, the remaining hp is " + Wizzard.maxhp);
                    }
                }
            } else if (precisionEnemy1 > precisionWizzard && precisionEnemy1 > precisionEnemy2) {
                System.out.println("It's the tour of Detrackeur1...");
                DeathEaters1.attack();
                System.out.println(DeathEaters1.getName() + " has attacked you, you are left " + Wizzard.maxhp);
            } else if (precisionEnemy2 > precisionWizzard && precisionEnemy2 > precisionEnemy1) {
                System.out.println("It's the tour of your Detrackeur2...");
                DeathEaters2.attack(10);
                System.out.println(DeathEaters2.getName() + "has attacked you, you are left " + Wizzard.maxhp);
            } else {
                System.out.println("Your Enemy have an advantage");
                Random randEne = new Random();
                int min = 1;
                int max = 2;
                int chooseEnemy = randEne.nextInt(max - min + 1) + min;
                if (chooseEnemy == 1) {
                    DeathEaters1.setMaxhp(DeathEaters1.getMaxhp() + 5);
                    System.out.println("Detrackeur1 choose health : " + DeathEaters1.getMaxhp());
                } else {
                    DeathEaters2.attack();
                    System.out.println("Detrackeur2 : " + DeathEaters2.maxHp + " has attacked you, you are left " + Wizzard.maxhp);
                }
            }
        } while (Enemy.Alive() && Enemy.Mangemort.Alive() && Wizzard.Alive());
    }

    public static void Chap6() {
        Spell.AddSpell();
        if (Wizzard.House.equals("Slytherin")) {
            System.out.println("As an ally of the Death Eaters do you want to join the dark side? y or n");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equals("n")) {
                Main.Combat6();
            } else {
                Main.Combat6S();
            }
        } else {
            Main.Combat6();
        }
        if (Enemy.Alive() || Enemy.Mangemort.Alive()) {
            System.out.println("GAME OVER ! Do you want to continue ? y or n");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equals("y")) {
                Combat6();
                Wizzard.setMaxhp(100);
            } else {
                        System.out.println("-------------------------------------");
                        System.out.println("To a balanced mind, death is just one more great adventure.");
                        System.out.println("-------------------------------------");
                }
        } else if (Boss.Alive()) {
            System.out.println("GAME OVER ! Do you want to continue ? y or n");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equals("n")){
                        System.out.println("-------------------------------------");
                        System.out.println("To a balanced mind, death is just one more great adventure.");
                        System.out.println("-------------------------------------");
            } else {
                System.out.println("As an ally of the Death Eaters : y or n");
                String responseS = scanner.nextLine();
                if (responseS.equals("n")) {
                    Main.Combat6();
                    Wizzard.setMaxhp(100);
                } else {
                    Main.Combat6S();
                    Wizzard.setMaxhp(100);
                }
            }
        } else if (Wizzard.Alive()) {
            Wizzard.setXp(70);
            Wizzard.setMaxhp(100);
            System.out.println("Congrat you have win ! let's go to the 3nd years of Hogwarts, But first, here is your reward : ");
            Main.Chap7();
        }
    }


    public static void Combat7() {
        int round = 0;
        boolean Wizzardround = false;
        Enemy Bellatrix = new Enemy("Bellatrix Lestrange", 110, 50);
        Boss Voldemort = new Boss("Voldemort", 200, 50);
        Boss.setCoreWand("Dragon Heartstring");
        do {
            round = round + 1;
            System.out.println("-------------------------------------");
            System.out.println("ROUND" + round);
            System.out.println("-------------------------------------");
            // PRECISION OF ENEMY AND WIZZARD (DISTRIBUTION OF ROUND)
            Random rand = new Random();
            System.out.println("Maxhp of " + Bellatrix.getName() + " : " + Bellatrix.getMaxhp());
            System.out.println("Maxhp of " + Voldemort.getName() + " : " + Voldemort.getMaxhp());
            System.out.println("Your maxhp value : " + Wizzard.getMaxhp());
            int precisionWizzard;
            int precisionB = 0;
            int precisionV = 0;
            if (Wizzard.House.equals("Ravenclaw")) {
                int min = 60;
                int max = 120;
                precisionWizzard = rand.nextInt(max - min + 1) + min;

            } else {
                int min = 0;
                int max = 100;
                precisionWizzard = rand.nextInt(120 - 25 + 1) + 25;
                precisionB = rand.nextInt(max - min + 1) + min;
                precisionV = rand.nextInt(max - min + 1) + min;
            }
            if (precisionWizzard > precisionV && precisionWizzard > precisionB) {
                System.out.println("You got your attack !! : " + precisionWizzard + "%");
                System.out.println(" which enemy wanted to attack ? \n  1 - Bellatrix \n 2- Voldemort ");
                Scanner chooseWiz = new Scanner(System.in);
                String chooseWizzard = chooseWiz.nextLine();

                if (chooseWizzard.equals("1")) {
                    System.out.println(" You want to attack Bellatrix ! ");
                    System.out.println(Wizzard.getName() + " What do you want to use ? \n 1 - spell \n 2 - potion \n 3 - Expelliarmus (70) ?");
                    Scanner scanner = new Scanner(System.in);
                    String choose = scanner.nextLine();
                    if (choose.equals("3")) {
                            if (Wizzardround == true){
                                System.out.println("You are already use it");
                                Wizzardround = false;
                            } else { System.out.println("You can't use it in the next round");
                                Wizzard.Expelliarmus();
                                System.out.println(" The number of hp you have left for " + Bellatrix.getName() + " is " + Bellatrix.getMaxhp() + " hp, the remaining hp is " + Wizzard.maxhp);
                                Wizzardround = true;
                            }
                    } else if (choose.equals("2")) {
                        Wizzard.potion(10);
                        System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp() + "Your enemy have : " + Bellatrix.getMaxhp());
                    } else {
                        Wizzard.spell(10);
                        System.out.println(" The number of hp you have left for " + Bellatrix.getName() + " is " + Bellatrix.getMaxhp() + " hp, the remaining hp is " + Wizzard.maxhp);
                    }
                } else if (chooseWizzard.equals("2")) {
                    System.out.println(" You want to attack Voldemort ! ");
                    System.out.println(Wizzard.getName() + " What do you want to use ? \n 1 - spell \n 2 - potion \n 3 - Expelliarmus (70) ?");
                    Scanner scanner = new Scanner(System.in);
                    String choose = scanner.nextLine();
                    if (choose.equals("3")) {
                        if (Wizzardround == true){
                            System.out.println("You are already use it");
                            Wizzardround = false;
                        } else { System.out.println("You can't use it in the next round");
                            Voldemort.beattacked(70);
                            System.out.println("  The number of hp you have left for " + Voldemort.getName() + " is " + Voldemort.getMaxhp() + " hp, the remaining hp is " + Wizzard.maxhp);
                            Wizzardround = true;
                        }
                    } else if (choose.equals("2")) {
                        Wizzard.potion(10);
                        System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp() + "Your enemy have : " + Voldemort.getMaxhp());
                    } else {
                        Boss.beattacked(10);
                        System.out.println(" The number of hp you have left for " + Voldemort.getName() + " is " + Voldemort.getMaxhp() + " hp, the remaining hp is " + Wizzard.maxhp);
                    }
                }
            } else if (precisionB>precisionWizzard && precisionB>precisionV) {
                if (Enemy.Alive()) {
                    System.out.println("It's the tour of Bellatrix...");
                    Bellatrix.attack();
                    System.out.println(Bellatrix.getName() + " has attacked you, you are left " + Wizzard.maxhp);
                }else {
                    System.out.println("Bellatrix is dead, pass the round");
                }
            } else if (precisionV > precisionWizzard && precisionV > precisionB) {
                System.out.println("It's the tour of your Voldemort...");
                System.out.println("Choose an number between 1 and 6");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                if (choose.equals("6")){
                    System.out.println("....Voldemort use ultimate spell : avada kedavra ");
                    if (Wizzardround == true ){
                        System.out.println("But....you countered the attack!");
                    } else {
                        Boss.attack(100);
                    }
                } else {
                    Boss.attack(20);
                    System.out.println(Voldemort.getName() + " has attacked you, you are left " + Wizzard.maxhp);
                }
            } else {
                System.out.println("For this time, and for passing the levels with flying colors, you receive a 50 hp potion !!! Enjoy");
                Wizzard.potion(50);
            }
        } while (Boss.Alive() && Wizzard.Alive() && Enemy.Alive());
    }
            public static void Chap7() {
                Spell.AddSpell();
                if (Wizzard.House.equals("Slytherin")) {
                    System.out.println("As an ally of the Death Eaters, Voldemort doesn't trust you and use you to be consider like the only one, great wizard never existed but you have to take your revenge !!");
                    Combat7();
                } else {
                    Combat7();
                }
                if (Boss.Alive() && Enemy.Alive()) {
                    System.out.println("GAME OVER ! Do you want to continue ? y or n");
                    Scanner scanner = new Scanner(System.in);
                    String response = scanner.nextLine();
                    if (response.equals("y")) {
                        Main.Chap5();
                    } else {
                        System.out.println("-------------------------------------");
                        System.out.println("To a balanced mind, death is just one more great adventure.");
                        System.out.println("-------------------------------------");
                    }
                } else if (Wizzard.Alive()) {
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Congrat you have win ! You are now the great Wizzard never existed, you receive your diploma from the most prestigious school of witchcraft on the planet !!!!!!!  ");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
            }
        }





