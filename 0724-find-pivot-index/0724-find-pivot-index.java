class Solution {
    public int pivotIndex(int[] nums) {
    int n=nums.length;
    int le[]=new int[n];
    int re[]=new int[n];
    le[0]=0;
    re[0]=0;
    int sum1=0;
    int sum2=0;
    for(int i=1;i<le.length;i++)
    {
       le[i]=le[i-1]+nums[i-1];
    }
    for(int i=re.length-2;i>=0;i--)
    {
       
       re[i]=re[i+1]+nums[i+1];
    }
    for(int i=0;i<nums.length;i++)
    {
        if(le[i]==re[i])
        {
            return i;
        }
    }
    return -1;
    }
}