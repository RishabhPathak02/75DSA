package Day6.RemoveDuplicatesFromSortedArray;

import java.util.HashSet;
import java.util.Set;

public class brute {
    public static int removeDuplicatesFromSortedArray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums)set.add(x);
        return set.size();
    }
}
