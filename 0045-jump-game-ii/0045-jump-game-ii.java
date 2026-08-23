class Solution {
    public int jump(int[] nums) {
     int n=nums.length;
     int maxi=0;
    int curr=0;
    int j=0;
     for(int i=0;i<n-1;i++)
     {
       maxi=Math.max(maxi,i+nums[i]);
       if(curr==i)
       {
        j++;
        curr=maxi;
       }
     }
     return j;
    
}
}