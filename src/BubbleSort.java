/**
 * Created by pinaki on 9/25/2016.
 */
public class BubbleSort {
    public static void main (String [] args) {

        int [] unsortedArray = {5,1,6,2,4,3};
        int arrayLen= unsortedArray.length;
        System.out.println("This is my unsorted array");

        for(int i=0; i<arrayLen; i++){
            System.out.println(unsortedArray[i]);
        }

        //System.out.println("\nNow I am going to sort");
        int [] sortedArray = bubbleSort(unsortedArray);

        System.out.println("\nOK so here is my sortedArray:");
        for (int i=0; i<arrayLen; i++){
            System.out.println(sortedArray[i]);
        }


    }


    private static int [] bubbleSort (int [] unsortedArray){

        boolean sorted = false;

            while (!sorted) {
                sorted=true;
                for (int i = 0; i < (unsortedArray.length-1); i++) {
                    if (unsortedArray[i + 1] < unsortedArray[i]) {
                        sorted = false;
                        int temp = unsortedArray[i];
                        unsortedArray[i] = unsortedArray[i + 1];
                        unsortedArray[i + 1] = temp;
                    }
                }

            }
       return unsortedArray;

    }
}
