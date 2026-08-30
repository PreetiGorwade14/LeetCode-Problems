class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minIdx = 0, maxIdx = 0;

        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            ans[i] = nums[i];
        }

        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[n-1];

        for(int i=0; i<n; i++){
            if(ans[i] == min) minIdx = i;
            if(ans[i] == max) maxIdx = i;
        }

        int ans1 = minIdx > maxIdx ? minIdx+1 : maxIdx+1;
        // int ans2 = minIdx > maxIdx ? n-minIdx : n-maxIdx;
        int ans2 = n - Math.min(minIdx, maxIdx);
        int ans3 = minIdx > maxIdx ? (n-minIdx + (maxIdx+1)) : n-maxIdx+minIdx+1;

        return Math.min(ans1, Math.min(ans2, ans3));
    }
}