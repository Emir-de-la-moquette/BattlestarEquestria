
import java.util.*;

import cartes.Categorie;
import effets.Qualite;


/**
 * Class Personnage
 */
public class Personnage {

				//
				// Fields
				//

  private String nom;
  private Categorie classe;
  private boolean Ulti;
  private Qualite defaut;
  private Qualite passif;
  
				//
				// Constructors
				//
				public Personnage () { };
  
				//
				// Methods
				//


				//
				// Accessor methods
				//

				/**
				 * Set the value of nom
				 * @param newVar the new value of nom
				 */
  public void setNom (String newVar) {
  				nom = newVar;
  }

				/**
				 * Get the value of nom
				 * @return the value of nom
				 */
  public String getNom () {
  				return nom;
  }

				/**
				 * Set the value of classe
				 * @param newVar the new value of classe
				 */
  public void setClasse (Categorie newVar) {
  				classe = newVar;
  }

				/**
				 * Get the value of classe
				 * @return the value of classe
				 */
  public Categorie getClasse () {
  				return classe;
  }

				/**
				 * Set the value of Ulti
				 * @param newVar the new value of Ulti
				 */
  public void setUlti (boolean newVar) {
  				Ulti = newVar;
  }

				/**
				 * Get the value of Ulti
				 * @return the value of Ulti
				 */
  public boolean getUlti () {
  				return Ulti;
  }

				/**
				 * Set the value of defaut
				 * @param newVar the new value of defaut
				 */
  public void setDefaut (Qualite newVar) {
  				defaut = newVar;
  }

				/**
				 * Get the value of defaut
				 * @return the value of defaut
				 */
  public Qualite getDefaut () {
  				return defaut;
  }

				/**
				 * Set the value of passif
				 * @param newVar the new value of passif
				 */
  public void setPassif (Qualite newVar) {
  				passif = newVar;
  }

				/**
				 * Get the value of passif
				 * @return the value of passif
				 */
  public Qualite getPassif () {
  				return passif;
  }


				/**
				 */
  public void utiliserUtlti()
  {
				}


}
