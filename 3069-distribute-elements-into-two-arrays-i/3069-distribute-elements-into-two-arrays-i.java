class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
     int arr1[]=new int[n];
     int arr2[]=new int[n];
     int a=1;
     int b=1;  
     arr1[0]=nums[0];
     arr2[0]=nums[1]; 
     for(int i=2;i<nums.length;i++)
     {
         int n1=arr1[a-1];
         int n2 =arr2[b-1];
         if(n1>n2)
         {
            arr1[a]=nums[i];
            a++;
         }
         else
         {
            arr2[b]=nums[i];
            b++;
         }
     }
     int k=0;
     for(int i=0;i<a;i++)
     {
        nums[k]=arr1[i];
        k++;
     }
     for(int i=0;i<b;i++)
     {
        nums[k]=arr2[i];
        k++;
     }
     return nums;
    }
}