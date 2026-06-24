import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
public class NotificationServiceTest
{
    @Test
    public void testVoidMethod()
    {
        EmailService mockEmailService=mock(EmailService.class);
        doNothing().when(mockEmailService).sendEmail(anyString(), anyString());
        NotificationService service=new NotificationService(mockEmailService);
        service.notifyUser("user@test.com","Hello");
        verify(mockEmailService).sendEmail("user@test.com", "Hello");
    }
}