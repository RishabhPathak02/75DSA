package Day36.ReverseLinkedList;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create linked list: 1 -> 2 -> 3 -> 4 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Step 2: Call reverseList
        Solution sol = new Solution();
        ListNode newHead = sol.reverseList(head);

        // Step 3: Print reversed linked list
        ListNode temp = newHead;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
