/**
 * Classe permettant de créer une instance de la classe Joueur
 * @author echamaillard
 */

package fr.eni.bo;

public class Joueur {
    private String nom;
    private String prenom;
    private int score;


    /**
     * Constructeur par défaut d'une instance de la classe Joueur
     */
    public Joueur() {
        this.score = 0;
    }
    //SETTERS
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //GETTERS
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getScore() {
        return score;
    }
}
