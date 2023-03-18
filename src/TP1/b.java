package TP1;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        System.out.println("Bonjour, quel est votre prénom ?"); //afficher sur le prompy
        Scanner scanner = new Scanner(System.in);  //prompt pour que l'utilisateur puisse saisir
        String prenom = scanner.nextLine(); //recupération des saisis de l'utilisateur + mettre dans la variable prénom
        System.out.println( "Bonjour," + prenom); //afficher un message le saisi de l'utilisateur
    }

}


