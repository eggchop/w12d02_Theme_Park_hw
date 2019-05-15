package Attractions;

import Interfaces.ISecurity;
import ThemeParkStuff.Visitor;

public class RollerCoaster extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getHeight() > 144;
    }
}
