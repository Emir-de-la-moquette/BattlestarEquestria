package values;

import java.util.Arrays;

import Bibliotèque.Analyse;

/**
 * Différents decks disponibles
 */
public enum Decks {
    SELECTION, // représente un choix de carte (utile lors des visions de cartes crises ou destination)
    COMPETENCE,
    PARLEMENT,
    LOYAUTE,
    SUPER_CRISE,
    ROLE;




    /**
     * Récupère un deck en fonction du nom fourni, avec une tolérance aux fautes d'orthographe mineures.
     * 
     * @param nom Le nom du deck à récupérer.
     * @return La valeur de l'enum Decks correspondante, ou null si aucune correspondance proche n'est trouvée.
     */
    public static Decks getDeck(String nom) {
        if (nom == null || nom.isEmpty()) {
            return null;
        }

        String nomNormalise = nom.trim().toUpperCase();

        for (Decks deck : Decks.values()) {
            if (deck.name().equals(nomNormalise)) {
                return deck;
            }
        }

        // tolere les fautes de frappe
        return Arrays.stream(Decks.values())
                .min((deck1, deck2) -> {
                    int distanceDeck1 = Analyse.Levenshtein(nomNormalise, deck1.name());
                    int distanceDeck2 = Analyse.Levenshtein(nomNormalise, deck2.name());
                    return Integer.compare(distanceDeck1, distanceDeck2);
                })
                .filter(deck -> Analyse.Levenshtein(nomNormalise, deck.name()) <= 2) // valeur de tolerence max
                .orElse(null);
    }
}
