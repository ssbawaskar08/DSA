import java.util.HashMap;
import java.util.Map;

public class Lc3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int l=0;
        int max=0;
        for(int r = 0;r<s.length();r++ ){
            
            while(map.containsKey(s.charAt(r))){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            map.put(s.charAt(r),1);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}
