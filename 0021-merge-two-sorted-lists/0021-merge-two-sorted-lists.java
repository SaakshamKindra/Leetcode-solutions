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
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode d=new ListNode(0),p=d;
        while(a!=null&&b!=null){
            if(a.val<b.val){p.next=a;a=a.next;}
            else{p.next=b;b=b.next;}
            p=p.next;
        }
        p.next=a!=null?a:b;
        return d.next;
    }
}