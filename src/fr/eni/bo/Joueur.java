package fr.eni.bo;

public class Joueur {
    private String nom;
    private String prenom;

    public void setScore(int score) {
        this.score = score;
    }

    private int score;

    public Joueur(String nom, String prenom, int score) {
        this.nom = nom;
        this.prenom = prenom;
        this.score = score;
    }

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
