package Day16.longetsConsecutiveSequence;

import java.util.HashSet;

public class brute {
    public static int longestSequence(int[] nums) {
        int longestSeq = 0 ;
        HashSet<Integer>set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int num : nums){
            int current = num ;
            int count = 1 ;
            while(set.contains(current+1)){
                count++ ;
                current++ ;
            }
            longestSeq = Math.max(longestSeq , count);
        }
        return longestSeq ;
    }
}
