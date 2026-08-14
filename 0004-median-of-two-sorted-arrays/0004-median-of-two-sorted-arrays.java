class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] ans = new int[n1+n2];

        System.arraycopy(nums1, 0, ans, 0, n1);
        System.arraycopy(nums2, 0, ans, n1, n2);
        Arrays.sort(ans);
        
        if(ans.length%2==0){
            int mid = ans.length/2;
            return (double)(ans[mid-1] + ans[mid])/2;
        }else{
            int mid = (int)ans.length/2;
            return (double)ans[mid];
        }
    }
}