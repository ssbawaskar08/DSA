package Hash.Leetcode;
//You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
import java.util.HashMap;
import java.util.Map;

public class Lc1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0],0);
        for(int i = 1;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {i , map.get(complement)};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}
