class Bulbasuar extends Pokemon {
    //Contructor for Bulbasuar
    public Bulbasuar(int level) {
        //call the superclass contructor
        super("Bulbasuar", level, "Grass", 22,22,24,
                22);
        addMove(new Move("Tackle", 30, "Normal"));
        addMove(new Move("Vine Whip", 45, "Grass"));
    }

    //Override the battlecry method for Bulbasuar
    public void battleCry() {
        System.out.println(name + " says: Bulbasuar!");
    }
}
