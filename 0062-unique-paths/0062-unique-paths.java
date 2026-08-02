class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        int ans = solve(dp, m-1, n-1);
        return ans;
    }

    public int solve(int[][] dp, int m, int n){
        if(m<0 || n<0) return 0;

        if(m == 0 || n == 0){
            return 1;
        }

        if(dp[m][n] !=0 ){
            return dp[m][n];
        }

        int left = solve(dp, m, n-1);
        int up = solve(dp, m-1, n);

        dp[m][n] = left + up;

        return dp[m][n];

    }
}