package cartes;
import effets.Qualite;

/**
 * Class ObjectifPerso
 */
public class ObjectifPerso extends Poney {

				//
				// Fields
				//

  private Qualite objectif;
  
				//
				// Constructors
				//
				public ObjectifPerso () { };
  
				//
				// Methods
				//


				//
				// Accessor methods
				//

				/**
				 * Set the value of objectif
				 * @param newVar the new value of objectif
				 */
  public void setObjectif (Qualite newVar) {
  				objectif = newVar;
  }

				/**
				 * Get the value of objectif
				 * @return the value of objectif
				 */
  public Qualite getObjectif () {
  				return objectif;
  }

				//
				// Other methods
				//

}
