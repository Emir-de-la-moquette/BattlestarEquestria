

/**
 * Class Zone
 */
abstract public class Zone {

				//
				// Fields
				//

  private boolean accesible;
  private boolean endommagee;
  
				//
				// Constructors
				//
				public Zone () { };
  
				//
				// Methods
				//


				//
				// Accessor methods
				//

				/**
				 * Set the value of accesible
				 * @param newVar the new value of accesible
				 */
  public void setAccesible (boolean newVar) {
  				accesible = newVar;
  }

				/**
				 * Get the value of accesible
				 * @return the value of accesible
				 */
  public boolean getAccesible () {
  				return accesible;
  }

				/**
				 * Set the value of endommagee
				 * @param newVar the new value of endommagee
				 */
  public void setEndommagee (boolean newVar) {
  				endommagee = newVar;
  }

				/**
				 * Get the value of endommagee
				 * @return the value of endommagee
				 */
  public boolean getEndommagee () {
  				return endommagee;
  }

				//
				// Other methods
				//

}
