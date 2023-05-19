package org.example.arrays;
/*
You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
However, you can buy it then immediately sell it on the same day.
Find and return the maximum profit you can achieve.
* */

public class TimeToBuySellStock {
    private static int bestTimeToBuySellStock(int[] prices) {

        if (prices.length == 0) {
            return -1;
        }

        int benefits = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                benefits += prices[i + 1] - prices[i];
            }
        }

        return benefits;
    }

    public static void executeBestTimeToBuySellStock() {
        int[] exampleInput = {7, 1, 5, 3, 6, 4};
        int expectedOutput = 7;
        int benefits = bestTimeToBuySellStock(exampleInput);
        System.out.println(benefits);

    }

}
