
import java.util.*;

import cartes.Carte;


/**
 * Class Joueur
 */
public class Joueur {

				//
				// Fields
				//

  private HashMap<String, Carte[]> decks;
  private Personnage perso;
  private String pseudo;
  private Case position;
  private int actions;
  private int mouvements;
  
				//
				// Constructors
				//
				public Joueur () { };
  
				//
				// Methods
				//


				//
				// Accessor methods
				//

				/**
				 * Set the value of decks
				 * @param newVar the new value of decks
				 */
  public void setDecks (HashMap<String, Carte[]> newVar) {
  				decks = newVar;
  }

				/**
				 * Get the value of decks
				 * @return the value of decks
				 */
  public HashMap<String, Carte[]> getDecks () {
  				return decks;
  }

				/**
				 * Set the value of perso
				 * @param newVar the new value of perso
				 */
  public void setPerso (Personnage newVar) {
  				perso = newVar;
  }

				/**
				 * Get the value of perso
				 * @return the value of perso
				 */
  public Personnage getPerso () {
  				return perso;
  }

				/**
				 * Set the value of pseudo
				 * @param newVar the new value of pseudo
				 */
  public void setPseudo (String newVar) {
  				pseudo = newVar;
  }

				/**
				 * Get the value of pseudo
				 * @return the value of pseudo
				 */
  public String getPseudo () {
  				return pseudo;
  }

				/**
				 * Set the value of position
				 * @param newVar the new value of position
				 */
  public void setPosition (Case newVar) {
  				position = newVar;
  }

				/**
				 * Get the value of position
				 * @return the value of position
				 */
  public Case getPosition () {
  				return position;
  }

				/**
				 * Set the value of actions
				 * @param newVar the new value of actions
				 */
  public void setActions (int newVar) {
  				actions = newVar;
  }

				/**
				 * Get the value of actions
				 * @return the value of actions
				 */
  public int getActions () {
  				return actions;
  }

				/**
				 * Set the value of mouvements
				 * @param newVar the new value of mouvements
				 */
  public void setMouvements (int newVar) {
  				mouvements = newVar;
  }

				/**
				 * Get the value of mouvements
				 * @return the value of mouvements
				 */
  public int getMouvements () {
  				return mouvements;
  }

				//
				// Other methods
				//

}
