package toporynskyi.goit.module05.test;

import org.junit.Test;
import toporynskyi.goit.module05.arraySort.*;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by grant on 7/5/16.
 */
public class BubbleSortArrayTest {

        @Test(timeout = 1000)
        public void testSortSelect() throws Exception {
            int[] array = new int[] {13, 5, 6, 15, 20, 45, 55, 7};
            int[] sortArray = new int[] {5, 6, 7, 13, 15, 20, 45, 55};
            BubbleSortArray.bubbleSort(array);
            String strSortArray = Arrays.toString(sortArray);
            String strArray = Arrays.toString(array);
            assertEquals(strSortArray, strArray);
        }
}