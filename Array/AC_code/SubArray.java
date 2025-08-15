public class SubArray {
    public static void printSubArray(int arr []){
        int total = 0;
        for(int i = 0; i<arr.length;i++){
            int start = i;
            for(int j = i;j<arr.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k] +" ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("The total number of subarrays is: "+ total);
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        printSubArray(arr);
    }
}
