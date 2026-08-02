class Solution {
    public boolean stoneGame(int[] piles) {
        int dp[][] = new int[piles.length][piles.length];

        return solve(piles, 0, piles.length-1, dp) > 0;
    }

    public int solve(int[] piles, int i, int j, int dp[][]){
        if( i== j){
            return piles[i];
        }

        if(dp[i][j]!=0){
            return dp[i][j];
        }

        int left = piles[i] - solve(piles, i+1, j, dp);
        int right = piles[j] - solve(piles, i, j-1, dp);

        dp[i][j] = Math.max(left, right);

        return dp[i][j];
    }
}