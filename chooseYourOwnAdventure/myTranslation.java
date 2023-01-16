package chooseYourOwnAdventure;
import java.util.Random;

public class myTranslation {
    public static void main(String[] args) {
        String[] characteristic = {"sly", "hangry", "cheery", "malicious"};
        String[] gender = {"male", "female", "non-binary", "androgynous"};
        String[] race = {"human","goblin", "dwarf", "mage", "centaur"};

        Random rand = new Random();
        int upperboundC = characteristic.length;
        int upperboundG = gender.length;
        int upperboundR = race.length;

        int c = rand.nextInt(upperboundC);
        int g = rand.nextInt(upperboundG);
        int r = rand.nextInt(upperboundR);

       String description = String.format("%s, %s, %s", characteristic[c], gender[g], race[r]);

       System.out.printf("You are a %s exploring the dangerous underground", description);
    }
}
