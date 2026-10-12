
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Find the middle of the list
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        ListNode secondHalf = reverseList(slow.next);
        slow.next = secondHalf;

        // Compare both halves
        ListNode first = head;
        ListNode second = secondHalf;
        boolean isPalindrome = true;

        while (second != null) {
            if (first.val != second.val) {
                isPalindrome = false;
                break;
            }

            first = first.next;
            second = second.next;
        }

        // Restore the original list
        slow.next = reverseList(secondHalf);

        return isPalindrome;
    }

    private ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        return previous;
    }
}
