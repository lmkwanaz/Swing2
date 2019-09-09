package Controller;

import java.util.Scanner;

import Factory.HeroFactory;

import Artifacts.*;
//import View.Map;
//import util.WriteFile;
import Model.*;
import Controller.*;
import View.ViewStatus;

public class Main {
    static Scanner scan = new Scanner(System.in);
    	static String name;
    static int selected;
    static int heroes;
    //static int select;

    public static void prestart(Hero hero){
        Scanner start = new Scanner(System.in);
        int put;
        System.out.println("1.would you like to start");
        System.out.println("2.exit");
        put = checkintstr.CheckInt("choose");

        switch(put){
            case 1:
                //Level.levelUp(hero);
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("invalid input");
                break;
        }

    }

    public static String selectHero(int type){

        switch (type){
            case 1:
                return "Badman";
            case 2:
                return "Blackpanther";
            case 3:
                return "Spiderman";
            case 4:
                return "CaptainAmerica";
            default:
        }
        return null;
    }



    public static void main(String[] args) {
        System.out.println("Welcome");

        System.out.println("1.DO you want to create a hero");
        System.out.println("2.select from existing heroes");
        int select = scan.nextInt();

        switch(select){
            case 1:
                System.out.println("Create a Hero");
                System.out.println("enter your name");
                Scanner putname = new Scanner(System.in);
                name = putname.nextLine();

                if(name == null){
                    System.out.println("Don't leave this field empty");
                    System.exit(0);
                }else{
                    System.out.println(name +" Select a Hero");
                    System.out.println("1.Badman");
                    System.out.println("2.Blackpanther");
                    System.out.println("3.Spiderman");
                    System.out.println("4.CaptainAmerica");
                    System.out.println("5.exit");
                    //Scanner selecthero = new Scanner(System.in);
                    int selectplayertype = checkintstr.CheckInt("What are you waiting for???"+"\n");
                    //int readytoselect = checkintstr.CheckInt();
                    String storeplayertype;
                    String savestrinfo;

                    storeplayertype	= selectHero(selectplayertype);
                    if(storeplayertype.equals("5")){
                        System.exit(0);
                    }

                    Weapon weapon = new Weapon();
                    Armor armor = new Armor();

                    Hero hero = HeroFactory.createHero(storeplayertype, name);

                    ViewStatus.printstatus(hero);
                    SaveInfo.Openfile();
                    savestrinfo = hero.getType() +","+ hero.getName() +","+ hero.getLevel() +
                            ","+hero.getAttack() +","+ hero.getHit_points();

                    SaveInfo.writeToFile(savestrinfo);
                    SaveInfo.closefile();
                    
                    Main.prestart(hero);
                }
        }
    }
}