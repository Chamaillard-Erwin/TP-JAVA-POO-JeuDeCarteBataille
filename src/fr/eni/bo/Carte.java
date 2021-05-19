package fr.eni.bo;

public class Carte {
    private Couleur color;
    private ValeurCarte valeur;

    public Couleur getColor() {
        return color;
    }

    public ValeurCarte getValeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return "Le " + this.valeur + " de " + this.color + " " ;
    }

    public Carte(Couleur color, ValeurCarte valeur) {
        this.color = color;
        this.valeur = valeur;
    }

}
