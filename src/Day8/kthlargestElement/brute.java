package Day8.kthlargestElement;

import java.util.Arrays;

public class brute {
    public static int kthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
