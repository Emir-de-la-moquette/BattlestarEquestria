package values;

import java.util.Arrays;

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

        // Normaliser l'entrée (par exemple, supprimer les espaces supplémentaires, convertir en majuscules)
        String nomNormalise = nom.trim().toUpperCase();

        // Vérifier d'abord une correspondance exacte
        for (Categories deck : Categories.values()) {
            if (deck.name().equals(nomNormalise)) {
                return deck;
            }
        }

        // Utiliser une vérification de similarité simple pour tolérer les fautes de frappe
        return Arrays.stream(Categories.values())
                .min((deck1, deck2) -> {
                    int distanceDeck1 = calculerDistanceLevenshtein(nomNormalise, deck1.name());
                    int distanceDeck2 = calculerDistanceLevenshtein(nomNormalise, deck2.name());
                    return Integer.compare(distanceDeck1, distanceDeck2);
                })
                .filter(deck -> calculerDistanceLevenshtein(nomNormalise, deck.name()) <= 2) // Tolérance maximale de 2
                .orElse(null);
    }

    /**
     * Calcule la distance de Levenshtein entre deux chaînes de caractères.
     * 
     * @param chaine1 La première chaîne.
     * @param chaine2 La deuxième chaîne.
     * @return La distance de Levenshtein entre les deux chaînes.
     */
    private static int calculerDistanceLevenshtein(String chaine1, String chaine2) {
        int longueur1 = chaine1.length();
        int longueur2 = chaine2.length();
        int[][] tableauDistances = new int[longueur1 + 1][longueur2 + 1];

        for (int i = 0; i <= longueur1; i++) {
            for (int j = 0; j <= longueur2; j++) {
                if (i == 0) {
                    tableauDistances[i][j] = j;
                } else if (j == 0) {
                    tableauDistances[i][j] = i;
                } else {
                    int coutSubstitution = (chaine1.charAt(i - 1) == chaine2.charAt(j - 1)) ? 0 : 1;
                    tableauDistances[i][j] = Math.min(
                            Math.min(tableauDistances[i - 1][j] + 1, tableauDistances[i][j - 1] + 1),
                            tableauDistances[i - 1][j - 1] + coutSubstitution
                    );
                }
            }
        }

        return tableauDistances[longueur1][longueur2];
    }
}
