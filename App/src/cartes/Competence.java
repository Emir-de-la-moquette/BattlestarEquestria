package cartes;
import effets.Qualite;

/**
 * Class Competence
 */
public class Competence extends Carte {

	//
	// Fields
	//

	private Categorie categorie;
	private Qualite action;
  
	//
	// Constructors
	//
	public Competence (String nomC, Categorie c) {
		super(nomC);
		categorie = c;
	};

	public Competence (String nomC, Categorie c, Qualite a) {
		super(nomC);
		categorie = c;
		action = a;
	};

	//
	// Methods
	//


	//
	// Accessor methods
	//


	public void setCategorie (Categorie newVar) {
					categorie = newVar;
	}


	public Categorie getCategorie () {
					return categorie;
	}


	public void setAction (Qualite newVar) {
					action = newVar;
	}


	public Qualite getAction () {
					return action;
	}

				//
				// Other methods
				//

}
