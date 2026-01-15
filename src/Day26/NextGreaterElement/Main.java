package Day26.NextGreaterElement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]nums1 = {4,1,2} ;
        int[]nums2 = {1,3,4,2} ;
        int[]out1 = Brute.getNextGreaterElement(nums1  , nums2);
        int[]out2 = Optimised.getNextGreaterElement(nums1  , nums2);
        System.out.println(Arrays.toString(out1));
        System.out.println(Arrays.toString(out2));

    }
}
