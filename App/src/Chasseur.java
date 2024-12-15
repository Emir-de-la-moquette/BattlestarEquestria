

/**
 * Class Chasseur
 */
public class Chasseur {

				//
				// Fields
				//

  private boolean vivant;
  private Joueur Pilote;
  private aerien new_attribute;
  
				//
				// Constructors
				//
				public Chasseur () { };
  
				//
				// Methods
				//


				//
				// Accessor methods
				//

				/**
				 * Set the value of vivant
				 * @param newVar the new value of vivant
				 */
  public void setVivant (boolean newVar) {
  				vivant = newVar;
  }

				/**
				 * Get the value of vivant
				 * @return the value of vivant
				 */
  public boolean getVivant () {
  				return vivant;
  }

				/**
				 * Set the value of Pilote
				 * @param newVar the new value of Pilote
				 */
  public void setPilote (Joueur newVar) {
  				Pilote = newVar;
  }

				/**
				 * Get the value of Pilote
				 * @return the value of Pilote
				 */
  public Joueur getPilote () {
  				return Pilote;
  }

				/**
				 * Set the value of new_attribute
				 * @param newVar the new value of new_attribute
				 */
  public void setNew_attribute (aerien newVar) {
  				new_attribute = newVar;
  }

				/**
				 * Get the value of new_attribute
				 * @return the value of new_attribute
				 */
  public aerien getNew_attribute () {
  				return new_attribute;
  }

				//
				// Other methods
				//

}
