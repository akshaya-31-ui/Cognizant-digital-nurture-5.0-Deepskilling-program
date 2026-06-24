import org.example.PerformanceTester;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeout;
public class PerfoemanceTesterTest
{
    @Test
    public void testTaskPerformance()
    {
        PerformanceTester tester=new PerformanceTester();
        assertTimeout(Duration.ofSeconds(1),()->{
            tester.performTask();
        });
    }
}