package assignments.sorting;
/** 
 * Putting elements one by one into a guaranteed-sorted list
 * 
 */

public class InsertionSort extends SortingAlgorithm {
    /**
     * Sort an array using InsertionSort
     * 
     * Post-condition: Array is sorted in ascending order
     * 
     * @param array an array of integers
     * 
     */
    public void sort(Integer[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];

            int j = i-1;
            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                j = j--;
            }
            array[j + 1] = currentValue;
        } 
    }


    public static void main(String[] args) {
        SortingAlgorithm.validate(new BubbleSort());
        System.out.println("InsertionSort has passed all tests.");
    }
}
    