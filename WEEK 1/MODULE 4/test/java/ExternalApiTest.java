import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ExternalApiTest
{
    @Test
    public void testMultipleConsecutiveCalls()
    {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData())
                .thenReturn("First Call")
                .thenReturn("Second Call")
                .thenReturn("Third Call");
        MyService service=new MyService(mockApi);
        assertEquals("First Call",service.fetchData());
        assertEquals("Second Call",service.fetchData());
        assertEquals("Third Call",service.fetchData());
        assertEquals("Third Call",service.fetchData());
    }
}