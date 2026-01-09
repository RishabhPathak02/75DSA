package Day20.ThreeSum;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[]nums = {-1,0,1,2,-1,-4}  ;
        List<List<Integer>>result1 = Brute.threeSum(nums);
        List<List<Integer>>result2 = Optimised.threeSum(nums);
        System.out.println(Arrays.asList(result1));
        System.out.println(Arrays.asList(result2));
    }
}
