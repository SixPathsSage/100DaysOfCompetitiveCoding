/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Siddharth
 */
public class StockManager {
    public static void main(String[] args) {
        int profit = new StockManager().maxProfit(new int[] {2,1,2,0,1});
        System.out.println(profit);
    }
    
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = -1;
        
        for(int i = 0; i < prices.length-1; i ++)
        {
            if(prices[i] < prices[i+1])
            {
                if(buy == -1)
                {
                    buy = prices[i];
                }
            }
            else
            {
                if(buy >= 0)
                {
                    profit += prices[i]-buy;
                    buy = 0;
                }
            }
        }
        
        if(buy > -1 && prices.length > 0)
        {
            profit += prices[prices.length-1] - buy;
        }
        return profit;
    }
}
