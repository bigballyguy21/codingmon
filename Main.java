
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Create object for subclass pikachu
        Pikachu pikachu = new Pikachu(5);

        //Welcome Trainer
        System.out.println("Welcome trainer to Codingmon! Your goal is to beat three pokemon good luck!");
        System.out.println("Your pokemon: ");
        //Show Pikachu's information
        Pikachu playersPikachu = new Pikachu(5);
        pikachu.displayInfo();

        //asks player if they want to enter forest route to start their journey
        System.out.println("Do you want to enter a route? (yes/no): ");
        String journeyBegins = scanner.nextLine();

        if (journeyBegins.equalsIgnoreCase("yes")) {
            System.out.println("You are walking into the forest...");
            System.out.println("A wild Charmander appears!");

            //create wild charmander
            Charmander wildCharmander = new Charmander(5);
            wildCharmander.displayInfo();
            wildCharmander.battleCry();

            //create instance for battle between the players pokemon and the wild charmander
            Battle battleInstance = new Battle();

            //start battle
            battleInstance.battle(playersPikachu, wildCharmander);

        } else {
            System.out.println("You decided not to start your journey and now you spend the rest of your life flipping" +
                    " patties");
        }
        scanner.close();
    }


}
//Benito
