package assignments.sorting;
/** 
 * Putting elements one by one into a guaranteed-sorted list
 * 
 */

public class InsertionSort<T extends Comparable<T>> extends SortingAlgorithm<Integer> {
    /**
     * Sort an array using InsertionSort
     * 
     * Post-condition: Array is sorted in ascending order
     */

    public void sort(Integer[] array) {
        for (int i = 1; i < array.length; i++) {  // elements before i is already sorted
            Integer value = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > value) { // shifting larger values to make room for value
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = value; // insert value in its sorted position
        }
    }

    public static void main(String[] args) {
        SortingAlgorithm.validate(new InsertionSort<Integer>());
        System.out.println("InsertionSort has passed all tests.");
    }
}
    