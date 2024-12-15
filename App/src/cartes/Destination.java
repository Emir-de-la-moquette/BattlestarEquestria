package cartes;
import effets.Qualite;

/**
 * Class Destination
 */
public class Destination extends Carte {

	//
	// Fields
	//

  private Qualite consequence;
  private int avancee;
  
	//
	// Constructors
	//
	public Destination (String nomC, Qualite cons, int avc) {
		super(nomC);
		consequence = cons;
		avancee = avc;
	};

	//
	// Methods
	//


	//
	// Accessor methods
	//

	public void setConsequence (Qualite newVar) {
					consequence = newVar;
	}

	public Qualite getConsequence () {
					return consequence;
	}

	public void setAvancee (int newVar) {
					avancee = newVar;
	}

	public int getAvancee () {
					return avancee;
	}

				//
				// Other methods
				//

}
