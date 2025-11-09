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
    public ListNode reverseList(ListNode head) {
        // ListNode c=head;
        // Stack<ListNode>s=new Stack<>();
        // while(c!=null){
        //     s.push(c);
        //     c=c.next;
        // }
        // ListNode d=s.peek();
        // return head;
        ListNode prev = null;
    ListNode current = head;

    while (current != null) {
        ListNode nextNode = current.next; 
        current.next = prev;              
        prev = current;                   
        current = nextNode;               
    }
    
    return prev;
}
}