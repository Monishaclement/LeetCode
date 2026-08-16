class Solution {
    public int findMinArrowShots(int[][] points) {
  int arrows=1;
  Arrays.sort(points,(a,b) ->Integer.compare(a[0],b[0]));
  int st=points[0][0];
  int ed=points[0][1];
  for(int i=1;i<points.length;i++)
  {
    if(ed>=points[i][0])
    {
    ed=Math.min(ed,points[i][1]);
    }
    else
    {
        arrows++;
        st=points[i][0];
        ed=points[i][1];
    }
  }
  return arrows;
    }
}