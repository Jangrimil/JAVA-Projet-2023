package TP2;
import java.util.Scanner;
import java.util.ArrayList;
public class exo1 {
    public static void main(String[] args) {
        //discriminant();
        //parite();
        //max();
        //min();
        //egaliteStr();
        factorielle();
        //countdown();
        //carres();
        //tableMultiplication();
        //division();
        //regle();
        //nombrePremier();
        //initialisationTableau();
    }

    public static void discriminant() {
        System.out.println("Quelle est la valeur de a ?");
        System.out.println("Quelle est la valeur de b ?");
        System.out.println("Quelle est la valeur de c ?");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta == 0) {
            int racine1 = -b / 2 * a;
            System.out.println("La racine double est " + racine1);
        } else if (delta > 0) {
            double racine1 = (-b + Math.sqrt(delta)) / 2 * a;
            double racine2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("1ere racine est égale : " + racine1);
            System.out.println("2eme racine est égale : " + racine2);
        } else if (delta < 0) {
            int i = -delta;
            double racine1 = (-b + Math.sqrt(i)) / 2 * a;
            double racine2 = (-b - Math.sqrt(i)) / 2 * a;
            System.out.println("Ce polynome a une de racine reelle negatif, 1ere racine = " + racine1 + " et la 2eme racine = " + racine2);
        }
    }

//boucle for --> connaitre le nb de repétitition de l'intruction
//boucle while --> intrusion defini par une condition
// boucle do while --> intrusion exécuter 1 fois

    public static void parite() {
        System.out.println("Entrer une valeur : ");
        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();
        int r = nombre % 2;
        if (r == 0) {
            System.out.println("La valeur entrée " + nombre + " est paire car le reste est de " + r);
        } else {
            System.out.println("La valeur entrée " + nombre + " est impaire car le reste est de " + r);
        }
    }

    public static void max() {
        System.out.println("Saisis la première valeur : ");
        System.out.println("Saisis la deuxième valeur : ");
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        if (val1 > val2) {
            System.out.println("La plus grande valeur est : " + val1);
        } else {
            System.out.println("La plus grande valeur est : " + val2);
        }

    }

    public static void min() {
        System.out.println("Saisis la première valeur : ");
        System.out.println("Saisis la deuxième valeur : ");
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        if (val1 > val2) {
            System.out.println("La plus petite valeur est : " + val2);
        } else {
            System.out.println("La plus petite valeur est : " + val1);
        }
    }

    public static void egaliteStr() {
        System.out.println("Saisir une chaine de caractère : ");
        System.out.println("Saisir une deuxième chaine de caractère");
        Scanner scanner = new Scanner(System.in);
        String char1 = scanner.nextLine();
        String char2 = scanner.nextLine();
        boolean test = char1.equals(char2);
        if (test == true) {
            System.out.println("Les charactères sont les mêmes");
        } else {
            System.out.println("Les charactères sont différents");
        }
    }

    public static void factorielle() {
        System.out.println("Saisir un entier positif ou nul");
        Scanner scanner = new Scanner(System.in);
        int i, factorielle = 1;
        int n = scanner.nextInt();
        for (i = 1; i <= n; i++) {
            factorielle *= i;
            System.out.println(n + "! = " + factorielle);
        }
    }

    public static void countdown() {
        int compteur = 10;
        int i = 1;
        for (i = 0; i <= 9; i++) {
            compteur -= 1;
            System.out.println("Compte à rebours : " + compteur);
            if (compteur == 0) {
                System.out.println("BOOM");
            }
        }
    }

    public static void carres() { //? tabultations
        System.out.println("Saisis une valeur : ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = x * x;
        //int[] tab = {x,y};
        System.out.print( x + " /t" + y);
    }

    public static void tableMultiplication() {
        //1. for
        for (int j = 1; j<11; j++){
            for (int i = 1; i<11; i++){
                System.out.print(j*i + "\t");
            }
            System.out.println("\n");
        }
    }
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        int entier1;
        int entier2;
            System.out.println("Saisir 1er nombre entier : ");
            entier1 = scanner.nextInt();
        do {
            System.out.println("Saisir 2eme nombre entier non nul : ");
            entier2 = scanner.nextInt();
        } while (entier2 == 0);
        System.out.println("La division de " +entier1 +"/"+entier2+ " = " +entier1/entier2);
    }
    public static void regle(){
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            System.out.println("Saisir une valeur entière : ");
            x = scanner.nextInt();
        } while (x <= 0);
        for (int i=0 ; i<x; i++){
            if (i%10==0) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
    }
    public static void nombrePremier(){
        Scanner scanner = new Scanner(System.in);
        int x;
        int y = 0;
        do{
            System.out.println("Veuillez saisir un entier strictement positif");
            x = scanner.nextInt();
        } while (x<=0);
        for (int i = 2; i <= Math.sqrt(x); i++){
            if (x % i == 0){
                y+=1;
            }
        }
        if (y==0){
            System.out.println(x + " est premier");
        }else{
            System.out.println(x + " n'est pas premier");
        }
    }
    public static void initialisationTableau() {
        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }
        java.util.Arrays.sort(tableau);
        System.out.println("Le tableau " + tableau);
        System.out.println("La valeur minium du tableau est "+tableau[0]+ " et la valeur max est "+tableau[tableau.length-1]);

        int somme = 0;
        for (int i = 0; i<tableau.length;i++){
            somme += tableau[i];
        }
        System.out.println("La somme des valeurs du tableau est " +somme);

        int paire;
        for (int i = 0; i<tableau.length;i++){
            paire = tableau[i]%2;
            if (paire==0){
                System.out.println("Le nombre " + tableau[i]+ " est paire. D'indice " + i );
            }
        }
    }
}




