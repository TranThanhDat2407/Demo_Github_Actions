import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2,calculator.sum(1,1));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(0,calculator.sub(1,1));
    }
}
