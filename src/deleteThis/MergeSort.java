package deleteThis;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 55, 55, 4, 3, 2, 1};
        mergeSort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.println(i + "");
        }
    }

    private static void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    private static void merge(int[] a, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
            }
            k++;
        }

        if (i <= mid) {
            while (i <= mid) {
                temp[k] = a[i];
                k++;
                i++;
            }
        }
        if (j <= end) {
            while (j <= end) {
                temp[k] = a[j];
                j++;
                k++;
            }
        }
        for(i = start; i<= end; i++ ){
            a[i] = temp[i - start];
        }
    }
}

