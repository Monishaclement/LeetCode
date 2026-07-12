class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
    List <Integer> res = new ArrayList<>();
    int a = nums.length;
    Arrays.sort(nums);
    for(int i=0;i<a;i++)
    {
        if(nums[i]==target)
        {
            res.add(i);
        }
    }
    return res;    
    }
}