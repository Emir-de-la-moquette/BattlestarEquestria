package cartes;

import java.util.*;


/**
 * Class Carte
 */
abstract public class Carte {

	//
	// Fields
	//

  	private String nom;
  	private String description;
  
	//
	// Constructors
	//
	public Carte (String nomC) {
		nom = nomC;
	};

	//
	// Methods
	//


	//
	// Accessor methods
	//

	public void setNom (String newVar) {
		nom = newVar;
	}

	public String getNom () {
		return nom;
	}

	public void setDesc (String newVar) {
		description = newVar;
	}

	public String getDesc () {
		return description;
	}

	//
	// Other methods
	//

}
