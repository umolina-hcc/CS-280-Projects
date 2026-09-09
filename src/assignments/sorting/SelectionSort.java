package assignments.sorting;
/**
 * Picking out the smallest element one by one
 */

public class SelectionSort extends SortingAlgorithm<Integer> {
    /**
     * 
     * Sort an array using Insertion Sort
     * 
     * Post-condition: Array is sorted in ascending order
     * 
     */

    public void sort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) { // Elements before i is in final position
            int smallestIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            // moving the smallest value in the next sorted position
            Integer temporary = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temporary;

        }
    }
    

    public static void main (String[] args) {
        SortingAlgorithm.validate(new SelectionSort());
        System.out.println("SelectionSort has passed all tests.");
    }
}
