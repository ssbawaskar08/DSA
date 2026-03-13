public class BuyOrSell {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6};
        int bp = prices[0],sp=prices[0],max=0;
        for(int i =1;i<prices.length;i++){
            if(prices[i]<bp){
                bp=prices[i];
                sp=prices[i];
            }
            sp=Math.max(prices[i], sp);
            max=Math.max(sp-bp,max);
        }
        System.out.println(max);
    }
}
