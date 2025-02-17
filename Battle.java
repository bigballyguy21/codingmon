public class Battle {

    public void battle(Codingmon playerCodingmon, Codingmon wildCodingmon) {
        System.out.println(playerCodingmon.getName() + " is fighting " + wildCodingmon.getName() + "!");
        System.out.println("Battle Start!\n");

        while (playerCodingmon.getHp() > 0 && wildCodingmon.getHp() > 0) {
            int playerDamage = playerCodingmon.attack(wildCodingmon);
            System.out.println(playerCodingmon.getName() + " dealt " + playerDamage + " damage!");
            wildCodingmon.setHp(wildCodingmon.getHp() - playerDamage);

            if (wildCodingmon.getHp() <= 0) {
                System.out.println(wildCodingmon.getName() + " has fainted!");
                break;
            }

            int wildDamage = wildCodingmon.attack(playerCodingmon);
            System.out.println(wildCodingmon.getName() + " dealt " + wildDamage + " damage!");
            playerCodingmon.setHp(playerCodingmon.getHp() - wildDamage);

            if (playerCodingmon.getHp() <= 0) {
                System.out.println(playerCodingmon.getName() + " has fainted!");
                break;
            }

            System.out.println("----- Next Round -----\n");
        }

        System.out.println("Battle Over!");
    }
}

