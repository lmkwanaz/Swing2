package Model;

public class Badman extends Hero{
    public Badman(String name) {
        super(name);
        setName(name);
        setType("Badman");
        setLevel(50);
        setAttack(50);
        setDefense(50);
        setExperience(50);
        setHit_points(50);

    }
}