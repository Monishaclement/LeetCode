
class Solution {

    public int[] arrayRankTransform(int[] arr) {
       int hash[]=new int[arr.length];
       for(int i=0;i<arr.length;i++)
       {
        hash[i]=arr[i];
       }
       Arrays.sort(hash);
       HashMap<Integer,Integer>map=new HashMap<>();
        int cnt=1;
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(hash[i]))
            {
                map.put(hash[i],cnt++);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            hash[i]=map.get(arr[i]);
        }
        return hash;
    }
}
