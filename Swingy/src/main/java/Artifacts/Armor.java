package Artifacts;

import java.util.*;
import  Model.*;

public class Armor {

    public static Armor armor = new Armor();

    public static String[] fight = {"black jacket", "black gloves", "mask"};

    public Armor() {

    }

    public String getArmor(Hero hero) {

        Random randomise = new Random();

        int randomshield = randomise.nextInt(4);

        return fight[randomshield];
    }

}