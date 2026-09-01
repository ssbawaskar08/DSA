package Hash.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Lc560 {
    public int subarraySum(int[] nums, int k) {
        Map <Integer, Integer> map = new HashMap<>(); // prefix,count
        int prefix=0;
        map.put(0,1);
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            prefix += nums[i]; 
            count+=map.getOrDefault(prefix-k,0);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}
