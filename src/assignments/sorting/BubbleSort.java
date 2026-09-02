package assignments.sorting;
/**
 * 
 * Swap adjacent elements over and over until the whole array is sorted.
 * 
 */
public class BubbleSort extends SortingAlgorithm {
    /**
     * Sort an array in-place using Bubble Sort
     * 
     * Post-condition: arrary is sorted in ascending order
     * 
     * @param array an array of integers
     * 
     * 
     */
    public void sort(Integer[] array) {
        for (int k = array.length; k >= 2; k --) {    // k is the length of the sub-array we are looping through in the inner loop
            for (int i = 0; i < k-1; i++) { //go up to k-1 bec
                if (array[i] > array[i+1]) {
                    // swap adjacent items (i and i+1)
                    swap(array, i, i+1);
                }
            }
        }
    }
    /**
     * swap two elements within an array
     * @param array the array to swap values in
     * @param i the first index to swap
     * @param j the second index to swap
     */
    private void swap(Integer[] array, int i, int j) {
        Integer temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    /**
     * 
     * @param args command-line args
     */
    public static void main(String[] args) {
        SortingAlgorithm.validate(new BubbleSort());
        System.out.println("BubbleSort has passed all tests.");

        // fill an array with random numbers

        int N = 6234;
        Integer[] array = new Integer[N];
        for (int i = 0; i < array.length; i ++) {
            array[i] = (int)(N*Math.random());
        }

        // Measuring runtime
        SortingAlgorithm sorter = new BubbleSort();
        long start = System.nanoTime();
        sorter.sort(array);
        long end = System.nanoTime();
        double duration = (end - start)/(1e9);

        System.out.println("Array size: "+N);
        System.out.println("Total duration: "+duration);
    }

}
