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
          ListNode dummy = new ListNode(0);
        dummy.next = head;
        int len = n;
          ListNode temp = dummy;
        ListNode rem = dummy;

        for(int i=0;i<=n;i++){
            temp = temp.next;
        }


        while(temp!=null){
            rem = rem.next;
            temp = temp.next;
        }
        rem.next = rem.next.next;
        

        return dummy.next;



    }
}
