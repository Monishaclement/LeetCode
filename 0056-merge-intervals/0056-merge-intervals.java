class Solution {
    public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
     int st=intervals[0][0];
     int ed=intervals[0][1];
     ArrayList<int[]>li=new ArrayList<>();
     for(int i=1;i<intervals.length;i++)
     {
        if(intervals[i][0]<=ed)
        {
            ed=Math.max(ed,intervals[i][1]);
        }
        else
        {
            li.add(new int[]{st,ed});
            st=intervals[i][0];
            ed=intervals[i][1];
        }
     }
     li.add(new int[]{st,ed});
     int ans[][]=new int[li.size()][2];
     for(int i=0;i<li.size();i++)
     {
           ans[i]=li.get(i);
     }
 return ans;
    }
}