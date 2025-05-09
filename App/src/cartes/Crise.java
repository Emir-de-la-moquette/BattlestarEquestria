package cartes;
import effets.Qualite;

/**
 * Class Crise
 */
public class Crise extends Carte {

	//
	// Fields
	//

	private Qualite action;
	private boolean superCrise;

	//
	// Constructors
	//
	public Crise (String nomC, Qualite a) {
		super(nomC);
		action = a;
	};

	public Crise (String nomC, Qualite a, boolean sup) {
		super(nomC);
		action = a;
		superCrise = sup;
	};

	//
	// Methods
	//


	//
	// Accessor methods
	//

	public void setAction (Qualite action) {
		this.action = action;
	}

	public Qualite getAction () {
		return action;
	}

	public void setSuper (boolean supC) {
		superCrise = supC;
	}

	public boolean isSuper () {
		return superCrise;
	}

	//
	// Other methods
	//

}
