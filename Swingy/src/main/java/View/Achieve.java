package View;

import  Model.*;

public class Achieve {

    public static void achieveUp(Hero hero){

        if (hero.getExperience() <= 100 ){
            Map.buildMap();

            Enemy[] enemy = new Enemy[4];

            for (int i = 0; i < 4; i++) {
                enemy[i] = new Enemy(30,5,40,"zombie");
            }
            hero.player_Hero();

            while (true)
            {
                Map.rawMap();
                int move;
                System.out.println("\n");
                System.out.println("1.North");
                System.out.println("2.East");
                System.out.println("3.South");
                System.out.println("4.West");
                move = checkintstr.CheckInt("Choose where to go : ");

                hero.moveHero(hero, move);

            }

        }else if (hero.getExperience() > 100 ){

            Map.buildMap();
            Enemy[] enemy = new Enemy[8];

            for (int i = 0; i < 8; i++) {
                enemy[i] = new Enemy(60,20,40,"zombie");

            }
            hero.player_Hero();

            while (true)
            {
                Map.rawMap();
                int move;
                System.out.println("\n");
                System.out.println("1.North");
                System.out.println("2.East");
                System.out.println("3.South");
                System.out.println("4.West");
                move = checkintstr.CheckInt("chose where to go! : ");

                hero.moveHero(hero, move);

            }

        }else if (hero.getExperience() < 200 ){
            Map.buildMap();
            Enemy[] enemy = new Enemy[12];

            for (int i = 0; i < 12; i++) {
                enemy[i] = new Enemy(70,30,60,"zombie");
            }
            hero.player_Hero();

            while (true)
            {
                Map.rawMap();
                int move;
                System.out.println("\n");
                System.out.println("1.North");
                System.out.println("2.East");
                System.out.println("3.South");
                System.out.println("4.West");
                move = checkintstr.CheckInt("choose where to go! : ");

                hero.moveHero(hero, move);

            }

        }else if (hero.getExperience() >= 200){
            Map.buildMap();
            Enemy[] enemy = new Enemy[16];

            for (int i = 0; i < 16; i++) {
                enemy[i] = new Enemy(100,60,90,"zombie");

            }
            hero.player_Hero();

            while (true)
            {
                Map.rawMap();
                int move;
                System.out.println("\n");
                System.out.println("1.North");
                System.out.println("2.East");
                System.out.println("3.South");
                System.out.println("4.West");
                move = checkintstr.CheckInt("choose where to go! : ");

                hero.moveHero(hero, move);

            }

        }else if (hero.getExperience() < 0){
            Map.buildMap();
            Enemy[] enemy = new Enemy[20];

            for (int i = 0; i < 20; i++) {
                enemy[i] = new Enemy(150,90,100,"zombie");
            }
            hero.player_Hero();

            while (true)
            {
                Map.rawMap();
                int move;
                System.out.println("\n");
                System.out.println("1.North");
                System.out.println("2.East");
                System.out.println("3.South");
                System.out.println("4.West");
                move = checkintstr.CheckInt("choose where to go : ");

                hero.moveHero(hero, move);

            }

        }
    }
}
