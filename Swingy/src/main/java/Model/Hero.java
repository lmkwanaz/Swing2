package Model;

import Artifacts.Armor;
import Artifacts.Weapon;
import View.LetFight;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//import com.sun.istack.internal.NotNull;


public class Hero extends Character {

    @NotNull
    @Size(min = 2, max = 20)

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

    protected char PlayerCharacter;
    protected int numOfMonsters = 0;

    @NotNull
    @Size(min = 2, max = 20)

    protected Hero(String name){
        this.name = name;
        this.experience = experience;
    }

    public void player_Hero() {
        Map map = new Map();

        int mxXspace = map.LengthX();
        int mxYspace = map.HeightY();


        int randX, randY;

        do {
            randX = mxXspace / 2;
            randY = mxYspace / 2;


        }while (map.FetchMap(randX, randY) != '*');

        this.exes = randX;
        this.y_exes = randY;

        this.PlayerCharacter = this.name.charAt(0);

        map.PutinMap(exes, y_exes, PlayerCharacter);

    }



    public void moveHero(Hero hero, int item) {
        Map map = new Map();

        int mxXBoardSpace = map.LengthX();
        int mxYBoardSpace = map.HeightY();


        map.PutinMap(exes, y_exes, PlayerCharacter);


        if (item == 1)
        {
            if ((y_exes - 1) > 0)
            {
                if (map.FetchMap(exes, y_exes- 1) != '*')
                    LetFight.FigthWar(hero);
                y_exes = y_exes - 1;
            }
            else {
                y_exes = y_exes - 1;
                System.out.println("You Have Won!");
            }
        }
        else if (item == 2)
        {

            if ((exes + 1) < mxXBoardSpace)
            {
                if (map.FetchMap(exes + 1, y_exes) != '*')
                    LetFight.FigthWar(hero);
                exes = exes + 1;
            }
            else{
                exes = exes + 1;
                System.out.println("You Have Won!");
            }
        }
        else if (item == 3)
        {
            if ((y_exes + 1) < mxYBoardSpace)
            {
                if (map.FetchMap(exes, y_exes + 1) != '*')
                    LetFight.FigthWar(hero);
                y_exes = y_exes + 1;
            }
            else {
                y_exes= y_exes + 1;
                System.out.println("You Have Won!");
            }
        }
        else if (item == 4)
        {
            if ((exes - 1) > 0)
            {
                if (map.FetchMap(exes - 1, y_exes) != '*')
                   LetFight.FigthWar(hero);
                exes = exes - 1;
            }
            else {
                exes = exes - 1;
                System.out.println("You Have Won!");
            }
        }
        map.ChangeMap(exes, y_exes, PlayerCharacter);

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
        return level++;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getExperience() {
        return experience++;
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
