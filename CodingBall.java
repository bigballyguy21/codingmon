//Codingball java example
public class CodingBall {
    // Attributes
    private String name;
    private boolean isObtained;
    private boolean isThrown;
    private String content;

    public CodingBall() {
        this.name = "Basic CodingBall";
        this.isObtained = false;
        this.isThrown = false;
        this.content = "Empty";
    }

    public CodingBall(String name) {
        this.name = name;
        this.isObtained = false;
        this.isThrown = false;
        this.content = "Empty";
    }

    public CodingBall(String name, String content) {
        this.name = name;
        this.isObtained = false;
        this.isThrown = false;
        this.content = content;
    }

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
                System.out.println("You can't use an empty Codingbal");
            } else {
                System.out.println("You released the " + content + " from the " + name + "!");
                content = "Empty";
            }
        } else {
            System.out.println("You need to pick up the " + name + " first!");
        }
    }

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
}