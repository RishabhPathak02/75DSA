package Day3.ProductOfArraysExceptSelf;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[]nums = {1,2,3,4};
        int[]output1 = Brute.productOfElement(nums);
        int[]output2 = Optimised.productOfElement(nums);
        int[]output3 = Optimised2.productOfElement(nums);
        System.out.println(Arrays.toString(output1));
        System.out.println(Arrays.toString(output2));
        System.out.println(Arrays.toString(output3));
    }
}
