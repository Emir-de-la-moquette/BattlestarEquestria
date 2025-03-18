package effets;

import values.MomentPartie;

/**
 * Class LimiteCARTE
 */
public class LimiteCARTE extends Qualite {

				//
				// Fields
				//


				
				int max = 10;
  
				//
				// Constructors
				//
				public LimiteCARTE (MomentPartie moment, int val) { 
					super(moment);
					this.max=val;
				};
  
				//
				// Methods
				//


				//
				// Accessor methods
				//

				//
				// Other methods
				//

}