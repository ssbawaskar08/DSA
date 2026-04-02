// 75. Sort Colors --> https://leetcode.com/problems/sort-colors/description/
public class Lc75 {
    public void sortColors(int[] nums) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i:nums){
            switch (i){
                case 0 : c0++;
                        break;
                case 1 : c1++;
                        break;
                case 2 : c2++;
                        break;
                default : break;
            }
        }
        for (int i=0;i<nums.length;i++){
            if(c0!=0){
                nums[i] = 0;
                c0--;
                continue;
            }else if(c1!=0){
                nums[i]=1;
                c1--;
                continue;
            }else if(c2!=0){
                nums[i]=2;
                c2--;
                continue;
            }
        }
    }
}
