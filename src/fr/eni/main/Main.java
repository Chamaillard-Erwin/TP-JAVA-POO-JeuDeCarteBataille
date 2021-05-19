package fr.eni.main;

import fr.eni.bo.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        Joueur joueur1 = new Joueur();
        Joueur joueur2 = new Joueur();

        System.out.printf("---------------------------------------%n");
        System.out.printf("BIENVENUE SUR LE PROGRAMME DU SOLITAIRE%n");
        System.out.printf("---------------------------------------%n");
        System.out.printf("Saisissez le nom du JOUEUR1 :%n");
        joueur1.setNom(scan.nextLine()); //On set le nom du joueur1
        System.out.printf("Saisissez le prénom du JOUEUR1 :%n");
        joueur1.setPrenom(scan.nextLine()); //On set le prenom du joueur1
        System.out.printf("Saisissez le nom du JOUEUR2 :%n");
        joueur2.setNom(scan.nextLine()); //On set le nom du joueur2
        System.out.printf("Saisissez le prénom du JOUEUR2 :%n");
        joueur2.setPrenom(scan.nextLine()); //On set le prenom du joueur2
        System.out.printf("---------------------------------------%n");
        System.out.printf("EN COMBIEN DE MANCHE ? Rentrez 26 ou + pour jouer jusqu'a ce que le paquet soit vide %n");
        Jeu jeu01 = new Jeu(joueur1, joueur2, scan.nextInt()); //On rentre le nombre de manche on stop automatiquement si le paquet est vide
        System.out.printf("---------------------------------------%n");
        System.out.printf("Début de la bataille :%n");
        jeu01.bataille(); // Début de la bataille et l'affichage de son déroulement



    }
}
