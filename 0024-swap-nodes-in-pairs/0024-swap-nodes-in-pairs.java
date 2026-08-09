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
    public ListNode swapPairs(ListNode h) {
        ListNode d=new ListNode(0,h);
        for(ListNode p=d;p.next!=null&&p.next.next!=null;p=p.next.next){
            ListNode a=p.next,b=a.next;
        p.next=b;
        a.next=b.next;
        b.next=a;
        }
        return d.next;
    }

}