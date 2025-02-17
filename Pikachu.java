public class Pikachu extends Codingmon {

    public Pikachu() {
        super("Pikachu", 100, 25);  // Calls the constructor of the parent class Codingmon
    }

    // Optionally, you can override methods or add specific behavior for Pikachu here
    @Override
    public void battleCry() {
        System.out.println("Pikachu uses Thunderbolt!");
    }
}
