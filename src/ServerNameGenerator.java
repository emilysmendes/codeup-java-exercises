public class ServerNameGenerator {

    public static String[] noun = {
            "Wand", "Owl", "Spellbook", "Curse", "Horcrux", "Gringotts", "Witch", "Wizard", "Hogwarts", "Broomstick"
    };

    public static final String[] adjective = {
            "Intelligent", "Cunning", "Brave", "Helpful", "Ambition", "Chivalry", "Patience", "Loyalty", "Resourcefulness", "Wit"
    };

    public static String stringRandom(String[] array) {
        int randomIndex = (int) (Math.random() * array.length);
        return array[randomIndex];
    }

    public static void main(String[] args) {
        System.out.printf("Here is your server name: %n%s-%s%n", stringRandom(noun), stringRandom(adjective));
    }
}
