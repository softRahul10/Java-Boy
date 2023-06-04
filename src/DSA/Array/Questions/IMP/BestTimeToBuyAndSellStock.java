package DSA.Array.Questions.IMP;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {1,5,3,8,12};
        int result = maxProfit(prices,0,prices.length - 1);
        System.out.println("Max Profit is : " + result);

    }
    // approach1
    public static int maxProfit(int[] arr,int s, int e) {
        // base case
        if(e <= s) return 0;
        int profit = 0;
        for (int i = s; i < e; i++) {
            for (int j = i+1; j <= e; j++) {
                if(arr[j] > arr[i]) {
                    int currProfit = arr[j] - arr[i] + maxProfit(arr,s,i-1) + maxProfit(arr,j+1,e);
                    profit = Math.max(profit,currProfit);
                }
            }
        }
        return profit;
    }
}
