package Model;

import Artifacts.*;
import Controller.*;
import Factory.HeroFactory;
import View.Achieve;

import java.util.*;

public class ExistingHeroes {


    public static void _typeofHero()
    {


        Weapon weapon = new Weapon();
        Armor armor = new Armor();


        SaveInfo.Openfile();
        List<String[]> heroList = SaveInfo.getListofHeroes();
        int index = 1;

        for(String[] heroStat: heroList) {
            System.out.println(index + ". " + heroStat[1]);
            index++;
        }

        int chooseHero;
        chooseHero = checkintstr.CheckInt("What are you waiting for? : ");
        chooseHero--;

        String[] heroStat = heroList.get(chooseHero);

        SaveInfo.closefile();

        Hero hero = HeroFactory.createHero(heroStat[1].trim(), heroStat[0].trim());

        int choose;
        System.out.println("\n");
        System.out.println("1.Start Game");
        System.out.println("2.Exit");
        choose = checkintstr.CheckInt("choose from the above : ");

        switch (choose) {
            case 1:
                System.out.println("\n##########START GAME###########\n");
                Achieve.achieveUp(hero);

            case 2:
                break;
            default:
                System.out.println("Invalid selection");
                break;
        }
    }

}
