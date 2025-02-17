public class Player {  // Now public
    // Instance variables
    String name;
    int health;
    String codingmons; // Player's collection of Codingmons
    String inventory; // Inventory for CodingBalls
    String location; // Current room/location

    // Constructor
    public Player(String name) {
        this.name = name;
        this.health = 100; // Default health value
        this.codingmons = codingmon ;
        this.inventory = inv;
        this.location = "Starting Area"; // Default starting location
    }

    // Methods
    public void move(String newLocation) {
        this.location = newLocation;
        System.out.println(name + " moved to " + location);
    }

    public void captureCodingmon(Codingmon codingmon, CodingBall ball) {
        if (Math.random() < ball.getSuccessRate()) {
            codingmons.add(codingmon);
            System.out.println(name + " captured " + codingmon.getName() + "!");
        } else {
            System.out.println(codingmon.getName() + " escaped!");
        }
    }

    public void useCodingBall(CodingBall ball) {
        if (inventory.contains(ball)) {
            inventory.remove(ball);
            System.out.println(name + " used a " + ball.getType() + " CodingBall!");
        } else {
            System.out.println("No " + ball.getType() + " CodingBall available!");
        }
    }

    public void showInventory() {
        System.out.println(name + "'s Inventory:");
        for (CodingBall ball : inventory) {
            System.out.println("- " + ball.getType());
        }
    }

    public void showCodingmons() {
        System.out.println(name + "'s Codingmons:");
        for (Codingmon codingmon : codingmons) {
            System.out.println("- " + codingmon.getName());
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getLocation() {
        return location;
    }
}
