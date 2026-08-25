class Solution {
    public int missingMultiple(int[] nums, int k) {
     HashSet<Integer>set=new HashSet<>();
     for(int i=0;i<nums.length;i++)
     {
        if(!set.contains(nums[i]))
        {
               set.add(nums[i]);
        }
     }
     int mul=0;
     for(int i=1;i<=nums.length*2;i++)
     {
        if(!set.contains(k*i))
        {
            mul=k*i;
            break;
        }

     }
     return mul;
    }
}