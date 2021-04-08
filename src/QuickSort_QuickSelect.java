import java.util.Arrays;

public class QuickSort_QuickSelect {

    public int quickSelect(int [] arr, int target) {
        return arr[quickSelect(arr, target, 0, arr.length - 1)];
    }

    private int quickSelect(int [] arr, int target, int lo, int hi) {
        int pivot = inPlacePartition(arr, lo, hi);
        //We subtract 1 from target because we are using  array indices. So 2 smallest would be
        // at position 1 in a sorted array.
        if(target - 1 < pivot) {
            return quickSelect(arr, target, lo, pivot - 1);
        } else if (target - 1 > pivot) {
            return quickSelect(arr, target, pivot + 1, hi);
        } else return pivot;
    }

    public void quickSort(int [] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int [] a, int low, int hi) {
        if(low < hi) {
            int position =  inPlacePartition(a, low, hi);
            quickSort(a, low, position - 1);
            quickSort(a, position + 1, hi);
        }
    }

    private int inPlacePartition(int[] a, int lo, int hi) {
        int i = lo + 1;
        int j = hi;
        while(i < j) {
            while(i <= j && a[i] < a[lo]) i++;
            while(i <= j && a[j] > a[lo]) j--;
            if(i < j) swap(i, j, a);
        }
        swap(lo, i - 1, a);
        return i - 1;
    }

    private void swap(int a, int b, int [] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
