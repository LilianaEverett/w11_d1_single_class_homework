import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;
    private Printer printer2;

    @Before
    public void before(){
        printer = new Printer(20, 100);
        printer2 = new Printer(5, 100);
    }

    @Test
    public void hasPaperLeft(){
        assertEquals(20, printer.getPaperLeft());
    }

    @Test
    public void canPrintSeveralCopiesPerPage(){
        printer.print(3, 5);
        assertEquals(5, printer.getPaperLeft());
        assertEquals(15, printer.getPrintedDocs());
        assertEquals(85, printer.getToner());
    }

    @Test
    public void canNotPrintBecauseNotEnoughPaper(){
        printer2.print(3, 5);
        assertEquals(5, printer2.getPaperLeft());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }
}
