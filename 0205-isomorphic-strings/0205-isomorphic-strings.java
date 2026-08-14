class Solution {
    public boolean isIsomorphic(String s, String t) {
    HashMap<Character,Integer>map=new HashMap<>();
    int n = s.length();
    int m = t.length();
    int smap[]=new int[256];
    int tmap[]=new int[256];
    if(n!=m)
    {
        return false;
    }
    for(int i=0;i<s.length();i++)
    {
        char ch1=s.charAt(i);
        char ch2=t.charAt(i);
        if(smap[ch1]!=tmap[ch2])
        {
            return false;
        }
        smap[ch1]=i+1;
        tmap[ch2]=i+1;
    }
    return true;
      
    }
}