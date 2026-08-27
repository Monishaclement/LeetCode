class Solution {
    public boolean checkIfPangram(String sentence) {
      char ar[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      int cnt=0;
      for(int i=0;i<ar.length;i++)
      {

       if(sentence.indexOf(ar[i])!=-1)
       {
        cnt++;
       }
      }
      if(cnt==26)
      {
        return true;
      } 
      else
      {
        return false;
      } 
    }
}