package Day60;
import java.util.PriorityQueue;
public class Sol {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<Integer>pq = new PriorityQueue<>();
            for(ListNode x : lists){
                while(x != null){
                    pq.offer(x.val);
                    x = x.next ;
                }
            }
            ListNode dummy = new ListNode(-1);
            ListNode temp = dummy ;
            while(!pq.isEmpty()){
                temp.next = new ListNode(pq.poll());
                temp = temp.next ;
            }
            return dummy.next ;
        }
    }
}
