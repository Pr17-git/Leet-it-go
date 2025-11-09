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
    public ListNode removeNthFromEnd(ListNode head, int m) {
        List<Integer>l=new ArrayList<>();
        ListNode c=head;
        while(c!=null){
            l.add(c.val);
            c=c.next;
        }
        System.out.println(l);
        ListNode h=null;
        ListNode e=null;
        for(int j=0;j<l.size();j++){
            if(l.size()-m!=j){
            ListNode n=new ListNode(l.get(j));
            if(h==null){
                h=n;
                e=n;
            }else{
                e.next=n;
                e=n;
            }
            }
        }
        return h;
    }
}