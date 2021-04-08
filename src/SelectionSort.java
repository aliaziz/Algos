public class SelectionSort {
    /**
     * Selection sort
     *
     * @param arr
     * @return
     */
    public static int[] selectionSort(int[] arr) {
        if (arr.length < 1) return arr;

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
