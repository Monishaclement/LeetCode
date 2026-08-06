class Solution {
    public int smallestNumber(int n, int t) {
        int solu=0;
      while(true)
      {
        int num=n;
        int sol=1;
        while(num>0)
        {
            int rem=num%10;
            sol=rem*sol;
            num=num/10;
        }
        if(sol%t==0)
        {
            return n;
        }
         n++; 
      } 
     
    }
}