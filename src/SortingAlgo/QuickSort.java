package SortingAlgo;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        quicksort(a, 0, a.length);
        for (int i : a) {
            System.out.println(i + "");
        }
    }

    private static void quicksort(int[] a, int start, int end) {
        if (end - start < 2) return; // one element array
        int pivotIndex = partition(a, start, end);
        quicksort(a, start, pivotIndex);
        quicksort(a, pivotIndex + 1, end);

    }

    private static int partition(int[] a, int start, int end) {
        int pivot = a[start];
        while (start < end) {
            while (start < end && a[--end] >= pivot) ;
            if (start < end) {
                a[start] = a[end];
            }
            while (start < end && a[++start] <= pivot) ;
            if(start < end){
                a[end] = a[start];
            }
        }
        a[start] = pivot; // here value of start and end are equal
        return start;
    }

}
