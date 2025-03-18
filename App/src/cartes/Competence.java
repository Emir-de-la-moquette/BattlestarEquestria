package cartes;

import categories.Categorie;
import effets.Qualite;

/**
 * Classe représentant une carte de compétence.
 */
public class Competence extends Carte {

    //
    // Champs
    //

    /** Action ou effet de la compétence. */
    private Qualite action;

    //
    // Constructeurs
    //

    /**
     * Constructeur de base pour une carte de compétence.
     * 
     * @param nomCarte Nom de la carte.
     */
    public Competence(String nomCarte) {
        super(nomCarte);
    }

    /**
     * Constructeur complet pour une carte de compétence.
     * 
     * @param nomCarte Nom de la carte.
     * @param actionEffet Effet ou action de la carte.
     */
    public Competence(String nomCarte, Qualite actionEffet) {
        super(nomCarte);
        this.action = actionEffet;
    }

    //
    // Accesseurs
    //


    /**
     * Définit l'effet ou l'action de la carte.
     * 
     * @param nouvelEffet La nouvelle action ou effet de la carte.
     */
    public void setAction(Qualite nouvelEffet) {
        this.action = nouvelEffet;
    }

    /**
     * Récupère l'effet ou l'action de la carte.
     * 
     * @return L'action ou effet de la carte.
     */
    public Qualite getAction() {
        return this.action;
    }
}