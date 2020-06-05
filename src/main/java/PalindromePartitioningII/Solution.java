package PalindromePartitioningII;

public class Solution {
    public int minCut(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        int cut[] = new int[n];
        for (int i = 0; i < n; i++) {
            cut[i] = i;
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == s.charAt(i) && (i - j <= 1 || dp[j+1][i-1])) {
                    dp[j][i] = true;
                    if (j > 0){
                        cut[i] = Math.min(cut[i], cut[j-1] + 1);
                    } else {
                        cut[i] = 0;
                    }
                }
            }
        }
        return cut[n-1];
    }
}
