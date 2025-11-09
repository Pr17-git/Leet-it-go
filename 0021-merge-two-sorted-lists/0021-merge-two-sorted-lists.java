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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer>l=new ArrayList<>();
        ListNode c=l1;
        while(c!=null){
            l.add(c.val);
            c=c.next;
        }
        c=l2;
        while(c!=null){
            l.add(c.val);
            c=c.next;
        }
        Collections.sort(l);
        ListNode h=null;
        ListNode e=null;
        for(int j:l){
            ListNode n=new ListNode(j);
            if(h==null){
                h=n;
                e=n;
            }else{
                e.next=n;
                e=n;
            }
        }
        return h;
    }
}