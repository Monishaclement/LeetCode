class Solution {
    public int maxProduct(int n) {
        int num=n;
        int first=0;
        int sec=0;
        while(num>0)
        {
            int div =num%10;
            if(div>=first)
            {   sec=first;
                first=div;
            }
            else if(div>sec)
            {
                     sec=div;
            }
           num=num/10;
        }
        return first*sec;
    }
}