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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode h=head;
        ListNode e=head;
        int u=0;
        try{
            u=head.val;
        }catch(Exception E){
            return head;
        }
        head=head.next;
        while(head!=null){
                if(head.val!=u){
                    e.next=head;
                    e=head;
                    u=head.val;
                }
            head=head.next;
        }
        if(e!=null) e.next=null;
        return h;
    }
}