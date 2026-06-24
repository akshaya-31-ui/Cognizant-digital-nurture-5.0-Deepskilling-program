import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
public class OrderedServiceTest
{
    interface Step1Service
    {
        void doStep1();
    }
    interface Step2Service
    {
        void doStep2();
    }
    @Test
    public void testInteractionOrder()
    {
        Step1Service step1=mock(Step1Service.class);
        Step2Service step2=mock(Step2Service.class);
        step1.doStep1();
        step2.doStep2();
        InOrder inOrder=inOrder(step1, step2);
        inOrder.verify(step1).doStep1();
        inOrder.verify(step2).doStep2();
    }
}