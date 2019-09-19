package Model;


public class Enemy extends Character {

    public String name = "Zombie";
    private boolean alive = true;
    public char nameChar;
    public int xposition = 0;
    public int yposition = 0;
    public static int numOfMonsters = 0;

    public Enemy(int attack, int defense, int hit_points, String name) {

        this.hit_points = hit_points;
        this.defense = defense;
        this.attack = attack;

        Map map = new Map();

        int mxXspace = map.LengthX();
        int mxYspace = map.HeightY();


        int randX, randY;

        do {
            randX = (int) (Math.random() * mxXspace);
            randY = (int) (Math.random() * mxYspace);


        }while (map.FetchMap(randX, randY) != '*');

        this.xposition = randX;
        this.yposition = randY;

        this.nameChar = this.name.charAt(0);

        map.PutinMap(xposition, yposition, nameChar);

        numOfMonsters++;
    }

    @Override
    public void setHit_points(int hit_points){
        this.hit_points = hit_points;
    }

    @Override
    public int getHit_points(){
        return hit_points;
    }

    public boolean Death(){
        return hit_points <= 0;
    }

}
