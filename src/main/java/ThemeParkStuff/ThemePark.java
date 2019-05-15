package ThemeParkStuff;

import Attractions.Dodgems;
import Attractions.Park;
import Attractions.Playground;
import Attractions.RollerCoaster;

import Interfaces.IReviewed;
import Stalls.CandyFloss;
import Stalls.IceCream;
import Stalls.Tobacco;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> allReviewed;

    public ThemePark(String name, ArrayList<IReviewed> allReviewed) {
        this.name = name;
        this.allReviewed = allReviewed;
    }

    public String getName() {
        return name;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return allReviewed;
    }

    public void addReviewed(IReviewed outlet){
        allReviewed.add(outlet);
    }

    public int getAllReviewedCount(){
        return allReviewed.size();
    }
}
