package CodingInterviewBook.ArraysAndString;

import java.util.Scanner;

public class PartitionArray {
  /*  Find the element before which all the elements are smaller than it, and after which all are greater
    Input:   arr[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
    Output:  Index of element is 4
    All elements on left of arr[4] are smaller than it
    and all elements on right are greater.

    Input:   arr[] = {5, 1, 4, 4};
    Output:  Index of element is -1*/

    public static void main(String[] args) {

        int arr[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};


        findElement(arr, arr.length);


        /*Time complexity of this solution is O(n2) nsquare.*/
        for (int i = 1; i < arr.length - 2; i++) {
            if (areLeftValuesLess(arr, i) && areRightValuesGreater(arr, i)) {
                System.out.println("This is the pivot element" + arr[i] + " And its index is " + i);
            }
        }

    }

    /* This method solves it in O(n) */
    static void findElement(int[] arr, int n) {
        int[] leftMax = new int[n];
        int rightMinValue = arr[n - 1];
        int leftMaxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (leftMaxValue < arr[i]) {
                leftMax[i] = arr[i];
                leftMaxValue = arr[i];
            } else {
                leftMax[i] = leftMaxValue;
            }
        }

        for (int i = n - 2; i > 0; i--) {
            int val = arr[i];
            if(val< rightMinValue && val > leftMax[i-1]){
                System.out.println("value :" + val + " index: " + i);
            }
            if ( val < rightMinValue) {
                rightMinValue = val;
            }
        }

//        // leftMax[i] stores maximum of arr[0..i-1]
//        int[] leftMax = new int[n];
//        leftMax[0] = Integer.MIN_VALUE;
//
//        // Fill leftMax[]1..n-1]
//        for (int i = 1; i < n; i++)
//            leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
//
//        // Initialize minimum from right
//        int rightMin = Integer.MAX_VALUE;
//
//        // Traverse array from right
//        for (int i = n - 1; i >= 0; i--)
//        {
//            // Check if we found a required element
//            if (leftMax[i] < arr[i] && rightMin > arr[i])
//                return i;
//
//            // Update right minimum
//            rightMin = Math.min(rightMin, arr[i]);
//        }
//
//        // If there was no element matching criteria
//        return -1;
    }


    private static boolean areLeftValuesLess(int[] arr, int index) {
        boolean result = true;
        int value = arr[index];
        for (int i = 0; i < index; i++) {
            if (arr[i] > value) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static boolean areRightValuesGreater(int[] arr, int index) {
        boolean result = true;
        int value = arr[index];
        for (int i = index + 1; i < arr.length - 1; i++) {
            if (arr[i] < value) {
                result = false;
                break;
            }
        }
        return result;
    }
}
