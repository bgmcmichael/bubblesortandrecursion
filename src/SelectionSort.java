/**
 * Created by fenji on 9/28/2016.
 */
public class SelectionSort extends BaseSorter {
    @Override
    public void sort(int[] array) {
        int biggestNumLocation = 0;
        int biggestNum = 0;
        int nestedCounter = 0;
        for(int counter = 0; counter < array.length; counter++){
            for (nestedCounter = 0; nestedCounter < (array.length - counter); nestedCounter++){
                if(nestedCounter == 0){
                    biggestNum = array[nestedCounter];
                    biggestNumLocation = nestedCounter;
                } else if (array[nestedCounter] > biggestNum) {
                    biggestNumLocation = nestedCounter;
                    biggestNum = array[nestedCounter];
                }
            }
                swapNumbers(biggestNumLocation, (nestedCounter - 1), array);
                printNumbers(array);
        }
    }
}
