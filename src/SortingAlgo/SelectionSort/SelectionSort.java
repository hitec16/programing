package SortingAlgo.SelectionSort;

public class SelectionSort {

    public static void main(String[] args) {

        Comparable[] ar = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        selectionSort(ar);

    }

    public static void selectionSort(Comparable[] a) {

        int n = a.length;

        for (int i = 0; i < n; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (less(a[i], a[j])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }

        for (Comparable item : a) {
            System.out.println(item);
        }

    }

    private static boolean less(Comparable v, Comparable w) {
        if (0 < v.compareTo(w)) {
//            v=9 , w=8 then true
            return true;
        } else {
            return false;
        }
    }

    private static void exch(Comparable[] a, int i, int j) {

        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
