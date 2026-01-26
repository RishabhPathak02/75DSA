package Day37.RemoveNthNode;

public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        Solution.ListNode head =
                new Solution.ListNode(1,
                        new Solution.ListNode(2,
                                new Solution.ListNode(3,
                                        new Solution.ListNode(4,
                                                new Solution.ListNode(5)))));

        // Remove 2nd node from end
        head = solution.removeNthFromEnd(head, 2);

        // Print updated list
        printList(head);
    }

    private static void printList(Solution.ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
