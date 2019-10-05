package CodingInterviewBook.ArraysAndString;

/*
https://www.geeksforgeeks.org/convert-array-into-zig-zag-fashion/
* Given an array of DISTINCT elements, rearrange the elements of array in zig-zag fashion in O(n) time.
*  The converted array should be in form a < b > c < d > e < f.
Input: arr[] = {4, 3, 7, 8, 6, 2, 1}
Output: arr[] = {3, 7, 4, 8, 2, 6, 1}

Input: arr[] = {1, 4, 3, 2}
Output: arr[] = {1, 4, 2, 3}
*/
public class ZigZagArray {

    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2};
        boolean flag = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (flag && !(arr[i] < arr[i + 1])) {
                swap(arr, i, i + 1);
            } else if (!flag && !(arr[i] > arr[i + 1])) {
                swap(arr, i, i + 1);
            }
            flag = !flag;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }


    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
