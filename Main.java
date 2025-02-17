import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create object for subclass Pikachu
        Pikachu playersPikachu = new Pikachu(5); // Fixed: Use playersPikachu directly

        // Welcome Trainer
        System.out.println("Welcome trainer to Codingmon! Your goal is to beat three pokemon. Good luck!");
        System.out.println("Your pokemon: ");

        // Show Pikachu's information
        playersPikachu.displayInfo(); // Fixed: Use playersPikachu instead of pikachu

        // Ask player if they want to enter forest route to start their journey
        System.out.println("Do you want to enter a route? (yes/no): ");
        String journeyBegins = scanner.nextLine();

        if (journeyBegins.equalsIgnoreCase("yes")) {
            System.out.println("You are walking into the forest...");
            System.out.println("A wild Charmander appears!");

            // Create wild Charmander
            Charmander wildCharmander = new Charmander(5);
            wildCharmander.displayInfo();
            wildCharmander.battleCry();

            // Create instance for battle between the player's pokemon and the wild Charmander
            Battle battleInstance = new Battle();

            // Start battle
            battleInstance.battle(playersPikachu, wildCharmander);

        } else {
            System.out.println("You decided not to start your journey and now you spend the rest of your life flipping patties.");
        }
        scanner.close();
    }
}
