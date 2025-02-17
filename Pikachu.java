public class Pikachu extends Codingmon {
    private String specialAbility;

    public Pikachu() {
        super("Pikachu", 100, 20);
        this.specialAbility = "Thunderbolt";
    }

    @Override
    public int attack(Codingmon target) {
        System.out.println("Pikachu used " + specialAbility + "!");
        return super.attack(target);
    }

    public void useSpecialAbility() {
        System.out.println("Pikachu used " + specialAbility + "! It's super effective!");
    }

    public String getSpecialAbility() {
        return specialAbility;
    }
}
