package SortingAlgo.mergeSort;


public class MergeSort {

    private static Comparable[] aux;

    public static void main(String[] args) {
        Comparable[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(a);
        System.out.println("Merge sort result: ");
        for (Comparable item : a) {
            System.out.println(item);
        }
    }

    public static void mergeSort(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];   // copy array to auxillary array
        }

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) a[k] = aux[j++];

            else if (j > hi) a[k] = aux[i++];

            else if (less(aux[j], aux[i])) a[k] = aux[i++];
            else a[k] = aux[j++];

        }


    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {

        if (hi <= lo) return;

        int mid = lo + (hi - lo) / 2; // to calculate mid
        sort(a, aux, lo, mid); // first half of array
        sort(a, aux, mid + 1, hi); // second half of array
        mergeSort(a, aux, lo, mid, hi);
    }

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    private static boolean less(Comparable v, Comparable w) {
        if (0 < v.compareTo(w)) {
//            v=9 , w=8 then true
            return true;
        } else {
            return false;
        }
    }
}
