package Controller;

import Model.*;
import Artifacts.*;



public class HeroType {

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

    public void HeroExists() {

        Weapon weapon = new Weapon();
        Armor armor = new Armor();
//		int i = 1;

        //to be used...
        //Storage.openfile
        //List<String[]> listofheroes = Storage.getherolist();
        //for(String[] statofhero : listofheroes) {
        //	System.out.println(i +". "+ statofhero[1]);
        //i++;
        //}
    }

}
