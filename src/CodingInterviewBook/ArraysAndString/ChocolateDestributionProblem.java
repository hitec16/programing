package CodingInterviewBook.ArraysAndString;

import java.util.Arrays;

/*Given an array of n integers where each value represents number of chocolates in a packet. Each packet can have variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

        Each student gets one packet.
        The difference between the number of chocolates in packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.
        Examples:

        Input : arr[] = {7, 3, 2, 4, 9, 12, 56}
        m = 3
        Output: Minimum Difference is 2
        We have seven packets of chocolates and
        we need to pick three packets for 3 students
        If we pick 2, 3 and 4, we get the minimum
        difference between maximum and minimum packet
        sizes.

        Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12}
        m = 5
        Output: Minimum Difference is 6
        The set goes like 3,4,7,9,9 and the output
        is 9-3 = 6

        Input : arr[] = {12, 4, 7, 9, 2, 23, 25, 41,
        30, 40, 28, 42, 30, 44, 48,
        43, 50}
        m = 7
        Output: Minimum Difference is 10
        We need to pick 7 packets. We pick 40, 41,
        42, 44, 48, 43 and 50 to minimize difference
        between maximum and minimum.*/
public class ChocolateDestributionProblem {

    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41,
                30, 40, 28, 42, 30, 44, 48,
                43, 50}; // chocolate packets
        int m = 7; // no. of student
        solveChocolateProblem(arr, m);
    }

    private static void solveChocolateProblem(int[] arr, int m) {
        Arrays.sort(arr);
        int maxDiff = Integer.MIN_VALUE;
        int startIndex = 0;
        for (int i = 0; i <= arr.length - m; i++) {
            int diff = arr[i] - arr[i + m - 1];
            if (diff > maxDiff) {
                maxDiff = diff;
                startIndex = i;
            }
        }
        for (int j = 0; j < m; j++) {
            System.out.print(arr[startIndex + j] + ", ");
        }
    }

}
