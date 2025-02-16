class Pikachu extends Pokemon {
    //Contructor for Pikachu
    public Pikachu(int level) {
        //call the superclass contructor
        super("Pikachu", level, "Electric", 30, 20, 15,
                20);
        addMove(new Move("Nuzzle", 40, "Electric"));
        addMove(new Move("Quick Attack", 30, "Normal"));
    }

    //Override the battlecry method for pikachu
    public void battleCry() {
        System.out.println(name + " says: Pika Pika!");
    }
}