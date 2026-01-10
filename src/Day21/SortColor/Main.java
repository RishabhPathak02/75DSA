package Day21.SortColor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []nums = {2,0,2,1,1,0} ;
        Brute.sortColors(nums);
        Optimised.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
