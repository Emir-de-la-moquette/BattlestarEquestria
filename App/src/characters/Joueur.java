package characters;

import java.util.*;
import cartes.Carte;
import element_jeu.Case;


/**
 * Class Joueur
 */
public class Joueur {

    //
    // Fields
    //
    private HashMap<values.Decks, Carte[]> decks;
    private Personnage personnage;
    private String pseudo;
    private Case position;
    private int pointsAction;
    private int pointsMouvement;

    //
    // Constructors
    //
    public Joueur(String pseudo, Personnage personnage, Case position) {
        this.pseudo = pseudo;
        this.personnage = personnage;
        this.position = position;
        this.pointsAction = 0; // Par défaut
        this.pointsMouvement = 0; // Par défaut
        this.decks = new HashMap<>();
    }

    //
    // Methods
    //

    /**
     * Ajoute un deck à ce joueur.
     * 
     * @param typeDeck Le type de deck (ex. "attaque", "défense").
     * @param cartes   Les cartes à inclure dans le deck.
     */
    public void ajouterDeck(values.Decks typeDeck, Carte[] cartes) {
        decks.put(typeDeck, cartes);
    }

    /**
     * Récupère une carte spécifique depuis un deck.
     * 
     * @param typeDeck Le type de deck.
     * @param index    L'index de la carte.
     * @return La carte correspondante, ou null si elle n'existe pas.
     */
    public Carte piocherCarte(values.Decks typeDeck, int index) {
        Carte[] deck = decks.get(typeDeck);
        if (deck != null && index >= 0 && index < deck.length) {
            return deck[index];
        }
        return null;
    }

    /**
     * Déplace le joueur vers une nouvelle position.
     * 
     * @param nouvellePosition La case cible.
     */
    public void deplacer(Case nouvellePosition) {
        if (pointsMouvement > 0) {
            position = nouvellePosition;
            pointsMouvement--;
            System.out.println(pseudo + " s'est déplacé vers " + nouvellePosition);
        } else {
            System.out.println(pseudo + " n'a plus de mouvements disponibles !");
        }
    }

    /**
     * Exécute une action spécifique.
     * 
     * @param actionDescription La description de l'action.
     */
    public void executerAction(String actionDescription) {
        if (pointsAction > 0) {
            pointsAction--;
            System.out.println(pseudo + " exécute l'action : " + actionDescription);
        } else {
            System.out.println(pseudo + " n'a plus d'actions disponibles !");
        }
    }

    /**
     * Réinitialise les actions et mouvements pour un nouveau tour.
     * 
     * @param actions    Le nombre d'actions à attribuer.
     * @param mouvements Le nombre de mouvements à attribuer.
     */
    public void initialiserTour(int actions, int mouvements) {
        this.pointsAction = actions;
        this.pointsMouvement = mouvements;
        System.out.println(pseudo + " commence un nouveau tour avec " + actions + " actions et " + mouvements + " mouvements.");
    }

    //
    // Accessor methods
    //

    public void setDecks(HashMap<values.Decks, Carte[]> decks) {
        this.decks = decks;
    }

    public HashMap<values.Decks, Carte[]> getDecks() {
        return decks;
    }

    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }

    public Personnage getPersonnage() {
        return personnage;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPosition(Case position) {
        this.position = position;
    }

    public Case getPosition() {
        return position;
    }

    public void setPointsAction(int pointsAction) {
        this.pointsAction = pointsAction;
    }

    public int getPointsAction() {
        return pointsAction;
    }

    public void setPointsMouvement(int pointsMouvement) {
        this.pointsMouvement = pointsMouvement;
    }

    public int getPointsMouvement() {
        return pointsMouvement;
    }
}
