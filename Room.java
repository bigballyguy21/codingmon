public class Room {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void describe() {
        System.out.println("You are in " + name + ".");
        System.out.println(description);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

