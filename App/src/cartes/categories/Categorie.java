package cartes.categories;

import cartes.Competence;

/**
 * Classe abstraite représentant une catégorie de compétence.
 */
abstract public class Categorie extends Competence{

    //
    // Champs
    //

    /** Nom de la catégorie. */
    private values.Categories nomCategorie;

    //
    // Constructeurs
    //

    /**
     * Constructeur de base pour une catégorie.
     * 
     * @param nom nom de la carte
     * @param cat Nom de la catégorie.
     */
    public Categorie(String nom, String cat) {
        super(nom);
        this.nomCategorie = values.Categories.getCategorie(cat);
    }

    /**
     * Constructeur de base pour une catégorie.
     * 
     * @param nom Nom de la carte.
     * @param cat Nom de la catégorie.
     */
    public Categorie(String nom, values.Categories cat) {
        super(nom);
        this.nomCategorie = cat;
    }

    //
    // Accesseurs
    //

    /**
     * Définit le nom de la catégorie.
     * 
     * @param nouveauNom Le nouveau nom de la catégorie.
     */
    public void setNomCategorie(String nouveauNom) {
        this.nomCategorie = values.Categories.getCategorie(nouveauNom);
    }

    /**
     * Définit le nom de la catégorie.
     * 
     * @param nouveauNom Le nouveau nom de la catégorie.
     */
    public void setNomCategorie(values.Categories nouveauNom) {
        this.nomCategorie = nouveauNom;
    }

    /**
     * Récupère le nom de la catégorie.
     * 
     * @return Le nom de la catégorie.
     */
    public String getStringNomCategorie() {
        return this.nomCategorie.toString();
    }

    /**
     * Récupère le nom de la catégorie.
     * 
     * @return Le nom de la catégorie.
     */
    public values.Categories getNomCategorie() {
        return this.nomCategorie;
    }
}