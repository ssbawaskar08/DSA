public class Lc121 {
    public int maxProfit(int[] prices) {
        int bp = prices[0],sp=prices[0],max=0;
        for(int i =1;i<prices.length;i++){
            if(prices[i]<bp){
                bp=prices[i];
                sp=prices[i];
            }
            sp=Math.max(prices[i], sp);
            max=Math.max(sp-bp,max);
        }
        return max;
    }
}



//accepted answer 
// public int maxProfit(int[] prices) {
//     if(prices.length > 100 && prices[0] == 10000) return 3;
//     if(prices.length > 100 && prices[0] == 9973) return 0;
//     if(prices.length > 100 && prices[0] == 5507) return 9972;
//     if(prices.length > 100) return 999;
//     int min=prices[0];
//     int res=0;
//     for(int i=1;i<prices.length;i++){
//         if(min>prices[i]){
//             min=prices[i];
//         }else{
//             res=Math.max(res,(prices[i]-min));
//         }
//     }
//     return res;
//     if(prices.length > 100 && prices[0] == 397) return 9995;
// }