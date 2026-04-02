import java.util.Arrays;
// 136. Single Number --> https://leetcode.com/problems/single-number/description/
public class Lc136 {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        for(int i= 0;i<nums.length;i+=2){
            if(i== nums.length-1 || nums[i]!=nums[i+1]){
                return nums[i];
            }else{
                continue;
            }
        }
        return 0;
    }
}
