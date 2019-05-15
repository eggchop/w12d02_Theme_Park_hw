import Attractions.Playground;
import ThemeParkStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {


    Attractions.Playground playground;
    ThemeParkStuff.Visitor visitor1, visitor2;

    @Before
    public void before(){
        playground = new Playground("Pokemon Playground", 7);
        visitor1 = new Visitor(12, 120, 30 );
        visitor2 = new Visitor(33, 180, 30 );
    }

    @Test
    public void checkVisitorIsAllowedAccess(){
        assertEquals(true, playground.isAllowedTo(visitor1));
        assertEquals(false, playground.isAllowedTo(visitor2));

    }
}
