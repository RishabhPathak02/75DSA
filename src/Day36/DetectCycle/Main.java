package Day36.DetectCycle;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create nodes
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        // Step 2: Link nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Step 3: Create cycle (pos = 1 → node2)
        node4.next = node2;

        // Step 4: Call hasCycle
        Solution obj = new Solution();
        boolean result = obj.hasCycle(node1);

        // Step 5: Print result
        System.out.println("Has Cycle: " + result);
    }
}
