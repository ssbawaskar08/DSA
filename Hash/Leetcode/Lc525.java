import java.util.*;

public class Lc525{
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); //prefix,index
        map.put(0,-1);
        int prefix = 0;
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            prefix += (nums[i]==0)?(-1):(1);
            // System.out.println(prefix);
            if(map.containsKey(prefix)){
                max = Math.max(max,i-map.get(prefix));
            }else{
                map.put(prefix,i);
            }
        }
        return max;
    }
}