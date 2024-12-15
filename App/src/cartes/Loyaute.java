package cartes;

/**
 * Class Loyaute
 */
public class Loyaute extends Carte {

	//
	// Fields
	//

  	private Poney revelation;
  
	//
	// Constructors
	//
	public Loyaute (String nomC, Poney rev) { 
		super(nomC);
		revelation = rev;
	};

	//
	// Methods
	//


	//
	// Accessor methods
	//

	public void setRevelation (Poney newVar) {
					revelation = newVar;
	}

	public Poney getRevelation () {
					return revelation;
	}

				//
				// Other methods
				//

}
