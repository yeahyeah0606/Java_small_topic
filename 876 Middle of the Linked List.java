// 876. Middle of the Linked List

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fastPtr = head, slowPtr = head;
        while( fastPtr != null && fastPtr.next != null ){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr; 
    }
}