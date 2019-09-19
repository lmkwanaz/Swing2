package Model;

public class Badman extends Hero{
    public Badman(String name) {
        super(name);
        setName(name);
        setType("Badman");
        setLevel(40);
        setAttack(40);
        setDefense(40);
        setExperience(80);
        setHit_points(40);

    }
}