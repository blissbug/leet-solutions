class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int num: prices) {
			min = Math.min(min, num);
			maxProfit = Math.max(maxProfit, num-min);
		}
        return maxProfit;
    }
}