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
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        MaxSubArraySum(arr);
    }
}
