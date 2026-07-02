class Solution {
    public String reverseWords(String s) {
     int n = s.length();
     String arr[]=s.split(" ");
     StringBuilder sb = new StringBuilder();
     for(String st:arr)
     {
        char ch[]=st.toCharArray();
        int left=0;
        int right=st.length()-1;
        while(left<right)
        {
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        sb.append(new String(ch)).append(" ");
     }
     return sb.toString().trim();
    }
}