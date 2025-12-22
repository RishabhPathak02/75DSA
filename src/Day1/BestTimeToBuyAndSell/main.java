package Day1.BestTimeToBuyAndSell;

public class main {
    public static void main(String[] args) {
        int[]prices = {7,1,5,3,6,4};
        int result1 = Brute.buyAndSell(prices);
        int result2 = Optimised.buyAndSell(prices);
        System.out.println(result1);
        System.out.println(result2);
    }
}
