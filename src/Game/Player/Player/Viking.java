package Game.Player.Player;

public class Viking extends Player{

        public Viking(){
            super(100,95,100, "Viking");
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