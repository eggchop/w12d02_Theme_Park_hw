import Attractions.RollerCoaster;
import ThemeParkStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {


    RollerCoaster rollerCoaster;
    ThemeParkStuff.Visitor visitor1, visitor2;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Crazy Looper", 10);
        visitor1 = new Visitor(12, 120, 30 );
        visitor2 = new Visitor(33, 180, 30 );
    }

    @Test
    public void checkVisitorIsAllowedAccess(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));

    }
}