package Artifacts;

import java.util.*;
import Model.*;

public class Weapon {

    public static Weapon weapon = new Weapon();

    public static String[] arms = {"Gun", "knife", "Bomb", "Sword"};

    public Weapon() {

    }

    public String getWeapon() {

        Random randomise = new Random();

        int randomisearms = randomise.nextInt(4);
        return arms[randomisearms];
    }
}