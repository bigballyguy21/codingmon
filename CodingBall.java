public class CodingBall {
    // Attributes
    private String name;
    private boolean isObtained;
    private boolean isThrown;
    private String content;
    private double successRate; // Added for capture mechanics
    private String type; // Added for inventory display

    // Constructors
    public CodingBall() {
        this.name = "Basic CodingBall";
        this.isObtained = false;
        this.isThrown = false;
        this.content = "Empty";
        this.successRate = 0.5; // Default success rate
        this.type = "Basic"; // Default type
    }

    public CodingBall(String name) {
        this.name = name;
        this.isObtained = false;
        this.isThrown = false;
        this.content = "Empty";
        this.successRate = 0.5; // Default success rate
        this.type = "Basic"; // Default type
    }

    public CodingBall(String name, String content) {
        this.name = name;
        this.isObtained = false;
        this.isThrown = false;
        this.content = content;
        this.successRate = 0.5; // Default success rate
        this.type = "Basic"; // Default type
    }

    public CodingBall(String name, double successRate, String type) {
        this.name = name;
        this.isObtained = false;
        this.isThrown = false;
        this.content = "Empty";
        this.successRate = successRate; // Custom success rate
        this.type = type; // Custom type
    }

    // Methods
    public void pickUp() {
        if (!isObtained) {
            isObtained = true;
            System.out.println("You picked up the " + name + "!");
        } else {
            System.out.println("You already have a CodingBall!");
        }
    }

    public void drop() {
        if (isObtained) {
            isObtained = false;
            System.out.println("You dropped the " + name + ".");
        } else {
            System.out.println("You don't have a CodingBall...");
        }
    }

    public void throwBall() {
        if (isObtained) {
            if (!isThrown) {
                isThrown = true;
                System.out.println("You threw the " + name + "!");
                if (!content.equals("Empty")) {
                    System.out.println("Oh! A wild " + content + " appeared!");
                } else {
                    System.out.println("But nothing happened...");
                }
            } else {
                System.out.println("The " + name + " has already been thrown.");
            }
        } else {
            System.out.println("You need to pick up the " + name + " first!");
        }
    }

    public void lookAt() {
        System.out.println("You see a " + name + ".");
        if (isObtained) {
            System.out.println("You see the CodingBall and you look at its round shape.");
        } else {
            System.out.println("It is lying on the ground.");
        }
        if (!content.equals("Empty")) {
            System.out.println("It contains a " + content + ".");
        } else {
            System.out.println("It is empty.");
        }
    }

    public void use() {
        if (isObtained) {
            if (content.equals("Empty")) {
                System.out.println("You can't use an empty CodingBall!");
            } else {
                System.out.println("You released the " + content + " from the " + name + "!");
                content = "Empty";
            }
        } else {
            System.out.println("You need to pick up the " + name + " first!");
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Added methods for game mechanics
    public double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(double successRate) {
        this.successRate = successRate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
