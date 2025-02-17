class Charmander extends Pokemon {
    //Contructor for Charmander
    public Charmander(int level) {
        //call the superclass contructor
        super("Charmander", level, "Fire",39,43,39,
                65);
        addMove(new Move("Fire Fang", 45, "Fire"));
        addMove(new Move("Take Down", 30, "Normal"));
    }


    //Override the battlecry method for Charmander
    public void battleCry() {
        System.out.println(name + " says: CHARMANDER!");
    }
