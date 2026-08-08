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
    public ListNode mergeKLists(ListNode[] a) {
        PriorityQueue<ListNode> q=new PriorityQueue<>((x,y)->x.val-y.val);
        for(ListNode x:a) if(x!=null) q.add(x);
        ListNode d=new ListNode(0),p=d;
        while(!q.isEmpty()){
            ListNode x=q.poll();
            p.next=x;p=p.next;
            if(x.next!=null) q.add(x.next);
        }
        return d.next;
    }
}