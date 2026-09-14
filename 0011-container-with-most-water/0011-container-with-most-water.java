class Solution {
    public int maxArea(int[] height) {
     int n = height.length;
     int left=0;
     int right=height.length-1;
     int water=0;
     while(left<right)
     {
        int width=right-left;
        int curr = Math.min(height[left],height[right])*width;
         water=Math.max(water,curr);
        if(height[left]<height[right])
        {
            left++;
        }
        else
        {
            right--;
        }
     }
     return water;
     }
    }
