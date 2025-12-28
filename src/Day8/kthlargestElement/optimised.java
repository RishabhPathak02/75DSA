package Day8.kthlargestElement;

import java.util.PriorityQueue;

public class optimised {
    public static int kthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int x : nums){
            pq.add(x);
            if(pq.size() > k)pq.poll();
        }
        return pq.peek();
    }
}
