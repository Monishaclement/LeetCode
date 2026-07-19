class Solution {
    public int[] runningSum(int[] nums) {
      int n = nums.length;
      int sum =0;
      int res[] = new int[n];
      for(int j=0;j<n;j++)
      {
        
        sum+=nums[j];
        res[j]=sum;
      }
      return res;  

    }
}