package Stalls;

import Interfaces.IReviewed;
import Interfaces.ISecurity;
import ThemeParkStuff.Visitor;

public class Tobacco extends Stall implements ISecurity {

    public Tobacco(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getAge() > 17;
    }


}
