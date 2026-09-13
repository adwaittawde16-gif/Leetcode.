/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int sizeA = sizeLL(headA);
        int sizeB = sizeLL(headB);

        ListNode ptrA = headA;
        ListNode ptrB = headB;

        if (sizeA > sizeB) {
            int diff = sizeA - sizeB;
            while (diff > 0) {
                ptrA = ptrA.next;
                diff--;
            }
        } else {
            int diff = sizeB - sizeA;
            while (diff > 0) {
                ptrB = ptrB.next;
                diff--;
            }
        }

        while (ptrA != ptrB) {
            ptrA = ptrA.next;
            ptrB = ptrB.next;
        }

        return ptrA;
    }

    public int sizeLL(ListNode head) {
        int count = 0;
        ListNode ptr = head;

        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }

        return count;
    }
}