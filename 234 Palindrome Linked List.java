//234. Palindrome Linked List



class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while( fast!= null && fast.next!= null ){
            fast = fast.next.next;
            slow = slow.next;
        }

        // 奇數
        if(fast != null){
            slow = slow.next;
        }

        slow = reverse(slow);
        fast = head;
        while( slow!= null ){
            if( fast.val != slow.val ){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode preNode = null;
        while( head != null ){
            ListNode next = head.next;
            head.next = preNode;
            preNode = head;
            head = next;
        }
        return preNode;
    }
}