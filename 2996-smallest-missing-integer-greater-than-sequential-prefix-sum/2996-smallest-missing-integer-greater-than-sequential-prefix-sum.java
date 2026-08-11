class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        for(int j=1; j<nums.length; j++){
            if(nums[j] == (nums[j-1]+1)){
                sum += nums[j];
            }else break;
        }

        HashSet<Integer> ans = new HashSet<>();

        int temp = sum;

        for(int num : nums){
            ans.add(num);
        }

        while(ans.contains(temp)){
            temp++;
        }
        return temp;
    }
}