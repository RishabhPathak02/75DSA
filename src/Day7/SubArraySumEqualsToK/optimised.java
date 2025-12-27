package Day7.SubArraySumEqualsToK;

import java.util.HashMap;

public class optimised {
    public static int findSubArray(int[] nums, int k) {
        HashMap<Integer , Integer>map = new HashMap<>();
        map.put(0,1);
        int count = 0 , sum = 0 ;
        for(int x : nums){
            sum += x ;
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum , map.getOrDefault(sum , 0)+1);
        }
        return count;
    }
}
