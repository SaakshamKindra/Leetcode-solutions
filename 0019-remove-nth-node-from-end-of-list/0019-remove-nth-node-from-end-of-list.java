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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d=new ListNode(0,head),p=d,q=d;
        for(int i=0;i<n;i++) q=q.next;
        while(q.next!=null){p=p.next;q=q.next;}
        p.next=p.next.next;
        return d.next;
    }
}