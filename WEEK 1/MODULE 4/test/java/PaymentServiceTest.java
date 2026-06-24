import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PaymentServiceTest
{
    @Test
    public void testArgumentMatching_AnyValue()
    {
        PaymentApi mockApi=mock(PaymentApi.class);
        when(mockApi.processPayment(anyString(),anyDouble())).thenReturn(true);
        PaymentService service = new PaymentService(mockApi);
        boolean result = service.makePayment("1234-5678-9999",500.0);
        assertTrue(result);
        verify(mockApi).processPayment(anyString(),anyDouble());
    }
    @Test
    public void testArgumentMatching_ExactValue()
    {
        PaymentApi mockApi = mock(PaymentApi.class);
        when(mockApi.processPayment(eq("1111-2222-3333"),anyDouble())).thenReturn(true);
        PaymentService service = new PaymentService(mockApi);
        boolean result = service.makePayment("1111-2222-3333",999.0);
        assertTrue(result);
        verify(mockApi).processPayment(eq("1111-2222-3333"),anyDouble());
    }
}