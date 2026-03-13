public class Lc122 {
    public int maxProfit(int[] prices) {
        int bp = prices[0],max=prices[0],profit=0;
        for(int i =1;i<prices.length;i++){
            if(prices[i]<max){
                profit+=max-bp;
                bp=prices[i];
                max=prices[i];
            }else if(prices[i]>max){
                max=prices[i];
            }else {
                continue;
            }
        }
        profit+=max-bp;
        return profit;
    }
}
