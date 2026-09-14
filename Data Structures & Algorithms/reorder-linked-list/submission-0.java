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
    public void reorderList(ListNode head) {
        ListNode f = head;
        ListNode mid = head;

        while (f.next != null && f.next.next != null) {
            mid = mid.next;
            f = f.next.next;
        }
       
       ListNode second = mid.next;
       mid.next = null;

        //reversing second list
       
       ListNode prev = null;
       while(second!=null){
        ListNode temp = second.next;
        second.next = prev;
        prev = second;
        second = temp;
       }
       second = prev;
       f = head;

       //merging 2 lists
       
    while(second!=null){
        
         ListNode firstNext = f.next;
            ListNode secondNext = second.next;

            f.next = second;
            second.next = firstNext;

            f = firstNext;
            second = secondNext;

    }
    // return head;

    }
}
