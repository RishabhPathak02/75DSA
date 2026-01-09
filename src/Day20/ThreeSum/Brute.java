package Day20.ThreeSum;

import java.util.*;

public class Brute {
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(nums[i] + nums [j] + nums[k] == 0){
                        ArrayList<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                        result.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}
