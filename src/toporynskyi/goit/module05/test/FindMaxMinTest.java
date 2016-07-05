package toporynskyi.goit.module05.test;

import org.junit.BeforeClass;
import org.junit.Test;
import toporynskyi.goit.module05.maxminArray.FindMaxMin;

import static org.junit.Assert.*;

/**
 * Created by grant on 7/5/16.
 */
public class FindMaxMinTest {
    private static int[] array;

    @BeforeClass
    public static void setValue() throws Exception {
        array = new int[] {13, 5, 6, 15, 20, 2, 55, 7};
    }

    @Test(timeout = 1000)
    public void testFindMin() throws Exception {
        int min = 2;
        assertEquals(min, FindMaxMin.findMinElement(array));
    }

    @Test(timeout = 1000)
    public void testFindMax() throws Exception {
        int max = 55;
        assertEquals(max, FindMaxMin.findMaxElement(array));
    }
}