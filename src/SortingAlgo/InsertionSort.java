package SortingAlgo;

public class InsertionSort {
    public static void main(String[] args) {

        Comparable[] ar = {9, 8, 7, 1, 5, 4, 3, 2, 6};

        insertionSort(ar);

    }

    public static void insertionSort(Comparable[] a) {

        int n = a.length;

        for (int i = 0; i < n; i++) {

            for (int j = i; j > 0; j--) {
                if (less(a[j-1], a[j])) {
                    exch(a, j, j - 1);
                }else {
//                    because we know that their will be no breaks on left side of array when checking for less than condition
                    break;
                }
            }

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
