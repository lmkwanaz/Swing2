package View;

import Model.*;

public class LetFight {

    public static void FigthWar(Hero hero) {

        System.out.println("You Have came across an Enemy ");
        int select;
        System.out.println("1.Fight");
        System.out.println("2.Run");
        select = checkintstr.CheckInt("choose from above : ");
        Enemy enemy = new Enemy(50, 50, 60, "Zombie");

        War game = new War(hero, enemy);

        if (select == 1) {
            game.Fight();
        }
        else if (select == 2)
            System.out.println("Your are a Coward, you chose to run!!");
        else
            System.out.println("Invalid entery!!");

    }

}
