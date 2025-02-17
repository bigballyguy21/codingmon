public class Pikachu extends Codingmon {
    // Constructor for Pikachu
    public Pikachu() {
        super("Pikachu", 100, 20); // Example values: Name, HP, Attack Power
    }

    // Override the attack method for Pikachu
    @Override
    public int attack(Codingmon target) {
        System.out.println("Pikachu used Thunderbolt!");
        return super.attack(target); // Calls the base attack logic from Codingmon
    }
}
