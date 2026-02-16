package Day41;

public class RotateList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode rotateRight(ListNode head, int k) {

            if (head == null || head.next == null || k == 0)
                return head;

            // Step 1: Find length
            ListNode temp = head;
            int n = 1;

            while (temp.next != null) {
                n++;
                temp = temp.next;
            }

            // Step 2: Make circular
            temp.next = head;

            // Step 3: Reduce k
            k = k % n;

            if (k == 0) {
                temp.next = null;
                return head;
            }

            // Step 4: Find new tail
            int step = n - k;
            ListNode tail = head;

            for (int i = 1; i < step; i++) {
                tail = tail.next;
            }

            // Step 5: Break circle
            ListNode newHead = tail.next;
            tail.next = null;

            return newHead;
        }
    }
}
