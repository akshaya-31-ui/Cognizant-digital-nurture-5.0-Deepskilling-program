import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
public class AdvancedCalculatorTest
{
    private Calculator cal;
    @Before
    public void setUp()
    {
        cal=new Calculator();
        System.out.println("SetUp:Calculator initialized");
    }
    @Test
    public void testSubtractionWithAAA()
    {
        int a=20;
        int b=8;
        int res=cal.subtract(a,b);
        assertEquals(12,res);
    }
}