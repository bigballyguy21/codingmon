import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Ensure Pikachu and Charmander are recognized properly.
        Codingmon playerCodingmon = new Pikachu();  // Using the Pikachu constructor
        Codingmon wildCodingmon = new Charmander();  // Using the Charmander constructor

        // Battle loop
        while (playerCodingmon.getHp() > 0 && wildCodingmon.getHp() > 0) {
            System.out.println(playerCodingmon.getName() + "'s turn, Choose a move by entering 1, 2, or 3.");
            int choice = input.nextInt();
            int selfAttackChance = rand.nextInt(100);
            int damageamount = 0;

            // Player's attack logic
            if (choice == 1 && selfAttackChance < 25) {
                damageamount = 100;
                System.out.println(wildCodingmon.getName() + " was hit for 100!");
            } else if (choice == 2 && selfAttackChance < 75) {
                damageamount = 50;
                System.out.println(wildCodingmon.getName() + " was hit for 50!");
            } else if (choice == 3 && selfAttackChance < 50) {
                damageamount = 75;
                System.out.println(wildCodingmon.getName() + " was hit for 75!");
            } else {
                System.out.println("You missed your attack! :(");
            }

            wildCodingmon.setHp(wildCodingmon.getHp() - damageamount);

            if (wildCodingmon.getHp() <= 0) {
                System.out.println(wildCodingmon.getName() + " got CLAPPED!");
                break;
            }

            // Wild Codingmon attacks back
            int enemyAttackChance = rand.nextInt(100);
            if (enemyAttackChance < 50) {
                int enemyDamage = rand.nextInt(50) + 50;
                System.out.println(playerCodingmon.getName() + " was hit for " + enemyDamage);
                playerCodingmon.setHp(playerCodingmon.getHp() - enemyDamage);
            } else {
                System.out.println(wildCodingmon.getName() + " missed its attack!");
            }

            if (playerCodingmon.getHp() <= 0) {
                System.out.println(playerCodingmon.getName() + " got CLAPPED!");
                break;
            }

            // Battle cry at the end of the turn
            playerCodingmon.battleCry();
            ((Charmander) wildCodingmon).battleCry();
        }

        input.close();
    }
}
