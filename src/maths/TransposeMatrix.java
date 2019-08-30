package maths;

public class TransposeMatrix {

    public static void main(String[] args) {

        int A[][] = {{1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}};
        transpose(A);
    }

    public static void transpose(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+ 1; j < a.length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(a[i][j] + " ");
            System.out.print("\n");
        }
    }
}
