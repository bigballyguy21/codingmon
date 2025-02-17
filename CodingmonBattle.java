import java.util.Random;
import java.util.Scanner;

class Moves {
    public String moveName;
    public int damageAmount;

    public Moves(String name, int damageAmount) {
        this.moveName = name;
        this.damageAmount = damageAmount;
    }

    public String getMoveName() {
        return moveName;
    }

    public int getDamageAmount() {
        return damageAmount;
    }
}

class Codingmon {
    private String name;
    private int hp;
    private int attackPower;

    public Codingmon(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public int attack(Codingmon target) {
        return attackPower; // Simple attack logic
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    // Add the displayInfo method here
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Attack Power: " + attackPower);
    }

    public void battleCry() {
    }
}

class pikachu extends Codingmon {
    public pikachu(int i) {
        super("Pikachu", 100, 20); // Example values
    }

    @Override
    public int attack(Codingmon target) {
        System.out.println("Pikachu used Thunderbolt!");
        return super.attack(target); // Calls the base attack logic
    }
}

class charmander extends Codingmon {
    public charmander(int i) {
        super("Charmander", 80, 18); // Example values
    }

    @Override
    public int attack(Codingmon target) {
        System.out.println("Charmander used Flamethrower!");
        return super.attack(target); // Calls the base attack logic
    }

    public void battleCry() {
    }
}

public class CodingmonBattle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Create player and wild Codingmon (Pikachu vs Charmander)
        Codingmon playerCodingmon = new pikachu(5); // Example: Player's Pikachu
        Codingmon wildCodingmon = new charmander(5); // Example: Wild Charmander

        // Show initial info of both Codingmons
        System.out.println("Player's Pokemon:");
        playerCodingmon.displayInfo();
        System.out.println("Wild Pokemon:");
        wildCodingmon.displayInfo();

        // Battle loop
        while (playerCodingmon.getHp() > 0 && wildCodingmon.getHp() > 0) {
            System.out.println(playerCodingmon.getName() + "'s turn. Choose a move: ");
            System.out.println("1. Attack with Thunderbolt (Pikachu) / Flamethrower (Charmander)");
            int choice = input.nextInt();
            int selfAttackChance = rand.nextInt(100);
            int damageAmount = 0;

            if (choice == 1) {
                damageAmount = playerCodingmon.attack(wildCodingmon);
                System.out.println(wildCodingmon.getName() + " was hit for " + damageAmount + "!");
            } else {
                System.out.println("Invalid move! Please choose a valid action.");
                continue;
            }

            wildCodingmon.setHp(wildCodingmon.getHp() - damageAmount);

            if (wildCodingmon.getHp() <= 0) {
                System.out.println(wildCodingmon.getName() + " fainted!");
                break;
            }

            int enemyAttackChance = rand.nextInt(100);
            if (enemyAttackChance < 50) {
                int enemyDamage = rand.nextInt(50) + 50;
                System.out.println(playerCodingmon.getName() + " was hit for " + enemyDamage);
                playerCodingmon.setHp(playerCodingmon.getHp() - enemyDamage);
            } else {
                System.out.println(wildCodingmon.getName() + " missed its attack!");
            }

            if (playerCodingmon.getHp() <= 0) {
                System.out.println(playerCodingmon.getName() + " fainted!");
                break;
            }
        }
    }
}
