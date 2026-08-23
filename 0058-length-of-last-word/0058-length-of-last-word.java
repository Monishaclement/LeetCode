class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        String str[]=s.split(" ");
        for(int i=0;i<str.length;i++)
        {
            if(!str[i].equals(""))
            {
                len=str[i].length();
            }
        }
        return len;
    }
}