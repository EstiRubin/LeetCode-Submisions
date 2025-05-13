class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // עדכון המחיר הנמוך ביותר
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // עדכון הרווח המקסימלי
            }
        }

        return maxProfit;
    }
}
