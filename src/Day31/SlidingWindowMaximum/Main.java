package Day31.SlidingWindowMaximum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]nums = {1,3,-1,-3,5,3,6,7} ;
        int k = 3 ;
        int[]out1 = Brute.maxSlidingWindow(nums , k);
        int[]out2 = Optimised.maxSlidingWindow(nums , k);
        System.out.println(Arrays.toString(out1));
        System.out.println(Arrays.toString(out2));
    }
}
