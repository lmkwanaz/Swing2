package Controller;

import java.util.Scanner;

import Factory.HeroFactory;
//import View.Map;
//import util.WriteFile;
import Model.Hero;
import Model.Badman;
import Model.Spiderman;
import Model.CaptainAmerica;
import Model.Blackpanther;

public class Main {
    static Scanner scan = new Scanner(System.in);
    	static String name;
    static int selected;
    static int heroes;
    //static int select;

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
                    Scanner selecthero = new Scanner(System.in);
                    int selectplayer = selecthero.nextInt();
                    String storeplayer;

                    storeplayer	= selectHero(selectplayer);
                    

                    Hero hero = HeroFactory.createHero(storeplayer, name);
                }
        }
    }
}