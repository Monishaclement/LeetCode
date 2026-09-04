class Solution {
    public int subarrayGCD(int[] nums, int k) {
      int n=nums.length;
      int cnt=0;
      for(int i=0;i<n;i++)
      {
        int currgcd=0;
        for(int j=i;j<n;j++)
        {
            //int num1=nums[i];
            int num2=nums[j];
            currgcd = gcd(currgcd,num2);
            if(currgcd==k)
            {
                cnt++;
            }
            if(currgcd<k)
            {
                break;
            }
        }
      } 
      return cnt; 
    }
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}