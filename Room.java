import java.util.Scanner;
//codingmon project eurgh

public class Room {
    private String name;
    private String description;
    private CodingBall content;
    private boolean requiresBattle;
    private boolean requiresKey;
    private boolean isBattleWon;

    // Exits as simple String variables
    private String northExit;
    private String southExit;
    private String eastExit;
    private String westExit;

    public Room(String name, String description, CodingBall content, boolean requiresBattle, boolean requiresKey) {
        this.name = name;
        this.description = description;
        this.content = content;
        this.requiresBattle = requiresBattle;
        this.requiresKey = requiresKey;
        this.isBattleWon = false;
        this.northExit = null;
        this.southExit = null;
        this.eastExit = null;
        this.westExit = null;
    }

    // Methods to set exits
    public void setNorthExit(String roomName) {
        this.northExit = roomName;
    }

    public void setSouthExit(String roomName) {
        this.southExit = roomName;
    }

    public void setEastExit(String roomName) {
        this.eastExit = roomName;
    }

    public void setWestExit(String roomName) {
        this.westExit = roomName;
    }

    public void enterRoom() {
        System.out.println("You have entered: " + name);
        System.out.println(description);

        if (content != null) {
            System.out.println("You see a " + content.getName() + " on the ground.");
        }

        if (requiresBattle && !isBattleWon) {
            System.out.println("A wild Codingmon appears! You must defeat it to proceed!");
            startBattle();
        }

        if (requiresKey && (content == null || !content.getContent().equals("Key"))) {
            System.out.println("You need a key to exit this room. Perhaps it's in the CodingBall...");
        }
    }

    private void startBattle() {
        System.out.println("Starting a battle...");
        CodingmonBattle battle = new CodingmonBattle();
        battle.main(new String[]{}); // Start the battle
        isBattleWon = true; // Assume the player wins the battle for simplicity
        System.out.println("You defeated the Codingmon! You can now proceed.");
    }

    public boolean canExit() {
        if (requiresBattle && !isBattleWon) {
            System.out.println("You must defeat the Codingmon to exit!");
            return false;
        }

        if (requiresKey && (content == null || !content.getContent().equals("Key"))) {
            System.out.println("You need a key to exit this room!");
            return false;
        }

        return true;
    }

    public String getExit(String direction) {
        switch (direction.toLowerCase()) {
            case "north":
                return northExit;
            case "south":
                return southExit;
            case "east":
                return eastExit;
            case "west":
                return westExit;
            default:
                return null;
        }
    }

    public CodingBall getContent() {
        return content;
    }

    public void setContent(CodingBall content) {
        this.content = content;
    }

    public static void main(String[] args) {
        // Example usage
        CodingBall keyBall = new CodingBall("Key Ball", "Key");
        Room startingRoom = new Room("Pallet Town", "A quiet town where your journey begins.", keyBall, true, true);

        // Set exits
        startingRoom.setNorthExit("Route 1");
        startingRoom.setSouthExit("Professor Oak's Lab");
        startingRoom.setEastExit("Beach");
        startingRoom.setWestExit("Forest");

        startingRoom.enterRoom();

        Scanner input = new Scanner(System.in);
        System.out.println("Which direction would you like to go? (north, south, east, west)");
        String direction = input.nextLine();

        if (startingRoom.canExit()) {
            String nextRoom = startingRoom.getExit(direction);
            if (nextRoom != null) {
                System.out.println("You are heading to " + nextRoom);
            } else {
                System.out.println("You can't go that way!");
            }
        }
    }
}
