class Solution {
    public int compute(int n, int x, int[] a, int[] b) {
        // write your code here
        int sum = 0;
        for (int i=0;i<n ;i++ ){
            if (a[i]>=x){
                sum+=b[i];
            }else{
                continue;
            }
        }
        return sum;
    }
}
