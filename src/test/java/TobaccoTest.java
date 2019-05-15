import Stalls.Tobacco;
import ThemeParkStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoTest {

    Tobacco tobacco;
    Visitor visitor1, visitor2;

    @Before
    public void before(){
        tobacco = new Tobacco("VapeCentral", "Grint", 5, 5);
        visitor1 = new Visitor(12, 120, 30 );
        visitor2 = new Visitor(33, 180, 30 );
    }

    @Test
    public void checkVisitorAllowedAccess(){
        assertEquals(false, tobacco.isAllowedTo(visitor1));
        assertEquals(true, tobacco.isAllowedTo(visitor2));
    }

    @Test
    public void checkGetRating(){
        assertEquals(5, tobacco.getRating());
    }


}
