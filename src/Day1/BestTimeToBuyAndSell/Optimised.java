package Day1.BestTimeToBuyAndSell;

public class Optimised {

    public static int buyAndSell(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            minPrice = Math.min(minPrice , price);
            maxProfit = Math.max(maxProfit , price-minPrice);
        }
        return maxProfit ;
    }
}
