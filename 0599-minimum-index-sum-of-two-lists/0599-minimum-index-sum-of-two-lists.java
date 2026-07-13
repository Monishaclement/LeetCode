class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
       int n1=list1.length;
       int n2=list2.length;
       String[]arr=new String[Math.min(n1,n2)];
       int i=0;
       int k=0;
       int cnt=Integer.MAX_VALUE;
       while(i<n1)
       {
      for(int j=0;j<n2;j++)
      {
        if(list2[j].equals(list1[i]))
        {
             if(i+j<cnt)
             {
                cnt=i+j;
                k=0;
                arr[k]=list1[i];
                k++;
             }
             else if(i+j==cnt)
             {
                arr[k]=list1[i];
                k++;
             }
        }
         
      }

      i++;
       }
       String array[]=new String[k];
       for(int n=0;n<k;n++)
       {
         array[n]= arr[n];
       }
       return array;
    }
}