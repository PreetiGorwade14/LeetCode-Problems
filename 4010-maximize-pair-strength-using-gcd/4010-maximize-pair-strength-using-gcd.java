class Solution {

    public long maxPairStrength(int[] nums) {
        long ans = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                int a = nums[i];
                int b = nums[j];

                int g = gcd(a, b);

                long temp = (1L * a * b) / (1L * g * g);

                ans = Math.max(ans, temp);
            }
        }

        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}