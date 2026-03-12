package LeetCode;
public class Lc2815{
    public int maxSum(int[] nums) {
        int[] maxDigitNumsArray = getMaxDigitNumsArray(nums);

        int maxPair = -1;
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(maxDigitNumsArray[i] == maxDigitNumsArray[j]) {
                    int sum = nums[i] + nums[j];
                    if(maxPair < sum) {
                        maxPair = sum;
                    }
                }
            }
        }
         
        return maxPair;
    }

    public int getMaxDigit(int num) {
        int maxDigit = Integer.MIN_VALUE;
        
        while(num != 0) {
            int digit = num % 10;
            if(maxDigit < digit) {
                maxDigit = digit;
            }
            num = num / 10;
        } 

        return maxDigit;
    }

    public int[] getMaxDigitNumsArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            result[i] = getMaxDigit(nums[i]);
        }
        return result;
    }
}