package CodingInterviewBook.ArraysAndString;

public class TriangleInArray {
    /*Given an array of integers, we need to find out whether it is possible to construct at least one non-degenerate triangle using array values as its sides. In other words, we need to find out 3 such array indices which can become sides of a non-degenerate triangle.
    Examples :

    Input : [4, 1, 2]
    Output : No
    No triangle is possible from given
    array values

    Input : [5, 4, 3, 1, 2]
    Output : Yes
    Sides of possible triangle are 2 3 4*/
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        printPossibleTriangles(arr);
    }

    private static void printPossibleTriangles(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length - 1; j++) {
                int sum = arr[i] + arr[j];
                for (int k = j + 1; k < arr.length; k++) {
                    if (sum > arr[k]) {
                        System.out.println("[" + arr[i] + "," + arr[j] + "," + arr[k] + "]");
                    }
                }
            }


        }

    }

}
