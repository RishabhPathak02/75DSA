package Day17.IntersectionTwoArrays;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int[] IntersectionOfArray(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums1) {
            set.add(x);
        }
        Set<Integer> resultSet = new HashSet<>();
        for (int x : nums2) {
            if (set.contains(x)) {
                resultSet.add(x);
            }
        }
        int[] result = new int[resultSet.size()];
        int indx = 0;
        for (int x : resultSet) {
            result[indx++] = x;
        }
        // int[]result = resultSet.stream().mapToInt(Integer :: intValue).toArray();
        return result;
    }
}
