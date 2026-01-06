package Day17.TopKElement;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Optimised {

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int x : map.keySet()) {
            pq.offer(x);
            if (pq.size() > k)
                pq.poll();
        }
        int[] result = new int[k];
        int index = 0;
        while (k-- > 0) {
            result[index++] = pq.poll();
        }
        return result;
    }
}
