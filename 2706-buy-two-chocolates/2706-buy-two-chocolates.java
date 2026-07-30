class Solution {
    public int buyChoco(int[] prices, int money) {
     int n = prices.length;
     int first=Integer.MAX_VALUE;
     int sec=Integer.MIN_VALUE;
     int mon=0;
     for(int i=0;i<n;i++)
     {
        if(prices[i]<first)
        {
            sec=first;
            first=prices[i];
        }
        else if(prices[i]<sec)
        {
            sec=prices[i];
        }
     }
     mon=first+sec;
     if(mon<=money)
     {
        money=money-mon;
     }
     return money;

    }
}