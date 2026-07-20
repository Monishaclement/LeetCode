class Solution {
    public int calPoints(String[] operations) {
   int sum=0;
    Stack<Integer>st=new Stack<>();
    for(String ch:operations)
    {
      
        if(ch.equals("+"))
        {
            int a = st.pop();
            int b = st.peek();
            int c= a+b;
            st.push(a);
            st.push(c);
        }
         else if(ch.equals("C"))
        {
            st.pop();
        }
        else if(ch.equals("D"))
        {
            int a = st.peek();
            st.push(a*2);
        }
        else
        {
            st.push(Integer.parseInt(ch));
        }
    }
    while(!st.isEmpty())
    {
     sum=sum+st.peek();
     st.pop();
    } 
      return sum;
    }
}