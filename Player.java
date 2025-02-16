import java.util.ArrayList;
import java.util.List;

public class Player {
    // Instance variables
    private String name;
    private int health;
    private List<Codingmon> codingmons; // Player's collection of Codingmons
    private List<CodingBall> inventory; // Inventory for CodingBalls
    private String location; // Current room/location

    // Constructor
    public Player(String name) {
        this.name = name;
        this.health = 100; // Default health value
        this.codingmons = new ArrayList<>();
        this.inventory = new ArrayList<>();
        this.location = "Starting Area"; // Default starting location
    }

    // Move to a new location
    public void move(String newLocation) {
        this.location = newLocation;
        System.out.println(name + " moved to " + location);
    }

    // Capture a Codingmon
    public void captureCodingmon(Codingmon codingmon, CodingBall ball) {
        if (Math.random() < ball.getSuccessRate()) {
            codingmons.add(codingmon);
            System.out.println(name + " captured " + codingmon.getName() + "!");
        } else {
            System.out.println(codingmon.getName() + " escaped!");
        }
    }

    // Use a CodingBall
    public void useCodingBall(CodingBall ball) {
        if (inventory.contains(ball)) {
            inventory.remove(ball);
            System.out.println(name + " used a " + ball.getType() + " CodingBall!");
        } else {
            System.out.println("No " + ball.getType() + " CodingBall available!");
        }
    }

    // Show inventory
    public void showInventory() {
        System.out.println(name + "'s Inventory:");
        for (CodingBall ball : inventory) {
            System.out.println("- " + ball.getType());
        }
    }

    // Show Codingmons
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

    public List<Codingmon> getCodingmons() {
        return codingmons;
    }

    public List<CodingBall> getInventory() {
        return inventory;
    }
}
