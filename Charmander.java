public class Charmander extends Codingmon {
    // Constructor for Charmander
    public Charmander() {
        super("Charmander", 80, 18); // Example values: Name, HP, Attack Power
    }

    // Override the attack method for Charmander
    @Override
    public int attack(Codingmon target) {
        System.out.println("Charmander used Flamethrower!");
        return super.attack(target); // Calls the base attack logic from Codingmon
    }

    public void battleCry() {
    }
}
