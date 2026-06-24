import org.example.EvenChecker;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
@Suite
@SelectClasses({
        CalculatorTest.class,
        AssertionsTest.class,
        AdvancedCalculatorTest.class,
        EvenCheckerTest.class
})
public class AllTests{

}