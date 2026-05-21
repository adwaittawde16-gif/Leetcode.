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
    public ListNode middleNode(ListNode head) {
        ListNode front = head;
        ListNode rear = head;
        ListNode next;
        while(front!=null && front.next!=null)
        {
            rear = rear.next;
            front = front.next.next;
        }
        return rear;
    }
}