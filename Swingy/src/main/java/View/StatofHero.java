package View;

import Model.*;
import Artifacts.*;

public class StatofHero {

    public static void printstatus(Hero hero) {
        Weapon weapon = new Weapon();
        Armor armor = new Armor();

        System.out.println("\n##########HERO STATS###########\n");
        System.out.println("Name :" + hero.getName() );
        System.out.println("Health :" + hero.getHit_points());
        System.out.println("Level :" + hero.getLevel());
        System.out.println("Attack :" + hero.getAttack());
        System.out.println("Defense :" + hero.getDefense());
        System.out.println("Weapon :" + weapon.getWeapon(hero));
        System.out.println("Armor :" + armor.getArmor(hero));
    }

}
