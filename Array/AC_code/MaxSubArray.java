public class MaxSubArray {
    public static void MaxSubArraySum(int arr []){
        int largest = 0;
        int sum = 0;
        int start = 0;
        int end = 0;
        for(int i = 0; i<arr.length;i++){
            start = i;
            for(int j = i;j<arr.length;j++){
                sum = 0;
                end = j;
                for(int k=start;k<=end;k++){ 
                    sum+=arr[k];
                }
                if(sum>largest){
                    largest = sum;
                }
            }
        }
        System.out.println(largest);
    }
    public static void MaxSubArraySumKadane(int arr []){
        int cs=0,ms=0;
        for(int i=0;i<arr.length;i++){
            cs= cs+arr[i] <0 ? 0:arr[i]+cs;
            ms=Math.max(cs, ms);
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int arr [] = {-2,-3,4,-1,-2,1,5,-3};
        MaxSubArraySumKadane(arr);
    }
}
