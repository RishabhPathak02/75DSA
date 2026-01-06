package Day17.TopKElement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]nums = {1,1,1,2,2,3} ;
        int k = 2 ;
        int[]result1 = Brute.topKFrequent(nums , k);
        int[]result2 = Optimised.topKFrequent(nums , k);
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}
