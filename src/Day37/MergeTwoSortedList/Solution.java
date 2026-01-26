package Day37.MergeTwoSortedList;

public class Solution {

    // Definition for singly-linked list.
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

    static class Sol {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode dummy = new ListNode(-1);
            ListNode temp = dummy;

            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    temp.next = list1;
                    list1 = list1.next;
                } else {
                    temp.next = list2;
                    list2 = list2.next;
                }
                temp = temp.next;
            }

            // Attach remaining nodes
            temp.next = (list1 != null) ? list1 : list2;

            return dummy.next;
        }
    }

    // Helper method to print linked list
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
