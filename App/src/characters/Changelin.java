package characters;
import cartes.Poney;
import effets.Qualite;

/**
 * Class Changelin
 */
public class Changelin extends Poney {

				//
				// Fields
				//

  private Qualite malus;
  
				//
				// Constructors
				//
				public Changelin () { };
  
				//
				// Methods
				//


				//
				// Accessor methods
				//

				/**
				 * Set the value of malus
				 * @param newVar the new value of malus
				 */
  public void setMalus (Qualite newVar) {
  				malus = newVar;
  }

				/**
				 * Get the value of malus
				 * @return the value of malus
				 */
  public Qualite getMalus () {
  				return malus;
  }

				//
				// Other methods
				//

}
