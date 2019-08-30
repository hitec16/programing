package dyanmicProgramming;

/*https://www.youtube.com/watch?v=BysNXJHzCEs*/

public class LongestCommonSubstring {

    public static void main(String[] args) {
        System.out.println( findLCS("abcdaf".toCharArray(), "tyuioa".toCharArray()));
    }

    private static String findLCS(char[] s1, char[] s2) {
        int m = s1.length + 1;
        int n = s2.length + 1;
        int a[][] = new int[m][n];
        int max = 0;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (s1[i - 1] == s2[j - 1]) {
                    a[i][j] = a[i - 1][j - 1] + 1; // get the upper diagonal value and add 1 to i
                    max = Math.max(max, a[i][j]);
                }
            }
        }
    StringBuilder builder = new StringBuilder();
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(a[i][j] == max){
                    while(a[i][j] != 0){
                        builder.append(s1[i-1]);
                        i--;
                        j--;
                    }
                    return builder.reverse().toString();
                }
            }
        }

        System.out.println("substring is " + builder.toString());
        return "";
    }
}
