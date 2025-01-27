package cartes;

import java.util.*;

/**
 * Classe abstraite représentant une carte du jeu.
 */
abstract public class Carte {

    //
    // Champs
    //

    /** Nom de la carte. */
    private String nom;

    /** Description de la carte. */
    private String description;

    //
    // Constructeurs
    //

    /**
     * Constructeur de base pour une carte.
     * 
     * @param nomCarte Nom de la carte.
     */
    public Carte(String nomCarte) {
        this.nom = nomCarte;
    }

    //
    // Méthodes
    //

    //
    // Accesseurs
    //

    /**
     * Définit le nom de la carte.
     * 
     * @param nouveauNom Le nouveau nom de la carte.
     */
    public void setNom(String nouveauNom) {
        this.nom = nouveauNom;
    }

    /**
     * Récupère le nom de la carte.
     * 
     * @return Le nom de la carte.
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Définit la description de la carte.
     * 
     * @param nouvelleDescription La nouvelle description de la carte.
     */
    public void setDescription(String nouvelleDescription) {
        this.description = nouvelleDescription;
    }

    /**
     * Récupère la description de la carte.
     * 
     * @return La description de la carte.
     */
    public String getDescription() {
        return this.description;
    }
}