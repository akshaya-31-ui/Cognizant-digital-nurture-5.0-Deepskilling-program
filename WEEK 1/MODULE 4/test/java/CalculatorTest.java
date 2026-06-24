import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest
{
    @Test
    public void testAdd()
    {
        Calculator cal=new Calculator();
        int result=cal.add(10,5);
        assertEquals(15,result);
    }
}