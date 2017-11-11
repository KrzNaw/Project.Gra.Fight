package Game.Player.Player;

public class Samurai extends Player {

    public Samurai(){
        super(90,85,100, "Samurai");
    }

    @Override
    public String attack() {
        return "Zadaję " + getAttackPoints() + " punktów ataku";
    }

    @Override
    public String defend() {
        return "Obrona! " + getDeffencePoints() + " punktów obrony.";
    }
}
