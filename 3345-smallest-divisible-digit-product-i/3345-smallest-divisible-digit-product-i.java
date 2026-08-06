class Solution {
    public int smallestNumber(int n, int t) {
        while(product(n)%t != 0){
            n++;
        }
        return n;
    }

    public static int product(int n){
        int ans = 1;
        while(n>0){
            int temp = n%10;
            ans *= temp;
            n = n/10;
        }
        return ans;
    }
}