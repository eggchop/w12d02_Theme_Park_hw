import Interfaces.IReviewed;
import ThemeParkStuff.ThemePark;
import Attractions.*;
import Stalls.*;
import org.junit.Before;
import org.junit.Test;
import sun.awt.datatransfer.ToolkitThreadBlockedHandler;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyFloss candyFloss;
    IceCream iceCream;
    Tobacco tobacco;
    ArrayList arrayList;

    @Before
    public void before() {
        dodgems = new Dodgems("dodgems", 3 );
        park = new Park("Playpark", 2);
        playground = new Playground("Playground", 1);
        rollerCoaster = new RollerCoaster("Wooo", 10);
        candyFloss = new CandyFloss("Candyfloss", "CandYum", 2, 5);
        iceCream = new IceCream("icecream", "Jo's Ice Cream", 1, 3);
        tobacco = new Tobacco("Tobacco","Grints Finest Vapefluid", 3,8);

        themePark = new ThemePark("Charlies Fun Palace", new ArrayList<IReviewed>());


    }

    @Test
    public void checkReturnArrayListIReviewed(){
        themePark.addReviewed(candyFloss);

        assertEquals(1, themePark.getAllReviewedCount());
    }

}
