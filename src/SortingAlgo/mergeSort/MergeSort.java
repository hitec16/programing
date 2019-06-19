package SortingAlgo.mergeSort;


public class MergeSort {

    public static void main(String[] args) {
        int[] a = {9, 3, 7, 5, 6, 4, 8, 2};
        System.out.println("Merge sort result: ");
        mergeSort(a, 0, a.length - 1);
        for (int item : a) {
            System.out.println(item+"");
        }
    }

    public static void mergeSort(int[] a, int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            if (a[i] <= a[j]) {
                temp[k] = a[i];
                k++;
                i++;
            } else {
                temp[k] = a[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            temp[k] = a[i];
            k++;
            i++;
        }
        while (j <= high) {
            temp[k] = a[j];
            k++;
            j++;
        }

        //copy array
        for (i = low; i <= high; i++) {
            a[i] = temp[i - low];
        }
    }

}
