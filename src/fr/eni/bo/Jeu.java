/**
 * Classe permettant de créer une instance de la classe jeu, celui contient tout le déroulement d'une partie
 *
 *
 * @author echamaillard
 */

package fr.eni.bo;

import java.util.Random;

public class Jeu {

    private PaquetDeCarte paquetCarte = new PaquetDeCarte();
    private Joueur joueur1;
    private Joueur joueur2;
    private int currentManche;
    private int maxManche;
    private boolean paquetVide = false;
    Random rand = new Random();

    public Jeu(Joueur joueur1, Joueur joueur2, int maxManche) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.maxManche = maxManche;
        paquetCarte.melangerPaquetDeCarte();
    }

    /**
     * Corps principal d'un tour de jeu
     */
    public void bataille() {
        do {
            Carte carteJ1 = choixCarte();
            Carte carteJ2 = choixCarte();
            afficherCarte(this.joueur1, carteJ1, this.joueur2, carteJ2);
            if (carteJ1.getValeur().ordinal() > carteJ2.getValeur().ordinal()) {
                joueur1.setScore(joueur1.getScore() + 1);
            }
            else if (carteJ1.getValeur().ordinal() < carteJ2.getValeur().ordinal()) {
                joueur2.setScore(joueur2.getScore() + 1);
            }
            this.currentManche ++;
            paquetVide = this.paquetCarte.verifierPaquetVide();
        }while(this.currentManche < maxManche && this.paquetVide == false);
        if(paquetVide == true) {
            System.out.printf("Il n'y a plus de cartes.%n");
        }
        afficherScore(this.joueur1);
        afficherScore(this.joueur2);
        afficherResultat(this.joueur1, this.joueur2);
    }

    /**
     * Méthode qui retourne une carte pioché dans le paquet de carte
     * @return
     */
    public Carte choixCarte(){
        Carte carte = null;
        for (int i = 0; i < this.paquetCarte.getPaquetCarte().length; i++) {
            if (this.paquetCarte.getPaquetCarte()[i] != null){
                carte = paquetCarte.getPaquetCarte()[i];
                this.paquetCarte.getPaquetCarte()[i] = null;
                return carte;
            }
        }
        return carte;
    }

    /**
     * Méthode d'affichage pour la carte du joueur
     * @param joueur1
     * @param carteJ1
     * @param joueur2
     * @param carteJ2
     */
    public void afficherCarte(Joueur joueur1, Carte carteJ1, Joueur joueur2, Carte carteJ2) {
        System.out.printf("%s %s présente sa carte : ", joueur1.getNom(), joueur1.getPrenom());
        carteJ1.afficherCarte();
        System.out.printf("%s %s présente sa carte : ", joueur2.getNom(), joueur2.getPrenom());
        carteJ2.afficherCarte();
    }

    /**
     * Méthode d'affichage pour les scores à la fin de la partie
     * @param joueur
     */
    public void afficherScore(Joueur joueur) {
        System.out.printf("Le score de %s %s est de %d%n", joueur.getNom(), joueur.getPrenom(), joueur.getScore());
    }

    /**
     * Méthode d'affichage pour le résultat et le gagnant à la fin de la partie
     * @param joueur1
     * @param joueur2
     */
    public void afficherResultat(Joueur joueur1, Joueur joueur2) {
        if (joueur1.getScore() > joueur2.getScore()) {
            System.out.printf("%s %s gagne la bataille.%n", joueur1.getNom(), joueur1.getPrenom());
        }
        else if (joueur1.getScore() < joueur2.getScore()) {
            System.out.printf("%s %s gagne la bataille.%n", joueur2.getNom(), joueur2.getPrenom());
        }
        else {
            System.out.printf("Cela se termine par une égalité%n");
        }
    }
}
