/**
 * Created by fenji on 9/27/2016.
 */
public class BubbleSort extends BaseSorter {
    public void sort(int[] arrayToSort){
        long startTime = System.currentTimeMillis();
        int initialMax = arrayToSort.length;
        for (int currentMax = initialMax; currentMax >= 0; currentMax--) {
            for (int counter = 0; counter < currentMax - 1; counter++) {
                if (arrayToSort[counter] > arrayToSort[counter + 1]) {
                    swapNumbers(counter, counter + 1, arrayToSort);
                }
            }
            printNumbers(arrayToSort);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
