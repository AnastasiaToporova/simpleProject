import org.junit.Assert;
import org.junit.Test;

public class BaseTests {
    Calculating cal = new Calculating();

    @Test
    public void checkSum() {
        Assert.assertEquals(cal.SumNumber(2, 5), 7);
    }
    @Test
    public void checkSumNegative() {
        Assert.assertNotEquals(cal.SumNumber(2, 5), 8);
    }
}
