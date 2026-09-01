package Hash.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Lc242 {
    public boolean isAnagram(String s, String t) {
        s = s.replaceAll("\\s","");
        t = t.replaceAll("\\s","");
        if(s.toCharArray().length != t.toCharArray().length){
            return false;
        }
        Map<Character, Integer> maps = new HashMap<>();
        Map<Character, Integer> mapt = new HashMap<>();
        for(int i = 0; i<s.length();i++){
            if(maps.containsKey(s.charAt(i))){
                maps.put(s.charAt(i),maps.get(s.charAt(i))+1);
            } else{
                maps.put(s.charAt(i),1);
            }
        }
        for(int i = 0; i<t.length();i++){
            if(mapt.containsKey(t.charAt(i))){
                mapt.put(t.charAt(i),mapt.get(t.charAt(i))+1);
            } else{
                mapt.put(t.charAt(i),1);
            }
        }
        for(char a : s.toCharArray()){
            if (maps.get(a) != mapt.get(a)|| mapt.get(a)==null){
                return false;
            }
        }
        return true;
    }
}
