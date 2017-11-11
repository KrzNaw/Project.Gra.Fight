package Game.Player.Player;

public class Knight extends Player{

        public Knight(){
            super(110,100, 100, "Knight");
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
