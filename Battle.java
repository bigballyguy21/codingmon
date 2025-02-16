public class Battle {

    // Method to start the battle
    public void battle(Pokemon playerPokemon, Pokemon wildPokemon) {
        System.out.println(playerPokemon.getName() + " is fighting " + wildPokemon.getName() + "!");
        System.out.println("Battle Start!\n");

        // Simulate the battle with basic attack rounds
        while (playerPokemon.getHp() > 0 && wildPokemon.getHp() > 0) {
            // Player attacks first
            int playerDamage = playerPokemon.attack(wildPokemon);
            System.out.println(playerPokemon.getName() + " dealt " + playerDamage + " damage!");

            // Reduce wild Pokémon's health by the damage
            wildPokemon = new Pokemon(wildPokemon.getName(), wildPokemon.lvl, wildPokemon.getHp() -
                    playerDamage, wildPokemon.attack, wildPokemon.defense);

            if (wildPokemon.getHp() <= 0) {
                System.out.println(wildPokemon.getName() + " has fainted!");
                break;
            }

            // Wild Pokémon attacks
            int wildDamage = wildPokemon.attack(playerPokemon);
            System.out.println(wildPokemon.getName() + " dealt " + wildDamage + " damage!");

            // Reduce player's Pokémon health by the damage
            playerPokemon = new Pokemon(playerPokemon.getName(), playerPokemon.level, playerPokemon.getHealthPoints() - wildDamage, playerPokemon.attack, playerPokemon.defense);

            if (playerPokemon.getHp() <= 0) {
                System.out.println(playerPokemon.getName() + " has fainted!");
                break;
            }

            System.out.println("----- Next Round -----\n");
        }

        System.out.println("Battle Over!");
    }
}
