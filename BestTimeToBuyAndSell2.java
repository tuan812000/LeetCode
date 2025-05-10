public class BestTimeToBuyAndSell2 {
    static int maxProfit(int[] prices) {
        int max = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else {
                max += prices[i] - buy;
                buy = prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Max: " + BestTimeToBuyAndSell.maxProfit(prices));
    }
}
