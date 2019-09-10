package View;

import  java.util.*;
import Factory.*;
import Controller.*;
import Model.*;
import Artifacts.*;
import View.*;

public class Attack {
    private int res;
    private int heroes;
    private int enemies;

    Random randomiseattack = new Random();

    public void attacks(Hero hero, Enemy enemy) {
        res = randomiseattack.nextInt(2);
        Weapon weapon = new Weapon();

        if (res == 0) {
            if (enemy.getDefense() < hero.getAttack()){
                enemies = enemy.getDefense() - hero.getAttack();
                enemy.setHit_points(enemy.getHit_points() + enemies);
                if (enemy.getHit_points() == 0){
                    hero.setExperience(hero.getExperience() + 1000);
                    hero.setLevel(hero.getLevel() + 1);
                }
            }
            System.out.println(hero.getName() + " has attacked with " + hero.getAttack() + " points using a " + weapon.getWeapon(hero) + " Enemy is left with " + enemy.getHit_points() + " Health");
        }else {
            if (hero.getDefense() < enemy.getAttack()){
                heroes = hero.getDefense() - enemy.getAttack();
                hero.setHit_points(hero.getHit_points() + heroes);
            }
            System.out.println("Enemy has attacked with " + enemy.getAttack() + " and dealt " + heroes + " damage " + hero.getName() + " is left with " + hero.getHit_points() + " Health");
        }
    }
}
