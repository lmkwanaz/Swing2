package View;

import Model.*;

public class War {

    private final Hero hero;
    private final Enemy enemy;

    public War(Hero hero, Enemy enemy) {
        this.hero = hero;
        this.enemy = enemy;
    }

    public void Fight() {
        Attack fight = new Attack();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("There's a DELAY!");
        }

        while (!enemy.Death() && !hero.Death())
        {
            fight.attacks(hero, enemy);
        }
        if (enemy.Death()){
            System.out.println("Enemy is dead!");
            victory();
            return;
        }

        else if (hero.Death()){
            System.out.println("You are dead!");
            defeat();
            return;
        }

    }

    private void victory() {
        System.out.println("You are a warrior.");
        System.out.println("You Have leveled up.." );
        System.out.println("LEVEL : " + hero.getLevel() + " Experience : " + hero.getExperience()+1 + "\n");
    }

    private void defeat() {
        System.out.println("You are not that bad!.");
        System.out.println("########## GAME OVER ###########\n");
        System.exit(0);
    }

}
