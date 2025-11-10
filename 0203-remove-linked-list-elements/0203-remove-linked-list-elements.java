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
    public ListNode removeElements(ListNode head, int val) {
        ListNode h=null;
        ListNode e=null;
        while(head!=null){
            if(head.val!=val){
                if(h==null){
                    h=head;
                    e=head;
                }else{
                    e.next=head;
                    e=head;
                }
            }
            head=head.next;
        }
        if(e!=null) e.next=null;   
        return h;
    }
}