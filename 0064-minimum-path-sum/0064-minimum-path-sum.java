class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int dp[][] = new int[m][n];

        int ans = solve(dp, m-1, n-1, grid);

        return ans;
    }

    public static int solve(int[][] dp, int m, int n, int[][]grid){

        if(m<0 || n<0) return 0;

        dp[0][0] = grid[0][0];

        if(m == 0){
            for(int i=1;i<=n;i++){
                dp[m][i] = grid[m][i] + dp[m][i-1];
            }
        }

        if(n == 0){
            for(int i=1;i<=m;i++){
                dp[i][n] = grid[i][n] + dp[i-1][n];
            }
        }

        if(dp[m][n] != 0){
            return dp[m][n];
        }
        int left = solve(dp, m, n-1, grid);
        int up = solve(dp, m-1, n, grid);
        dp[m][n] = grid[m][n] + Math.min(left, up);

        return dp[m][n];
    }
}