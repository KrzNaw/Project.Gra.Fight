package Game.Player.Player;

import java.util.List;

public class Player {

    private int attackPoints;
    private int deffencePoints;
    private int healthPoints;
    private String playerName;

    public Player(){}

    public Player(int attackPoints , int defendPoints, int healthPoints, String playerName) {
        this.attackPoints = attackPoints;
        this.deffencePoints = defendPoints;
        this.healthPoints = healthPoints;
        this.playerName = playerName;
    }



    public String attack (){
        return String.valueOf(attackPoints);
    }

    public String defend (){
        return String.valueOf(deffencePoints);
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public void setDeffencePoints(int deffencePoints) {
        this.deffencePoints = deffencePoints;
    }

    public double getHealthPoints() {

        return healthPoints;
    }

    public Player drawPlayer(List<Player> players){
        players.add(new Knight());
        players.add(new Roman());
        players.add(new Samurai());
        players.add(new Spartan());
        players.add(new Viking());
        int index = (int)Math.random()*players.size();
        return players.get(index);

    }

    @Override
    public String toString() {
        return "Player{ " + playerName +
                ", attackPoints= " + attackPoints +
                ", deffencePoints= " + deffencePoints +
                ", healthPoints= " + healthPoints +
                '}';
    }

    public double getAttackPoints() {
        return attackPoints;
    }

    public double getDeffencePoints() {
        return deffencePoints;
    }


}
