package Game.Player.Player;

public class Spartan extends Player{

    public Spartan(){
        super(95,90,100, "Spartan");
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
