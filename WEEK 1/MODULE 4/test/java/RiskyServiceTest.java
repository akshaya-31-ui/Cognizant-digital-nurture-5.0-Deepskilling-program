import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class RiskyServiceTest
{
    @Test
    public void testVoidMethod_ThrowsException()
    {
        RiskyService mockService=mock(RiskyService.class);
        doThrow(new RuntimeException("Something went wrong")).when(mockService).performRiskyAction();
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> mockService.performRiskyAction()
        );
        assertEquals("Something went wrong",exception.getMessage());
        verify(mockService).performRiskyAction();
    }
}