import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canDrinkAndReduceVolume(){
        bottle.drink();
        bottle.drink();
       assertEquals(80,bottle.getVolume());
    }

    @Test
    public void canEmptyBottle(){
        assertEquals(0, bottle.empty());
    }

    @Test
    public void canRefillBottle(){
        assertEquals(100, bottle.refill());
    }
}
