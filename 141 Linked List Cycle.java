// 141. Linked List Cycle


public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slowPtr = head, fastPtr = head;
        while( fastPtr.next != null && fastPtr.next.next != null ){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }
}