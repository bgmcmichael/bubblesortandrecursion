import java.time.Instant;

/**
 * Created by fenji on 9/27/2016.
 */
public abstract class BaseSorter implements TIYSortable{

    public static void swapNumbers(int firstElement, int secondElement, int[] array) {

        int temp;
        temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }

    public static void printNumbers(int[] input) {

        for (int Counter = 0; Counter < input.length; Counter++) {
            System.out.print(input[Counter] + ", ");
        }
        System.out.println("\n");
    }
}
