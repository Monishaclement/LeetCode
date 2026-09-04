/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
     ArrayList<Integer>li=new ArrayList<>();
     ListNode temp=head;
     while(temp!=null)
     {
        li.add(temp.val);
        temp=temp.next;
     } 
     int le=0;
     int ri=li.size()-1;
     while(le<ri)
     {
        if(!li.get(le).equals(li.get(ri)))
        {
            return false;
        }
        le++;
        ri--;
     } 
     return true;
    }
}