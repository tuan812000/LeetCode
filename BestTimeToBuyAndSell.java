public class BestTimeToBuyAndSell {
    static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int max = 0;
        int minPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
            if (max < prices[i] - minPrice) {
                max = prices[i] - minPrice;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Max: " + BestTimeToBuyAndSell.maxProfit(prices));
    }
}
