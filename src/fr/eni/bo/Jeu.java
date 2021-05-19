package fr.eni.bo;

import java.util.Random;

public class Jeu {

    private Carte[] paquetCarte;
    private Joueur joueur1;
    private Joueur joueur2;
    private int nbManche;
    Random rand = new Random();

    public Jeu(Carte[] paquetCarte, Joueur joueur1, Joueur joueur2, int nbManche) {
        this.paquetCarte = paquetCarte;
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nbManche = nbManche;
    }

    public void bataille() {
        Carte carteJ1 = choixCarte();
        Carte carteJ2 = choixCarte();
        afficherCarte(this.joueur1, carteJ1, this.joueur2, carteJ2);
        if (carteJ1.getValeur().ordinal() > carteJ2.getValeur().ordinal()) {
            joueur1.setScore(joueur1.getScore() + 1);
        }
        else if (carteJ1.getValeur().ordinal() > carteJ2.getValeur().ordinal()) {
            joueur2.setScore(joueur1.getScore() + 1);
        }

    }

    public Carte choixCarte(){
        Carte carte = null;
        do {
            int randomJ = rand.nextInt(this.paquetCarte.length-1);
            if (this.paquetCarte != null) {
                carte = paquetCarte[randomJ];
                this.paquetCarte[randomJ] = null;
            }
        }while(carte == null);
        return carte;
    }

    public void afficherCarte(Joueur joueur1, Carte carteJ1, Joueur joueur2, Carte carteJ2) {
        System.out.printf("%s %s présente sa carte : ", joueur1.getNom(), joueur1.getPrenom() + carteJ1.toString());
        System.out.printf("%s %s présente sa carte : ", joueur2.getNom(), joueur2.getPrenom() + carteJ2.toString());
    }

}
