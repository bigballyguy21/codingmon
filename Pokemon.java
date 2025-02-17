import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    String name;
    int lvl;
    String type;
    int hp;
    int attack;
    int defense;
    int speed;
    List<Move> moves = new ArrayList<>();

    // Constructor
    public Pokemon(String pokemonName, int pokemonLvl, String pokemonType, int pokemonHp, int pokemonAttack,
                   int pokemonDefense, int pokemonSpeed) {
        this.name = pokemonName;
        this.lvl = pokemonLvl;
        this.type = pokemonType;
        this.hp = pokemonHp;
        this.attack = pokemonAttack;
        this.defense = pokemonDefense;
        this.speed = pokemonSpeed;
    }

    public void battleCry() {
        System.out.println(name + " is ready for battle!");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + lvl);
        System.out.println("Type: " + type);
        System.out.println("HP: " + hp);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Speed: " + speed);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int attack(Pokemon opponent) {
        int baseDamage = this.attack - opponent.defense;
        if (baseDamage < 0) {
            return 0;
        }
        return baseDamage;
    }

    public void levelUp() {
        lvl++;
        attack += 5;
        defense += 3;
        speed += 2;
        hp += 10;
        System.out.println(name + " leveled up to level " + lvl + "!");
    }

    public void addMove(Move move) {
        moves.add(move);
    }

    public void useMove(int moveIndex, Pokemon opponent) {
        if (moveIndex >= 0 && moveIndex < moves.size()) {
            Move move = moves.get(moveIndex);
            System.out.println(name + " uses " + move.name + "!");
            int damage = move.power - opponent.defense;
            opponent.hp -= damage;
            System.out.println("It dealt " + damage + " damage!");
            if (opponent.hp <= 0) {
                opponent.hp = 0;
                System.out.println(opponent.name + " fainted");
            }
        }
    }
}
