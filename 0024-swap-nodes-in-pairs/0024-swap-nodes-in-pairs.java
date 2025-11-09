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
    public ListNode swapPairs(ListNode head) {
        List<Integer>l=new ArrayList<>();
        ListNode c=head;
        while(c!=null){
            l.add(c.val);
            c=c.next;
        }
        for(int i=0;i<l.size()-1;i++){
            int t=l.get(i);
            l.set(i,l.get(i+1));
            l.set(i+1,t);
            i++;
        }
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