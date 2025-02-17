public class Pikachu extends Codingmon {
    public Pikachu() {
        // Calls the parent constructor with specific values for Pikachu
        super("Pikachu", 100, 20);  // Example values for Pikachu's HP and attackPower
    }

    @Override
    public void battleCry() {
        System.out.println("Pikachu shouts: Pika-Pika!");
    }
}
