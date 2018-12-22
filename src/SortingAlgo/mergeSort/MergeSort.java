package SortingAlgo.mergeSort;


public class MergeSort {

    private static Comparable[] aux;

    public static void main(String[] args) {
        Comparable[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(a); //This is merge sort with recursion
//        sortBottomUpMerge(a); // this is merge sort without recursion
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

            if (i > mid) a[k] = aux[j++];  // first half of array is complete so coppying all values of second array

            else if (j > hi) a[k] = aux[i++]; // second array finished first, so adding first array values directly

            else if (less(aux[j], aux[i])) a[k] = aux[i++]; // comparing values of both array and addiing smaller one to the array
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

//    Bottom up Merger sort which works without recursion only distadvantage is it takes extra space proportional to the size of the array.

    public static void sortBottomUpMerge(Comparable[] a)
    {
        int N = a.length;
        Comparable[] aux = new Comparable[N];
        for (int sz = 1; sz < N; sz = sz+sz)
            for (int lo = 0; lo < N-sz; lo += sz+sz)
                mergeSort(a, aux, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
    }
}
