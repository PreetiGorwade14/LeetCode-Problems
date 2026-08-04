class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int small = nums[0];
        int large = nums[nums.length-1];

        List<Integer> ans = new ArrayList<>();

        int i = 0;

        while(i<nums.length && small <= large){
            if(nums[i] == small){
                i++;
            }else{
            ans.add(small);
            }
            small++;
        }

        return ans;
    }
}