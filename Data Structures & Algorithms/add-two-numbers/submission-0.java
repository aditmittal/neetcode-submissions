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
    public ListNode reverse(ListNode l1){
        if(l1==null || l1.next == null)return l1;

        ListNode prev = null;
        ListNode curr = l1;
        while(curr!=null){
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // l1 = reverse(l1);
        // l2 = reverse(l2);

        int carry = 0;
        int sum=0;

        ListNode ans = new ListNode(0);
        ListNode ansHead = ans;


        while(l1!=null || l2!=null||carry!=0){
             int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            sum = x + y + carry;
            carry = sum/10;

            ans.next = new ListNode(sum%10);
            ans = ans.next;
            
            if(l1!=null)l1 = l1.next;
            if(l2!=null)l2 = l2.next;
            }

        return ansHead.next;
    }
}
