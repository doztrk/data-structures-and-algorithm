package ds_and_algorithm;

public class LinearSearch {
    public static void main(String[] args) {
        //Linear Search - Iterate through an element one at a time
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        int index = linearSearch(array, 1);
        if (index != -1){
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
