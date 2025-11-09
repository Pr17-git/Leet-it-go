/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode>s=new HashSet<>();
        ListNode c=head;
        while(c!=null){
            if(s.contains(c)){
                return true;
            }
            s.add(c);
            c=c.next;
        }
        
        return false;
    }
}