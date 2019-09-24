package deleteThis;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        quickSort(a, 0, a.length);
        for (int i : a) {
            System.out.println(i + "");
        }
    }

    private static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int index = pivotIndex(a, start, end);
            quickSort(a, start, index);
            quickSort(a, index + 1, end);
        }
    }

    private static int pivotIndex(int[] a, int i, int j) {
        int p = a[i];
        j--;
        while (i < j && a[j] > p) j--;
        if (i < j) {
            a[i] = a[j];
        }
        while (i < j && a[i] < p) i++;
        a[j] = a[i];
        a[i] = p;
        return i;
    }
}
