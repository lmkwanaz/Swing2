package Model;

public class Character {
    protected int attack;
    protected int defense;
    protected int hit_points;

    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public int getHit_points() {
        return hit_points;
    }
    public void setHit_points(int hit_points) {
        this.hit_points = hit_points;
    }
}
