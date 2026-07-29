class Solution {
    public int longestPalindrome(String s) {
     int cnt[]=new int[128];
     for(int i=0;i<s.length();i++)
     {
        char ch=s.charAt(i);
        cnt[ch]++;
     }
     int len=0;
     boolean odd=false;
     for(int i=0;i<128;i++)
     {
        if(cnt[i]%2==0)
        {
             len=len+cnt[i];
             
        }
        else
        {
            len=len+cnt[i]-1;
            odd=true;
        }
     }
     if(odd)
     {
        len++;
     }
     return len;
    }
}