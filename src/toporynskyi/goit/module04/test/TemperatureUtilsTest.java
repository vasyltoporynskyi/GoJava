package toporynskyi.goit.module04.test;

import org.junit.Assert;
import org.junit.Test;
import toporynskyi.goit.module04.tempConverter.TemperatureUtils;

import static org.junit.Assert.*;

/**
 * Created by grant on 7/1/16.
 */
public class TemperatureUtilsTest {
    @Test
    public void main() throws Exception {
        double cTemp = 30.0;
        double fTemp;

        fTemp = cTemp * 9/5 + 32;
        cTemp = ((fTemp - 32) * 5/9);

        final double result = fTemp;
        Assert.assertEquals(86.0, result, 0);
    }

}