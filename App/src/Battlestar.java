
import java.util.*;


/**
 * Class Battlestar
 */
public class Battlestar {

				//
				// Fields
				//


  private Vector resourcesVector = new Vector();
  
				//
				// Constructors
				//
				public Battlestar () { };
  
				//
				// Methods
				//


				//
				// Accessor methods
				//

				/**
				 * Add a Resources object to the resourcesVector List
				 */
  private void addResources (Resources new_object) {
  				resourcesVector.add(new_object);
  }

				/**
				 * Remove a Resources object from resourcesVector List
				 */
  private void removeResources (Resources new_object)
  {
  				resourcesVector.remove(new_object);
  }

				/**
				 * Get the List of Resources objects held by resourcesVector
				 * @return List of Resources objects held by resourcesVector
				 */
  private List getResourcesList () {
  				return (List) resourcesVector;
  }


				//
				// Other methods
				//

}
