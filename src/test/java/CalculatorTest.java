import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(8, calc.add(5, 3));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    public void canMultiply(){
        assertEquals(15, calc.multiply(5, 3));
    }

    @Test
    public void canDivide(){
        assertEquals(1.66, calc.divide(5, 3), 0.01);
    }

}
