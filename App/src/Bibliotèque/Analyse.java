package Bibliotèque;

public class Analyse {
    /**
     * Calcule la distance de Levenshtein entre deux chaînes de caractères.
     * 
     * @param chaine1 La première chaîne.
     * @param chaine2 La deuxième chaîne.
     * @return La distance de Levenshtein entre les deux chaînes.
     */
    public static int Levenshtein(String chaine1, String chaine2) {
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
