package TP1;
import java.util.Scanner;
public class exercice {

    public static void main(String[] args) {
        //somme();
        //division();
        volume();
    }

    public static void somme(){
        System.out.println("Veuillez saisir le premier entier");
        System.out.println("Veuillez saisir le deuxieme entier");
        Scanner scanner = new Scanner(System.in);
        int premierEntier = scanner.nextInt();
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est egale a " + somme);
    }

    public static void division() {
        System.out.println("Veuillez saisir un entier");
        System.out.println("Veillez saisir le deuxième entier");
        Scanner scanner = new Scanner(System.in);
        int premierEntier = scanner.nextInt();
        int deuxiemeEntier = scanner.nextInt();
        int division = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier + " est egale a " + division);
    }

    public static void volume() {
        System.out.println("Veuillez saisir la longueur du pavé droit ");
        System.out.println("Veuillez saisir la largeur du pavé droit ");
        System.out.println("Veuillez saisir l'hauteur du pavé droit ");
        Scanner scanner = new Scanner(System.in);
        float L = scanner.nextInt();
        float l = scanner.nextInt();
        float h = scanner.nextInt();
        float V = L * l * h ;
        System.out.println("Le volume du pavé droit est " + V);
    }
}
// #1 nous avons besoin de 3 variables, hauteur, largeur et longueur
// #2 nous aurons besoin de valeur reel donc : float
// #3 les valeurs des variables sont obtenues grâce à scanner.nextInt()
// #4 La formule du pavé droit est : V = Longueur * Largeur * Hauteur
// #5 On doit afficher le résultat avec System.out.println()
// Le problème de ce problème est qu'on ne peut pas empêcher l'utilisateur à ne pas mettre
// certaine valeur qui pourrait faire planter le programme comme 0/0

