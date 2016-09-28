import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fenji on 9/27/2016.
 */
public class BaseSorterTest {

    BaseSorter baseSorter = new BubbleSort();

    private void assert3ElementOrder(int[] numArray) {
        assertEquals(5, numArray[0]);
        assertEquals(7, numArray[1]);
        assertEquals(19, numArray[2]);
    }



    @Test
    public void bubbleSort3ElementArray() throws Exception {
        int[] orderedArray = {5, 7, 19};
        baseSorter.sort(orderedArray);
        assert3ElementOrder(orderedArray);

        int[] scrambledArray1 = {5, 19, 7};
        baseSorter.sort(scrambledArray1);
        assert3ElementOrder(scrambledArray1);

        int[] scrambledArray2 = {7, 5, 19};
        baseSorter.sort(scrambledArray2);
        assert3ElementOrder(scrambledArray2);

        int[] scrambledArray3 = {7, 19, 5};
        baseSorter.sort(scrambledArray3);
        assert3ElementOrder(scrambledArray3);

        int[] scrambledArray4 = {19, 7, 5};
        baseSorter.sort(scrambledArray4);
        assert3ElementOrder(scrambledArray4);

        int[] scrambledArray5 = {19, 5, 7};
        baseSorter.sort(scrambledArray5);
        assert3ElementOrder(scrambledArray5);
    }


}