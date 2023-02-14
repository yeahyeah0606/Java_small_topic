//83. Remove Duplicates from Sorted List

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode currentNode = head;
        while( currentNode.next != null ){
            if( currentNode.next.val == currentNode.val ){
                currentNode.next = currentNode.next.next;
            }else{
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}

/////

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if( head == null || head.next == null ){
            return head;
        }
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head ;
    }
}
