class Solution {
    public String sortVowels(String s) {
     ArrayList<Character>arr=new ArrayList<>();
     char str[]=s.toCharArray();
     for(int i=0;i<str.length;i++)
     {
             if(vow(str[i]))
             {
                arr.add(str[i]);
             }
     } 
     Collections.sort(arr);  
     int j=0;
     for(int i=0;i<str.length;i++)
     {
        if(vow(str[i]))
        {
        str[i]=arr.get(j);
        j++;
        }
     }
     return new String(str);    
     }
     public boolean vow(char s)
     {
        return (s=='a'||s=='A'||s=='e'||s=='E'||s=='i'||s=='I'||s=='o'||s=='O'||s=='u'||s=='U');
     }

}