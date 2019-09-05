package Factory;

import Model.Badman;
import Model.Blackpanther;
import Model.CaptainAmerica;
import Model.Hero;
import Model.Spiderman;

public class HeroFactory {
    public static Hero createHero(String type, String name) {
        if(type.equalsIgnoreCase("Badman")) {
            return new Badman(name);
        }else if(type.equalsIgnoreCase("Blackpanther")){
            return new Blackpanther(name);
        }else if(type.equalsIgnoreCase("Spiderman")) {
            return new Spiderman(name);
        }else if(type.equalsIgnoreCase("CaptainAmerica")) {
            return new CaptainAmerica("CaptainAmerica ");
        }else {
            return null;
        }
    }
}
