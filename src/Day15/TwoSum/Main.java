package Day15.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]nums = {2,7,11,15};
        int target = 9 ;
        int[]out = Solution.twoSum(nums , target);
        System.out.println(Arrays.toString(out));
    }
}
