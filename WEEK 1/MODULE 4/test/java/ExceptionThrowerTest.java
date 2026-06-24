import org.junit.jupiter.api.Test;
import org.example.ExceptionThrower;
import static org.junit.jupiter.api.Assertions.*;
public class ExceptionThrowerTest
{
    ExceptionThrower thrower=new ExceptionThrower();
    @Test
    public void testExceptionIsThrown()
    {
        assertThrows(IllegalArgumentException.class,()->{
            thrower.throwException(-5);
        });
    }
}