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
        //Main.checkAct();
        //Main.getcheckAct();
        Main.Chap1();
        //Main.Chap2();
        //Main.Chap3();


        /// Spell

        /// Potion

        //story.printIntro --> Permet de mettre le texte ecrit dans la classe story
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
                System.out.println(Wizzard.getName() + " What do you want to use ? \n spell : attack ? \n potion : defend ? \n Wingardium Leviosa(30) : spell learn ?");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                if (choose.equals("Wingardium Leviosa")) {
                    Wizzard.WingardiumLeviosa();
                    System.out.println(" Vous avez infligez " + Enemy.maxhp + " au Troll, il vous reste " + Wizzard.maxhp);
                } else if (choose.equals("potion")) {
                    Wizzard.potion();
                    System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp());
                } else {
                    Wizzard.spell(Troll);
                    System.out.println(" Vous avez infligez " + Enemy.maxhp + " au Troll, il vous reste " + Wizzard.maxhp);
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
            System.out.println("Vous avez perdu ! Voulez vous recommencez ? y or n");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equals("y")) {
                Main.Chap1();
            } else {
                System.out.println("A bientot");
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
                System.out.println(Wizzard.getName() + " What do you want to use ? \n spell : attack ? \n potion : defend ? \n items : Gryffondor Sword (50) ?");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                if (choose.equals("Gryffondor Sword")) {
                    Wizzard.GryffindorSword();
                    System.out.println(" Vous avez infligez " + Enemy.getMaxhp() + " au " + Enemy.getName() + " il vous reste " + Wizzard.maxhp);
                } else if (choose.equals("potion")) {
                    Wizzard.potion();
                    System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp() + "Your enemy have : " + Enemy.getMaxhp());
                } else {
                    Wizzard.spell(Basilic);
                    System.out.println(" Vous avez infligez " + Enemy.getMaxhp() + " au " + Enemy.getName() + ", il vous reste " + Wizzard.maxhp);
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
                System.out.println(Wizzard.getName() + " What do you want to use ? \n spell : attack ? \n potion : defend ? \n new spell : Acio (35) ?");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                if (choose.equals("Acio")) {
                    Wizzard.Acio();
                    System.out.println(" Vous avez infligez " + Enemy.getMaxhp() + " au " + Enemy.getName() + " il vous reste " + Wizzard.maxhp);
                } else if (choose.equals("potion")) {
                    Wizzard.potion();
                    System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp() + "Your enemy have : " + Enemy.getMaxhp());
                } else {
                    Wizzard.spell(Basilic);
                    System.out.println(" Vous avez infligez " + Enemy.getMaxhp() + " au " + Enemy.getName() + ", il vous reste " + Wizzard.maxhp);
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
            System.out.println("Vous avez perdu ! Voulez vous recommencez ? n or y");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equals("y")) {
                if (Wizzard.House.equals("Gryffindor")) {
                    Combat2G();
                } else {
                    Combat2();
                }
            } else {
                System.out.println("A bientot");
            }
        } else if (Wizzard.Alive()) {
            Wizzard.setXp(30);
            Wizzard.setMaxhp(100);
            System.out.println("Congrat you have win ! let's go to the 3nd years of Hogwarts, But first, here is your reward : ");
            Main.Chap3();
        }
    }

    public static void Combat3() {
        int round = 0;
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
                System.out.println(" which enemy wanted to attack ? \n  1 - Enemy1 \n 2- Enemy2 ");
                Scanner chooseWiz = new Scanner(System.in);
                String chooseWizzard = chooseWiz.nextLine();

                if (chooseWizzard.equals("1")) {
                    System.out.println(" You want to attack 1st Detracker ! ");
                    System.out.println(Wizzard.getName() + " What do you want to use ? \n spell : attack ? \n potion : defend ? \n new spell : Expecto Patronus. (60) ?");
                    Scanner scanner = new Scanner(System.in);
                    String choose = scanner.nextLine();
                    if (choose.equals("Expecto Patronus")) {
                        Wizzard.ExpectoPatronus(Detracker1);
                        System.out.println(" Vous avez infligez " + Detracker1.getMaxhp() + " au " + Detracker1.getName() + " il vous reste " + Wizzard.maxhp);
                    } else if (choose.equals("potion")) {
                        Wizzard.potion();
                        System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp() + "Your enemy have : " + Detracker1.getMaxhp());
                    } else {
                        Wizzard.spell(Detracker1);
                        System.out.println(" Vous avez infligez " + Detracker1.getMaxhp() + " au " + Detracker1.getName() + ", il vous reste " + Wizzard.maxhp);
                    }
                } else if (chooseWizzard.equals("2")) {
                    System.out.println(" You want to attack 2st Detracker ! ");
                    System.out.println(Wizzard.getName() + " What do you want to use ? \n spell : attack ? \n potion : defend ? \n new spell : S….. (35) ?");
                    Scanner scanner = new Scanner(System.in);
                    String choose = scanner.nextLine();
                    if (choose.equals("Expecto Patronus")) {
                        Wizzard.ExpectoPatronus(Detracker2);
                        System.out.println(" Vous avez infligez " + Detracker2.getMaxhp() + " au " + Detracker2.getName() + " il vous reste " + Wizzard.maxhp);
                    } else if (choose.equals("potion")) {
                        Wizzard.potion();
                        System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp() + "Your enemy have : " + Detracker2.getMaxhp());
                    } else {
                        Wizzard.spell(Detracker2);
                        System.out.println(" Vous avez infligez " + Detracker2.getMaxhp() + " au " + Detracker2.getName() + ", il vous reste " + Wizzard.maxhp);
                    }
                }
            } else if (precisionEnemy1 > precisionWizzard && precisionEnemy1 > precisionEnemy2) {
                System.out.println("It's the tour of Detrackeur1...");
                Detracker1.attack();
                System.out.println(Detracker1.getName() + " has attacked you, you are left " + Wizzard.maxhp);
            } else if (precisionEnemy2 > precisionWizzard && precisionEnemy2 > precisionEnemy1) {
                System.out.println("It's the tour of your Detrackeur2...");
                Detracker2.attack();
                System.out.println(Detracker2.getName() + "has attacked you, you are left " + Wizzard.maxhp);
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
            System.out.println("Vous avez perdu ! Voulez vous recommencez ? y or n");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equals("y")) {
                Main.Chap3();
            } else {
                System.out.println("A bientot");
            }
        } else if (Wizzard.Alive()) {
            Wizzard.setXp(40);
            Wizzard.setMaxhp(100);
            System.out.println("Congrat you have win ! let's go to the 4nd years of Hogwarts, But first, here is your reward : 40xp + 100hp ");
            Main.Chap4();
        }
    }

    public static void Chap4() {
        System.out.println("Building…");
        if (Wizzard.Alive()) {
            Wizzard.setXp(50);
            Wizzard.setMaxhp(100);
            System.out.println("Congrat you have win ! let's go to the 5nd years of Hogwarts, But first, here is your reward : 40xp + 100hp ");
            Main.Chap5();
        }
    }

    public static void Chap5() {
        Spell.AddSpell();
        Combat5();
        if (Wizzard.getMaxhp() == 0) {
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
            Wizzard.setXp(60);
            Wizzard.setMaxhp(100);
            System.out.println("Congrat you have win ! let's go to the 6nd years of Hogwarts, But first, here is your reward : 40xp + 100hp ");
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
                System.out.println(Wizzard.getName() + " What do you want to use ? \n spell : attack ? \n potion : defend ? ?");
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.nextLine();
                if (choose.equals("potion")) {
                    Wizzard.potion();
                    System.out.println(" You have choose to take a potion you have : " + Wizzard.getMaxhp() + "Your enemy have : " + Enemy.getMaxhp());
                } else {
                    Wizzard.spell5(Dolores);
                    System.out.println(" Vous avez infligez " + Enemy.getMaxhp() + " au " + Enemy.getName() + ", il vous reste " + Wizzard.maxhp);
                }
                if (Dolores.getMaxhp() == 30) {
                    System.out.println("You receive a new items : firework ");
                    if (choose.equals("firework")) {
                        Wizzard.firework(30);
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
        } while (Enemy.Alive() || Wizzard.Alive());
    }
    public static void Chap6(){

    }
}



