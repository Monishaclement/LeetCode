class Solution {
    public int maximumProduct(int[] nums) {
      int n = nums.length;
       int first=Integer.MIN_VALUE;;
       int sec=Integer.MIN_VALUE;
       int third=Integer.MIN_VALUE;
       int mini=Integer.MAX_VALUE;
       int maxi=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++)
       {
          if(nums[i]>first)
          {
             third=sec;
            sec=first;
            first=nums[i];
            
          }
          else if(nums[i]<=first&&nums[i]>=sec)
          {
            third=sec;
            sec=nums[i];
            
          }
          else if(nums[i]>=third)
          {
            third=nums[i];
          }
          if(mini>=nums[i])
          {
            maxi=mini;
            mini=nums[i];

          }
          else if(nums[i]<=maxi)
          {
            maxi=nums[i];
          }
       }
       return Math.max(first*mini*maxi,first*sec*third); 
    }
}