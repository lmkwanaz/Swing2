package Model;

import Artifacts.Armor;
import Artifacts.Weapon;
//import com.sun.istack.internal.NotNull;


public class Hero extends Character {
    //@NotNull
    //@size(min = 2, max = 20);
    private int id;
    private String name;
    private int level;
    private int experience;
    private String type;
    protected int movement;
    public int exes;
    public int y_exes;
    private Weapon weapon;
    private Armor armor;

    protected Hero(String name){
        this.name = name;
        this.experience = experience;
    }

    public int getMovement(){ return this.movement; }
    public  void setMovement(int movement){ this.movement = movement; }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public boolean Death() {
        return hit_points <= 0;
    }
}
