package cartes;
import effets.Qualite;

/**
 * Class Role
 */
public class Role extends Carte {

				//
				// Fields
				//

  private Qualite action;
  private boolean principal;
  
				//
				// Constructors
				//
				public Role (String nomC, Qualite act, boolean princip) { 
					super(nomC);
					action = act;
					principal = princip;
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

				/**
				 * Set the value of principal
				 * @param newVar the new value of principal
				 */
  public void setPrincipal (boolean newVar) {
  				principal = newVar;
  }

				/**
				 * Get the value of principal
				 * @return the value of principal
				 */
  public boolean getPrincipal () {
  				return principal;
  }

				//
				// Other methods
				//

}
