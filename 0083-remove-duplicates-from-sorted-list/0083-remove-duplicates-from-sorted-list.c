/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    struct ListNode* prev,*p;
    if(!head)return NULL;
    prev=head;
    p=prev->next;
    while(p){
        if(prev->val!=p->val){
            prev->next=p;
            prev=p;

        }
        p=p->next;

    }
    prev->next=NULL;

    return head;
    
}