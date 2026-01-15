package Day26.NextGreaterElement2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]nums = {1,2,1} ;
        int[]out1 = Brute.nextGreaterElements(nums);
        int[]out2 = Optimised.nextGreaterElements(nums);
        System.out.println(Arrays.toString(out1));
        System.out.println(Arrays.toString(out2));
    }
}
