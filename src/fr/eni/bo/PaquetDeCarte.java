/**
 * Classe permettant de créer une instance de la classe Paquet de carte
 * -Méthode : Mélanger le paquet de carte
 * -Méthode : Vérifier si le paquet est vide
 * @author echamaillard
 */

package fr.eni.bo;

import java.util.Arrays;
import java.util.Random;

public class PaquetDeCarte {
    //Attributs de l'instance
    private Carte[] paquetCarte = new Carte[52];
    private Couleur[] tabCouleur = Couleur.values();
    private ValeurCarte[] tabValeur = ValeurCarte.values();
    private Random rand = new Random();

    //Getter
    public Carte[] getPaquetCarte() {
        return paquetCarte;
    }

    //Setter
    public void setPaquetCarte(Carte[] paquetCarte) {
        this.paquetCarte = paquetCarte;
    }

    //Constructeur de l'instance
    public  PaquetDeCarte() {
        for (int i = 0; i < tabCouleur.length; i++) {
            for (int j = 0; j < tabValeur.length; j++) {
                for (int k = 0; k < paquetCarte.length; k++) {
                    if (this.paquetCarte[k] == null) {
                        this.paquetCarte[k] = new Carte(tabCouleur[i], tabValeur[j]);
                        break;
                    }
                }
            }
        }
    }

    /**
     * Mélange le paquet de carte
     */
    public void melangerPaquetDeCarte() {
        for (int i = 0; i < this.paquetCarte.length; i++) {
            int nbAlea = rand.nextInt(this.paquetCarte.length -1);
            Carte carteTampon = paquetCarte[nbAlea];
            this.paquetCarte[nbAlea] = paquetCarte[i];
            this.paquetCarte[i] = carteTampon;
        }
    }

    /**
     * Vérifier si le paquet de carte est vide et reourne un boolean
     * TRUE : Le paquet est vide
     * FALSE : Il reste des cartes
     * @return
     */
    public boolean verifierPaquetVide() {
        for (Carte carte : this.paquetCarte) {
            if (carte != null) {
                return false;
            }
        }
        return true;
    }
}
