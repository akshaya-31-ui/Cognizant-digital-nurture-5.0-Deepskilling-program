import org.example.EvenChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
public class EvenCheckerTest
{
    EvenChecker even=new EvenChecker();
    @ParameterizedTest
    @ValueSource(ints={2,4,6,8,100})
    public void testIsEven(int num)
    {
        assertTrue(even.isEven(num));
    }
}