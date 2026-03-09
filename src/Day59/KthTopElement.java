package Day59;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class KthTopElement {
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int x : nums){
                map.put(x,map.getOrDefault(x,0)+1);
            }
            List<Integer>list = new ArrayList<>(map.keySet());
            list.sort((a,b)->map.get(b)-map.get(a));
            int[]res = new int[k];
            for(int i = 0 ; i<k ; i++){
                res[i] = list.get(i);
            }
            return res ;
        }
    }
}
