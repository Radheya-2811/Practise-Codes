import java.util.Scanner;

public class MaxExpertNo {
     public static int maxExpertNumber(int[] A) {
        int N = A.length;
        int[] dp = new int[N+1];
        dp[0] = 0;

        for (int i = 1; i <= N; i++) {
            boolean[] seen = new boolean[N+1]; // store presence
            int curr_mex = 0;
            dp[i] = 0;
            for (int j = i-1; j >= 0; j--) {
                int skill = A[j];
                if (skill <= N) {
                    seen[skill] = true;
                    while (seen[curr_mex]) curr_mex++;
                }
                dp[i] = Math.max(dp[i], dp[j] + curr_mex);
            }
        }
        return dp[N];
    }
    public static void main(String[] args) {
        int[] arr={0, 1, 2, 1, 0};
        System.out.println(maxExpertNumber(arr));

    }
}
