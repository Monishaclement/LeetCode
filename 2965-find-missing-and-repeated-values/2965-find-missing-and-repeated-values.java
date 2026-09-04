class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
     int arr[]=new int[2];
     int row=grid.length;
     int col=grid[0].length;
     int freq[]=new int[row*col+1];
     for(int i=0;i<row;i++)
     {
        for(int j=0;j<col;j++)
        {
             freq[grid[i][j]]++;
             if(freq[grid[i][j]]==2)
        {
            arr[0]=grid[i][j];
        }
        }
        
     }
     for(int i=1;i<=freq.length-1;i++)
     {
        if(freq[i]==0)
        {
            arr[1]=i;
        }
     }
     return arr;
    }
}