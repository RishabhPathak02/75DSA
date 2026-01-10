package Day21.SquareOfSortedArray;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[]nums1 = {-4,-1,0,3,10} ;
        int[]nums2 = {-4,-1,0,3,10} ;
        int[]result1 = Brute.sortedSquares(nums1);
        int[]result2 = Optimised.sortedSquares(nums2);
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}
