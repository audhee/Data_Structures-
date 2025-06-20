/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing
a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.
 */


public class Best_time_to_buy {
    public static int max_profit(int prices[]) {
        int maxprofit = Integer.MIN_VALUE;
        int minprice = prices[0];
        for(int i=0;i<prices.length;i++){
            int cost = prices[i] - minprice;
            maxprofit = Integer.max(maxprofit,cost);
            minprice = Integer.min(minprice,prices[i]);
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {2,4,5,1,7,6,3};
        int maxprofit = max_profit(prices);
        System.out.println(maxprofit);
    }
}
