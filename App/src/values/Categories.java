package values;

import java.util.Arrays;

import Bibliotèque.Analyse;

/**
 * catégories de cartes
 */
public enum Categories {
    POLITIQUE, 
    COMMANDEMENT,
    TACTIQUE,
    INGENIERIE,
    TRAITRISE,
    PILOTAGE;




    /**
     * Récupère une catégorie en fonction du nom fourni, avec une tolérance aux fautes d'orthographe mineures.
     * 
     * @param nom Le nom de la catégorie récupérer.
     * @return La valeur de l'enum categorie correspondante, ou null si aucune correspondance proche n'est trouvée.
     */
    public static Categories getCategorie(String nom) {
        if (nom == null || nom.isEmpty()) {
            return null;
        }

        String nomNormalise = nom.trim().toUpperCase();

        for (Categories deck : Categories.values()) {
            if (deck.name().equals(nomNormalise)) {
                return deck;
            }
        }

        // tolere les fautes de frappe
        return Arrays.stream(Categories.values())
                .min((deck1, deck2) -> {
                    int distanceDeck1 = Analyse.Levenshtein(nomNormalise, deck1.name());
                    int distanceDeck2 = Analyse.Levenshtein(nomNormalise, deck2.name());
                    return Integer.compare(distanceDeck1, distanceDeck2);
                })
                .filter(deck -> Analyse.Levenshtein(nomNormalise, deck.name()) <= 2) // valeur de tolerence max
                .orElse(null);
    }

    

        
}
