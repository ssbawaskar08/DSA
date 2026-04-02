// 53. Maximum Subarray --> https://leetcode.com/problems/maximum-subarray/description/
public class Lc53 {
    public int maxSubArray(int[] nums) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i =0;i<nums.length;i++){
            cs = Math.max(nums[i],cs+nums[i]);
            ms = Math.max(ms,cs);
        }    
        return ms;
    }
}