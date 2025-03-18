package App.game;
import characters.Personnage;
import categories.*;

public class Persos {
    public static void main(String[] args) {

        Categorie commandement = new Commandement();
        Categorie politique = new Politique();
        Categorie pilotage = new Pilotage();
        Categorie ingenieurie = new Ingenierie();

        new Personnage("Posada",commandement);
        new Personnage("Luna",commandement);
        new Personnage("Aryanne",commandement);
        new Personnage("Shadow Tempes",commandement);
        new Personnage("Starlight Glimmer",commandement);
        new Personnage("Vira",commandement);


        new Personnage("Twilight Sparkle (nerd)",ingenieurie);
        new Personnage("Applejack",ingenieurie);
        new Personnage("Fluttershy",ingenieurie);
        new Personnage("Rarity",ingenieurie);
        new Personnage("Trixie Lulamoon",ingenieurie);
        new Personnage("Infirmière RedHeart",ingenieurie);
        new Personnage("Walter White",ingenieurie);


        new Personnage("Twilight Sparkle",politique);
        new Personnage("Celestia",politique);
        new Personnage("Cadence",politique);
        new Personnage("Pinky Pie",politique);
        new Personnage("Starlight Glimmer (pol)",politique);
        new Personnage("Autumn Blaze",politique);

        
        new Personnage("Spitfire",pilotage);
        new Personnage("Casse-Cou",pilotage);
        new Personnage("Rainbow Dash",pilotage);
        new Personnage("Shining Armor",pilotage);
        new Personnage("Sunset Shimmer",pilotage);
        new Personnage("Soarin",pilotage);
    }
}
