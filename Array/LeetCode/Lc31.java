// 31. Next Permutation --> https://leetcode.com/problems/next-permutation/description/
public class Lc31 {
    public void nextPermutation(int[] nums) {
        int p = -1;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p = i;
                break;
            }
        }
        System.out.println("this is p "+p);
        if(p==-1){
            int k = 0, l=nums.length-1;
           while (k<=l){
                int temp = nums[k];
                nums[k]=nums[l];
                nums[l]=temp;
                k++;
                l--;
            }
        }else{
            System.out.println("This is element at p "+nums[p]);
            for(int i = nums.length-1;i>=0;i--){
                if(nums[i]>nums[p]){
                    System.out.println(nums[i]);
                    int temp = nums[p];
                    nums[p] = nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            System.out.println("This is element at p "+nums[p]);
            int i = p+1, j=nums.length-1;
            while (i<=j){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Lc31 ob = new Lc31();
        int [] c = {1,3,2};
        ob.nextPermutation(c);
    }

}
