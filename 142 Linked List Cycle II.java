// 142. Linked List Cycle II

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode slowPtr = head, fastPtr = head;
        boolean loopExicts = false;
        while( fastPtr.next != null && fastPtr.next.next != null ){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr){
                loopExicts = true;
                break;
            }
        }
        if(loopExicts){
            slowPtr = head;
            while( slowPtr != fastPtr ){
                fastPtr = fastPtr.next;
                slowPtr = slowPtr.next;
            }
            return slowPtr;
        }
        return null;
    }
}