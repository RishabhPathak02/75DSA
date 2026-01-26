package Day37.MergeTwoSortedList;

public class Main {
    // MAIN METHOD
    public static void main(String[] args) {
        // list1 = 1 -> 3 -> 5
        Solution.ListNode list1 = new Solution.ListNode(1,
                new Solution.ListNode(3,
                        new Solution.ListNode(5)));

        // list2 = 2 -> 4 -> 6
        Solution.ListNode list2 = new Solution.ListNode(2,
                new Solution.ListNode(4,
                        new Solution.ListNode(6)));

        Solution.Sol solution = new Solution.Sol();
        Solution.ListNode mergedList = solution.mergeTwoLists(list1, list2);

        Solution.printList(mergedList);
    }
}
