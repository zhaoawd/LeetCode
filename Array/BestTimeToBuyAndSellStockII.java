package Array;

public class BestTimeToBuyAndSellStockII {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int begin = 0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i]>prices[i+1]){
                maxProfit += prices[i] - prices[begin];
                begin = i+1;
            }
        }
        if(begin != (prices.length -1)) {
            maxProfit += prices[prices.length-1] - prices[begin];
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
