package Game.Player.Weapon;

import java.util.List;

public class Weapon {

    private int weaponAttackPoints;

    public Weapon(){}

    public Weapon(int wAttackPoints) {
        this.weaponAttackPoints = wAttackPoints;
    }

   public Weapon weapons (List<Weapon> weapons){
        weapons.add(new Axe());
        weapons.add(new LightSword());
        weapons.add(new Pilum());
        weapons.add(new Spear());
        weapons.add(new Sword());
        int index = (int)Math.random()*weapons.size();
        return weapons.get(index);

        }




    public double getWeaponAttackPoints() {
        return weaponAttackPoints;
    }

    public void setWeaponAttackPoints(int weaponAttackPoints) {
        this.weaponAttackPoints = weaponAttackPoints;
    }
}
