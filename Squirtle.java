class Squirtle extends Pokemon {
    //Contructor for Squirtle
    public Squirtle(int level) {
        //call the superclass contructor
        super("Squirtle", level, "Water", 30, 20, 25,
                15);
        addMove(new Move("Tackle", 30, "Normal"));
        addMove(new Move("Water Gun", 45, "Water"));
    }

    //Override the battlecry method for pikachu
    public void battleCry() {
        System.out.println(name + " says: squirlte!");
    }
}