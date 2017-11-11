package Game.Player;


import Game.Player.Defence.BreastPlate;
import Game.Player.Defence.ChainMail;
import Game.Player.Defence.Defence;
import Game.Player.Player.Knight;
import Game.Player.Player.Player;
import Game.Player.Player.Samurai;
import Game.Player.Weapon.LightSword;
import Game.Player.Weapon.Sword;
import Game.Player.Weapon.Weapon;

public class TestGame {
    public static void main(String[] args) {

//Player p = new Player();
Player p = new Knight();
//Player e = new Player();
Player e = new Samurai();

Weapon pw = new Sword();
Weapon ew = new LightSword();

Defence d1 = new BreastPlate();
Defence d2 = new ChainMail();


//p.drawPlayer();
  //          System.out.println(p.toString());



double pAttackForce = (p.getAttackPoints() + pw.getWeaponAttackPoints());
        System.out.println(p.toString() + "Player attack force: " + pAttackForce);

        double pDefencePoints = (p.getDeffencePoints() + p.getHealthPoints() + d1.getDefenceDefendPoints());
        System.out.println("Player defence: " + pDefencePoints);


double eAttackForce = (e.getAttackPoints() + ew.getWeaponAttackPoints());
        System.out.println(e.toString() + "Enemy attack force: " + eAttackForce);


        double eDefencePoints = (e.getDeffencePoints() + e.getHealthPoints() + d2.getDefenceDefendPoints());
        System.out.println("Enemy defence: " + eDefencePoints);

double pAttacks = (eDefencePoints - pAttackForce);
        System.out.println(pAttacks);

        double eAttacks = (pDefencePoints - eAttackForce);
        System.out.println(eAttacks);



        }
    }
