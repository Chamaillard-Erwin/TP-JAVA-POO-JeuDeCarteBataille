/**
 * Classe permettant de créer une instance de la classe Carte
 * En fonction d'une enumeration pour la couleur
 * En fonction d'une enumeration pour la valeur
 * @author echamaillard
 */

package fr.eni.bo;

public class Carte {
    private Couleur color;
    private ValeurCarte valeur;

    //Getters
    public Couleur getColor() {
        return color;
    }

    public ValeurCarte getValeur() {
        return valeur;
    }

    public void afficherCarte() {
        System.out.printf("%s de %s%n", this.valeur, this.color);
    }

    //Constructeur de la classe
    public Carte(Couleur color, ValeurCarte valeur) {
        this.color = color;
        this.valeur = valeur;
    }

}
