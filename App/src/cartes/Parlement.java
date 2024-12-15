package cartes;
import effets.Qualite;

/**
 * Class Parlement
 */
public class Parlement extends Carte {

	//
	// Fields
	//

  private Qualite action;
  
	//
	// Constructors
	//
	public Parlement (String nomC, Qualite act) { 
		super(nomC);
		action = act;
	};

	//
	// Methods
	//


	//
	// Accessor methods
	//

	/**
	 * Set the value of action
	 * @param newVar the new value of action
	 */
  public void setAction (Qualite newVar) {
  				action = newVar;
  }

	/**
	 * Get the value of action
	 * @return the value of action
	 */
  public Qualite getAction () {
  				return action;
  }

	//
	// Other methods
	//

}
