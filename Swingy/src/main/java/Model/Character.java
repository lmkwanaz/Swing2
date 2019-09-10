package Model;

public class Character {
    private int Id;
    private boolean alive;
    protected int attack;
    protected int defense;
    protected int hit_points;

    public int getId(){ return this.Id; }
    public  void setId(int Id){ this.Id = Id; }
    public boolean getAlive(){ return this.alive; }
    public void setAlive(boolean live){ this.alive = alive; }
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
