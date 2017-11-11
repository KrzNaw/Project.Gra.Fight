package Game.Player.Player;


public class Roman extends Player {

    public Roman(){super(90,95, 100, "Roman");}

    @Override
    public String attack() {
        return "Zadaję " + getAttackPoints() + " punktów ataku";
    }

    @Override
    public String defend() {
        return "Obrona! " + getDeffencePoints() + " punktów obrony.";
    }
}
