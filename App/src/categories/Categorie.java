package categories;

import cartes.Competence;

/**
 * Classe abstraite représentant une catégorie de compétence.
 */
abstract public class Categorie{

    //
    // Champs
    //

    /** Nom de la catégorie. */
    private values.Categories nomCategorie;
    /** couleur. */
    private String couleur;

    //
    // Constructeurs
    //


    public Categorie(String cat, String couleur) {
        this.nomCategorie = values.Categories.getCategorie(cat);
        this.couleur = couleur;
    }
    public Categorie(values.Categories cat, String couleur) {
        this.nomCategorie = cat;
        this.couleur = couleur;
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