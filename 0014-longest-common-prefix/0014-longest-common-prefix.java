class Solution {
    public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    String fi=strs[0];
    String ans="";
    String la=strs[strs.length-1];
    for(int i=0;i<fi.length();i++)
    {
        if(fi.charAt(i)==la.charAt(i))
        {
            ans=ans+fi.charAt(i);
        }
        else
        {
            break;
        }
    } 
    return ans;   
    }
}