package Model;

public class Enemy extends Character {

    public Enemy(int attack, int defense, int hit_points, String name) {
        this.attack = attack;
        this.defense = defense;
        this.hit_points = hit_points;
    }

    public void setHit_points(int hit_points){
        this.hit_points = hit_points;
    }

    public int getHit_points(){
        return hit_points;
    }

    public boolean YourDead(){
        return hit_points <= 0;
    }

    public boolean Death() {
        return hit_points <= 0;
    }

}
