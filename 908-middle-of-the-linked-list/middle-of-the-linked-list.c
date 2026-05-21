/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode *front = head;
    struct ListNode *rear = head;
    struct ListNode *next;
    while(front!=NULL && front->next!=NULL)
    {
        rear = rear->next;
        front = front->next->next;
    }
    return rear;
}