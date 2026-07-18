class Solution {
    public int smallestEvenMultiple(int n) {
        int min=Integer.MAX_VALUE;
      for(int i=1;i<=2*n;i++)
      {
         if(i%n==0&&i%2==0)
         {
            min = Math.min(i,min);
         }
      } 
      return min; 
    }
}