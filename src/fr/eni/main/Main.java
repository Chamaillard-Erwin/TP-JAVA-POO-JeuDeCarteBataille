package fr.eni.main;

import fr.eni.bo.Carte;
import fr.eni.bo.Couleur;
import fr.eni.bo.ValeurCarte;

public class Main {
    public static void main(String[] args) {

        /**
         * Initialisation du jeu de carte
         */
        Carte[] paquetCarte = new Carte[52];
        Couleur[] tabCouleur = Couleur.values();
        ValeurCarte[] tabValeur = ValeurCarte.values();
        /**
         * Triple boucle pour généré le jeu de carte
         */
        for (int i = 0; i < tabCouleur.length; i++) {
            for (int j = 0; j < tabValeur.length; j++) {
                for (int k = 0; k < paquetCarte.length; k++) {
                    if (paquetCarte[k] == null) {
                        paquetCarte[k] = new Carte(tabCouleur[i], tabValeur[j]);
                        break;
                    }
                }
            }
        }










    }
}
