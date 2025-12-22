package Day2.MoveZeroes;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[]nums = {0,1,0,3,12};
//        Optimised.moveZero(nums);
        Brute.moveZero(nums);
        System.out.println(Arrays.toString(nums));
    }
}
