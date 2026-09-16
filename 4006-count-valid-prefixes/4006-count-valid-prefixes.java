class Solution {
    public int countValidPrefixes(String s) {
        int n=s.length();
        int pref=0;
        int one=0;
        int zero=0;
        for(int i=0;i<n;i++)
        {
            
                if(s.charAt(i)=='0')
                {
                    zero++;
                }
                else if(s.charAt(i)=='1')
                {
                    one++;
                }
                if(Math.abs(zero-one)<=1)
                {
                    pref++;
                }
        }
        return pref;
    }
}