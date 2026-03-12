public class TrappingRainWater {
    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        int sum = 0;
        int [] maxLeft = new int [height.length];
        int [] maxRight = new int [height.length];
        
        maxRight[0]=height[0];
        maxLeft[height.length-1]=height[height.length-1];
        for(int i = 1;i<height.length;i++){
            maxRight[i]=Math.max(maxRight[i-1],height[i]);
        }
        for(int i = height.length-2;i>=0;i--){
            maxLeft[i]=Math.max(maxLeft[i+1],height[i]);
        }
        for(int i = 0;i<height.length;i++){
            sum +=(Math.min(maxLeft[i], maxRight[i])-height[i]);
        }
        System.out.println(sum);
    }
}
