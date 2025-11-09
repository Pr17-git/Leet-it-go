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
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer>l=new ArrayList<>();
        ListNode c=head;
        while(c!=null){
            l.add(c.val);
            c=c.next;
        }
        List<Integer>t=new ArrayList<>();
        int y=0;
        boolean b=true;
        List<Integer>m=new ArrayList<>();
        while(b!=false){
            int h=((k*y)+k-1);
            for(int i=((k*y)+k-1);i>=(k*y);i--){
                m.add(l.get(i));
            }
            //System.out.println(m);
            y++;
            if(((k*y)+k-1)>=l.size()){
                for(int i=h+1;i<l.size();i++){
                m.add(l.get(i));
            }
            //System.out.println(m);
                b=false;
            }
        }
        ListNode h=null;
        ListNode e=null;
        for(int j:m){
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